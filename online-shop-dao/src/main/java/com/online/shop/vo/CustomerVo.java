package com.online.shop.vo;

import io.swagger.models.auth.In;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-30
 * Time: 3:24
 */
public class CustomerVo implements Serializable {

    private static final long serialVersionUID = -28113261177785757L;
    private String name;
    private String loginName;
    private String phone;
    private String address;
    private Integer isValid;
    private Integer pageNo;


    public CustomerVo() {
    }

    public CustomerVo(String name, String loginName, String phone, String address, Integer isValid, Integer pageNo) {
        this.name = name;
        this.loginName = loginName;
        this.phone = phone;
        this.address = address;
        this.isValid = isValid;
        this.pageNo = pageNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "CustomerVo{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", isValid=" + isValid +
                ", pageNo=" + pageNo +
                '}';
    }
}
