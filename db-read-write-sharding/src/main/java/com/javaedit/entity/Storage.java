package com.javaedit.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wjw
 * @description: 库存
 * @title: Storage
 * @date 2022/7/5 16:46
 */
@TableName("tb_storage")
public class Storage implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;
    /**
     * 商品id
     */
    private String goodsId;
    /**
     * 剩余数量
     */
    private Integer count;
    /**
     * 更新时间
     */
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
