package com.online.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.online.shop.config.Constant;
import com.online.shop.dao.ProductMapper;
import com.online.shop.pojo.Product;
import com.online.shop.service.ProductService;
import com.online.shop.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:42
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productDao;


    @Override
    public void addProduct(Product product) {

        productDao.insertSelective( product );
    }

    @Override
    public void modifyProduct(Product product) {

    }

    @Override
    public Product findByName(String productName) {
        return null;
    }

    @Override
    public PageInfo<Product> findAllProduct(int pageNo) {

        PageHelper.startPage( pageNo, Constant.PAGE_SIZE );

        List<Product> productList = productDao.selectAllProduct();

        productList.forEach( s -> System.out.println( "  " + s ) );

        return new PageInfo<>(productList);
    }

    @Override
    public Product findByKey(Integer id) {

        return productDao.selectByPrimaryKey( id );
    }

    @Override
    public PageInfo<Product> findAllByExample(int pageNo, ProductVo productVo) {
        return null;
    }
}

