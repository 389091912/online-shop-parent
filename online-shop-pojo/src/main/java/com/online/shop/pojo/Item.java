package com.online.shop.pojo;

public class Item {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_item.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_item.product_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_item.num
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_item.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_item.order_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_item.id
     *
     * @return the value of t_item.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_item.id
     *
     * @param id the value for t_item.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_item.product_id
     *
     * @return the value of t_item.product_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_item.product_id
     *
     * @param productId the value for t_item.product_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_item.num
     *
     * @return the value of t_item.num
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_item.num
     *
     * @param num the value for t_item.num
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_item.price
     *
     * @return the value of t_item.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_item.price
     *
     * @param price the value for t_item.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_item.order_id
     *
     * @return the value of t_item.order_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_item.order_id
     *
     * @param orderId the value for t_item.order_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", productId=" + productId +
                ", num=" + num +
                ", price=" + price +
                ", orderId=" + orderId +
                '}';
    }
}