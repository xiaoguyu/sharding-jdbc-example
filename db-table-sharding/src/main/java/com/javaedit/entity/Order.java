package com.javaedit.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wjw
 * @description: 订单表
 * @title: Order
 * @date 2022/7/5 16:43
 */
@TableName("tb_order")
public class Order implements Serializable {

    /**
     * id
     */
    private Long id;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 购买数量
     */
    private Integer number;
    /**
     * 创建时间
     */
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
