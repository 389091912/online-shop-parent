package com.online.shop.pojo;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.name
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.info
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private String info;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.image
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product.product_type_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    private Integer productTypeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.id
     *
     * @return the value of t_product.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.id
     *
     * @param id the value for t_product.id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.name
     *
     * @return the value of t_product.name
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.name
     *
     * @param name the value for t_product.name
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.price
     *
     * @return the value of t_product.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.price
     *
     * @param price the value for t_product.price
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.info
     *
     * @return the value of t_product.info
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.info
     *
     * @param info the value for t_product.info
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.image
     *
     * @return the value of t_product.image
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.image
     *
     * @param image the value for t_product.image
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product.product_type_id
     *
     * @return the value of t_product.product_type_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public Integer getProductTypeId() {
        return productTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product.product_type_id
     *
     * @param productTypeId the value for t_product.product_type_id
     *
     * @mbggenerated Sat Jul 21 03:33:53 CST 2018
     */
    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}