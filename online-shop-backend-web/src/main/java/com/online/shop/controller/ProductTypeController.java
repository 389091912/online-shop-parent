package com.online.shop.controller;

import com.github.pagehelper.PageInfo;
import com.online.shop.exception.ProductTypeExistException;
import com.online.shop.pojo.ProductType;
import com.online.shop.service.ProductService;
import com.online.shop.service.ProductTypeService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:33
 */
@Controller

@RequestMapping("/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @ModelAttribute("tests")
    public List<ProductType> findAll() {
        System.out.println( "ProductTypeController.findAll" );
        return productTypeService.findAllProductType();
    }

    @ResponseBody
    @RequestMapping("/test")
    public List<ProductType> text(HttpServletRequest request) {

        List<ProductType> productType = productTypeService.findAllProductType();
        request.getSession().setAttribute( "productTypes",productType );

        return productTypeService.findAllProductType();
    }

    @RequestMapping("/test11")
    public String test11() {
          System.out.println( "ProductTypeController.findAll" );
//          model.addAttribute( "tests", productTypeService.findAllProductType());
        return "success";
    }
    @RequestMapping("/findAllByAjax/{pageNo}")
    public String findAllByAjax(Model model,@PathVariable("pageNo") Integer pageNo) {
        if (StringUtils.isEmpty( pageNo )) {
            pageNo = 1;
        }
        System.out.println( pageNo );

        PageInfo<ProductType> pageInfo = productTypeService.findByAjax( pageNo, new ProductType() );

        model.addAttribute( "types", pageInfo.getList() );

        return "/productTypeManager";
    }

    @ResponseBody
    @GetMapping("/findType/{id}")
    public Object findType(@PathVariable Integer id,Model model) {
        System.out.println("...."+id);
        ProductType productType = productTypeService.findByKey( id );
        System.out.println(productType);
        model.addAttribute( "productType", productType );

        return productType;
    }


   // @PostMapping("/add")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addProductType( Integer pageNo,String name,Model model) {

        System.out.println( "ProductTypeController.addProductType" );
        try {
            productTypeService.addProductType( name );
            return "forward:/productType/findAllByAjax/" + pageNo;
        } catch (ProductTypeExistException e) {
            e.printStackTrace();
            model.addAttribute( "errorMsg", e.getMessage() );
            return "forward:/productType";
        }

    }

    @DeleteMapping(value = "/deleteType/{id}/{pageNo}")
    public String deleteType(@PathVariable("id") Integer id, @PathVariable Integer pageNo) {
        productTypeService.removeProductType( id );
        System.out.println( "ProductTypeController.deleteType" );
        return "forward:/productType/findAllByAjax/" + pageNo;
    }

    @RequestMapping(value = "/modifyStatus/{id}/{pageNo}",method = RequestMethod.PUT)
    public String modifyStatus(@PathVariable Integer id,@PathVariable Integer pageNo) {

        productTypeService.modifyStatus( id );

        return "forward:/productType/findAllByAjax/" + pageNo;
    }

    @PutMapping("/modifyType/{productType}/{pageNo}")
    public String modifyType(@PathVariable ProductType productType,@PathVariable Integer pageNo) {
        try {
            productTypeService.modifyProductType(productType);
        } catch (ProductTypeExistException e) {
            e.printStackTrace();
        }
        return "forward:/productType/findAllByAjax/" + pageNo;
    }

}
