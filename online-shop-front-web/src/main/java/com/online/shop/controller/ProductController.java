package com.online.shop.controller;

import com.github.pagehelper.PageInfo;
import com.online.shop.pojo.Product;
import com.online.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-30
 * Time: 22:44
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

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

}
