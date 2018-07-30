package com.online.shop.controller;

import com.github.pagehelper.PageInfo;
import com.online.shop.pojo.Product;
import com.online.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:33
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/addOrModifyProduct")
    public String addOrModifyProduct(Product product, @RequestParam CommonsMultipartFile file, HttpSession session) {

        System.out.println( product );

        if (null == product.getId()) {
            String path = session.getServletContext().getRealPath( "upload")+"/"+ LocalDate.now().toString().replace( "-","/" )+"/";
            System.out.println( path + file.getOriginalFilename() );
            System.out.println( LocalDate.now().toString().replace( "-","/" )+"/");
            System.out.println( file.getOriginalFilename() );
            System.out.println( file.getSize() );
            String image = path + "";
            product.setImage( "upload" + "/" + LocalDate.now().toString().replace( "-", "/" ) + "/" + file.getOriginalFilename() );
            File f = new File(path);
            f.mkdirs();//创建所有文件夹

            try {

                file.transferTo( new File( path, file.getOriginalFilename() ) );
                productService.addProduct( product );

            } catch (IOException e) {
                e.printStackTrace();
            }
            return "redirect:/productManager";
        } else {

            productService.modifyProduct( product );

            return "forward:/productManager";
        }

    }


    @RequestMapping("/findAllByAjax")
    @ResponseBody
    public PageInfo<Product> findAllByAjax(Integer pageNo, Model model) {

        System.out.println( "ProductController.findAllByAjax" );
        if (StringUtils.isEmpty( pageNo )) {
            pageNo = 1;
        }

        model.addAttribute( "productType" );
        return productService.findAllProduct( pageNo );
    }

    @ResponseBody
    @GetMapping("/find/{id}")
    public Object findProduct(@PathVariable Integer id) {
        Product product = productService.findByKey( id );
        System.out.println( product );
        return product;
    }

}
