package com.practice.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2024-03-15 15:24:56
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = -68797763841822593L;
    /**
     * 商品id
     */
    private Long id;
    /**
     * 名称
     */
    private String goodsName;
    /**
     * 标题
     */
    private String goodsTitle;
    /**
     * 图片
     */
    private String goodsImg;
    /**
     * 详情
     */
    private String goodsDetail;
    /**
     * 商品单价
     */
    private Double goodsPrice;
    /**
     * 库存,-1表示没有限制
     */
    private Integer goodsStock;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

}

