package com.online.shop.controller;

import com.github.pagehelper.PageInfo;
import com.online.shop.config.Constant;
import com.online.shop.pojo.Customer;
import com.online.shop.service.CustomerService;
import com.online.shop.vo.CustomerVo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:34
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @RequestMapping("/findAllByAjax")
    @ResponseBody
    public PageInfo<Customer> findAllByAjax( CustomerVo customerVo, Model model) {

        System.out.println( customerVo );

        if (StringUtils.isEmpty( customerVo.getPageNo())) {
            customerVo.setPageNo( Constant.PAGE_No );
        }

        PageInfo<Customer> allByAjax = customerService.findAllByAjax(customerVo.getPageNo(), customerVo );


        return allByAjax;
    }
}




