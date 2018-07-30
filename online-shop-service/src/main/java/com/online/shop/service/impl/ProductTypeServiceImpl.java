package com.online.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.online.shop.config.Constant;
import com.online.shop.dao.ProductTypeMapper;
import com.online.shop.exception.ProductTypeExistException;
import com.online.shop.pojo.ProductType;
import com.online.shop.pojo.ProductTypeExample;
import com.online.shop.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-22
 * Time: 16:43
 */
@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeDao;


    @Override
    public void addProductType(String name) throws ProductTypeExistException {

        ProductTypeExample example = new ProductTypeExample();
        example.or().andNameEqualTo( name );

        List<ProductType> list = productTypeDao.selectByExample( example );
        if (!list.isEmpty()) {
            System.out.println("该类型已存在");
            throw new ProductTypeExistException("该类型已存在");
        }
        System.out.println( "ProductTypeServiceImpl.addProductType" );
        ProductType productType = new ProductType();
        productType.setName( name );
        productType.setStatus( Constant.STATUS_ENABLE );
        productTypeDao.insertSelective( productType );

    }

    @Override
    public List<ProductType> findAllProductType() {

        List<ProductType> types = productTypeDao.selectAllProductType();
        types = types.stream()
                        .filter( productType -> productType.getStatus() == 0 )
                         .collect( toList() );
        types.forEach( type -> System.out.println( "结果：" + type ) );

        return types;
    }

    @Override
    public PageInfo<ProductType> findByAjax(int pageNo, ProductType productType) {


        PageHelper.startPage( pageNo, Constant.PAGE_SIZE );

        ProductTypeExample example = new ProductTypeExample();

        List<ProductType> typeList = productTypeDao.selectByExample( example );

        typeList.forEach(type-> System.out.println("结果： "+type) );

        return new PageInfo<>( typeList);
    }


    @Override
    public ProductType findByName(String name) {

        ProductTypeExample example = new ProductTypeExample();
        example.or().andNameEqualTo( name );
        List<ProductType> productTypes = productTypeDao.selectByExample( example );


        return productTypes.get( 0 );
    }
    
    @Override
    public ProductType findByKey(Integer id) {
        return productTypeDao.selectByPrimaryKey( id );
    }

    @Override
    public void modifyProductType(ProductType productType) throws ProductTypeExistException {

        ProductTypeExample example = new ProductTypeExample();
        example.or().andNameEqualTo( productType.getName());
        List<ProductType> productTypes = productTypeDao.selectByExample( example );
        if (!productTypes.isEmpty() && !productTypes.get( 0 ).getId().equals( productType.getId() )) {
            throw new ProductTypeExistException( "该类型已存在" );
        }
        productTypeDao.updateByPrimaryKeySelective( productType );

    }

    @Override
    public void removeProductType(Integer id) {

        productTypeDao.deleteByPrimaryKey( id );

    }

    @Override
    public void modifyStatus(Integer id) {
        ProductType productType = productTypeDao.selectByPrimaryKey( id );
        productType.setStatus( Constant.STATUS_DISABLE - productType.getStatus() );
        productTypeDao.updateByPrimaryKeySelective( productType );
    }

}
