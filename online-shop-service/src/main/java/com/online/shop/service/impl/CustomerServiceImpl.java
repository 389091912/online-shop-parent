package com.online.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.online.shop.config.Constant;
import com.online.shop.dao.CustomerMapper;
import com.online.shop.exception.CustomerErrorException;
import com.online.shop.exception.CustomerNotFountException;
import com.online.shop.pojo.Customer;
import com.online.shop.pojo.CustomerExample;
import com.online.shop.service.CustomerService;
import com.online.shop.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:40
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerMapper customerDao;

    @Override
    public PageInfo<Customer> findAllByAjax(int pageNo, CustomerVo customerVo) {

        PageHelper.startPage( pageNo, Constant.PAGE_SIZE );

        List<Customer> customerList = customerDao.selectAllByAjax( customerVo );

        customerList.forEach( System.out::println );

        return new PageInfo<>( customerList );

    }

    @Override
    @Transactional(readOnly = true)
    public Customer findLoginNameAndPassword(String loginName, String password) throws CustomerNotFountException, CustomerErrorException {

        CustomerExample example = new CustomerExample();
        example.or().andLoginNameEqualTo( loginName );

        List<Customer> customerList = customerDao.selectByExample( example );

        if (customerList.isEmpty()) {
            throw new CustomerNotFountException( "用户名不存在" );
        } else {
            Customer customer = customerList.get( 0 );
            if (!customer.getPassword().equals( password )) {
                throw new CustomerErrorException( "密码错误" );
            } else if (Constant.STATUS_DISABLE == customer.getIsValid()) {
                throw new CustomerErrorException( "用户已被禁用，请联系客服" );
            }
            return customer;
        }

    }
}