package com.online.shop.service;

import com.online.shop.exception.SysUserNotFoundException;
import com.online.shop.pojo.Sysuser;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-21
 * Time: 2:58
 */
public interface SysUserService {

    Sysuser findByUsernameAndPassword(String loginName, String password) throws SysUserNotFoundException;
}
