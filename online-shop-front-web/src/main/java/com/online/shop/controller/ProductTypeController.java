package com.online.shop.controller;

import com.online.shop.pojo.ProductType;
import com.online.shop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-21
 * Time: 3:08
 */
@Controller
@RequestMapping("/productType")
public class ProductTypeController {

    @Autowired
    private ProductTypeService productTypeService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<ProductType> text(HttpServletRequest request) {

        List<ProductType> productType = productTypeService.findAllProductType();

/*
        request.getSession().setAttribute( "productTypes",productType );
*/

        return productTypeService.findAllProductType();
    }
}
