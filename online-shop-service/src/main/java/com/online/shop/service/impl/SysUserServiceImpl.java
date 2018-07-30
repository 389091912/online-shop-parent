package com.online.shop.service.impl;

import com.online.shop.config.Constant;
import com.online.shop.dao.SysuserMapper;
import com.online.shop.exception.SysUserNotFoundException;
import com.online.shop.pojo.Sysuser;
import com.online.shop.pojo.SysuserExample;
import com.online.shop.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-21
 * Time: 2:58
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysuserMapper sysuserDao;


    @Override
    public Sysuser findByUsernameAndPassword(String loginName, String password) throws SysUserNotFoundException {

        SysuserExample example = new SysuserExample();

        example.or().andLoginNameEqualTo( loginName );

        List<Sysuser> sysusers = sysuserDao.selectByExample( example );

        System.out.println("查询User结果："+sysusers.isEmpty());

        if (sysusers.isEmpty()) {
            throw new SysUserNotFoundException( "用户不存在" );
        }else{
            if (!password.equals( sysusers.get( 0 ).getPassword() )) {
                throw new SysUserNotFoundException( "密码错误" );
            }
            else if (Constant.STATUS_DISABLE == sysusers.get( 0 ).getIsValid()) {
                throw new SysUserNotFoundException( "用户名已失效" );
            }
        }

        return sysusers.get( 0 );
    }
}
