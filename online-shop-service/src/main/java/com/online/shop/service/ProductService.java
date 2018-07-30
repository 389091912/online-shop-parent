package com.online.shop.service;

import com.github.pagehelper.PageInfo;
import com.online.shop.pojo.Product;
import com.online.shop.vo.ProductVo;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:38
 */
public interface ProductService {

    void addProduct(Product product);

    void modifyProduct(Product product);

    Product findByName(String productName);

    PageInfo<Product> findAllProduct(int pageNo);

    Product findByKey(Integer id);

    PageInfo<Product> findAllByExample(int pageNo, ProductVo productVo);


}
