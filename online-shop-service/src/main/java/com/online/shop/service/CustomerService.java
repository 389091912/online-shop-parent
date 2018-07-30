package com.online.shop.service;

import com.github.pagehelper.PageInfo;
import com.online.shop.exception.CustomerErrorException;
import com.online.shop.exception.CustomerNotFountException;
import com.online.shop.pojo.Customer;
import com.online.shop.vo.CustomerVo;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:39
 */
public interface CustomerService {

    PageInfo<Customer> findAllByAjax(int pageNo, CustomerVo customerVo);

    Customer findLoginNameAndPassword(String loginName, String password) throws CustomerNotFountException, CustomerErrorException;

}
