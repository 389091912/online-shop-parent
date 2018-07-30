package com.online.shop.controller;

import com.online.shop.exception.SysUserNotFoundException;
import com.online.shop.pojo.Sysuser;
import com.online.shop.service.SysUserService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-21
 * Time: 2:54
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {


    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public String login(String loginName, String password,HttpServletRequest request) {
        System.out.println( "SysUserController.login" );
        try {
            Sysuser sysuser = sysUserService.findByUsernameAndPassword( loginName, password );
            request.getSession().setAttribute( "sysUser", sysuser );
            System.out.println(sysuser);
            return "redirect:/main";
        } catch (SysUserNotFoundException e) {
            e.printStackTrace();
            request.setAttribute( "errorMsg", e.getMessage() );
            System.out.println( e.getMessage() );
            return "/showLogin";
        }
    }

    @RequestMapping("/loginOut")
    public String outLogin(HttpServletRequest request) {
        System.out.println( "SysUserController.outLogin" );
        HttpSession session = request.getSession();
        Sysuser sysUser = (Sysuser) session.getAttribute( "sysUser" );
        if (null != sysUser) {
            session.removeAttribute( "sysUser" );
        }
        session.invalidate();
        return "redirect:/showLogin";
    }
    
    
    
}
