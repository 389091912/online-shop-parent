package com.online.shop.service;

import com.github.pagehelper.PageInfo;
import com.online.shop.exception.ProductTypeExistException;
import com.online.shop.pojo.Product;
import com.online.shop.pojo.ProductType;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:38
 */
public interface ProductTypeService {

    /**
     * 添加产品类型
     * @param name
     */
    void addProductType(String name) throws ProductTypeExistException;

    /***
     * 查找所有的商品类型
     * @return
     */
    List<ProductType> findAllProductType();

    /**
     * 分页查找所有的商品类型 使用 ajax 和
     * @return
     */
    PageInfo<ProductType> findByAjax(int pageNo,ProductType productType);

    /**
     * 根据商品类型名称 查找商品类型
     * @param name
     * @return
     */
    ProductType findByName(String name);

    /**
     * 根据商品类型的编号查找商品
     * @param id
     * @return
     */
    ProductType findByKey(Integer id);

    /**
     * 修改商品类型
     * @param productType
     */
    void modifyProductType(ProductType productType) throws ProductTypeExistException;

    /**
     *  删除商品类型
     * @param id
     */
    void removeProductType(Integer id );

    void modifyStatus(Integer id);



}
