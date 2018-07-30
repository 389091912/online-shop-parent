package com.online.shop.vo;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-23
 * Time: 0:30
 */
public class ProductVo implements Serializable {

    private String name;

    private Double minPrice;

    private Double maxPrice;

    private Integer productTypeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public String toString() {
        return "ProductVo{" +
                "name='" + name + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", productTypeId=" + productTypeId +
                '}';
    }
}
