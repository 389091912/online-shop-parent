package com.online.shop.controller;

import com.online.shop.exception.CustomerErrorException;
import com.online.shop.exception.CustomerNotFountException;
import com.online.shop.pojo.Customer;
import com.online.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-30
 * Time: 22:43
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;



    @RequestMapping("/show-main")
    public String showMain() {

        return "redirect:/front-main";
    }


    @PostMapping("/login")
    public String login(String loginName, String password, HttpSession session, Model model) {

        System.out.println( "CustomerController.login" );
        try {
            Customer customer = customerService.findLoginNameAndPassword( loginName, password );
            session.setAttribute( "user", customer );

            System.out.println( customer );
            return "forward:/customer/show-main";
        } catch (CustomerNotFountException | CustomerErrorException e) {

            e.printStackTrace();
            model.addAttribute( "errorMsg", e.getMessage() );

            return "main";
        }


    }


}

