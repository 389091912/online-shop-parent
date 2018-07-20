package com.online.shop.pojo;

import java.util.Date;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.no
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private String no;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.customer_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.create_date
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.no
     *
     * @return the value of t_order.no
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public String getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.no
     *
     * @param no the value for t_order.no
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.customer_id
     *
     * @return the value of t_order.customer_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.customer_id
     *
     * @param customerId the value for t_order.customer_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.price
     *
     * @return the value of t_order.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.price
     *
     * @param price the value for t_order.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.create_date
     *
     * @return the value of t_order.create_date
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.create_date
     *
     * @param createDate the value for t_order.create_date
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}