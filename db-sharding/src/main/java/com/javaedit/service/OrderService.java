package com.javaedit.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaedit.entity.Order;
import com.javaedit.entity.Storage;
import com.javaedit.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author wjw
 * @description: 订单service
 * @title: OrderService
 * @date 2022/7/5 18:04
 */
@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> {

    @Autowired
    private StorageService storageService;

    /**
     * @param goodsId
     * @param number
     * @return
     * @apiNote 购买商品，创建订单
     * @author wjw
     * @date 2022/7/5 18:06
     */
    public void buy(String goodsId, Integer number) {
        Order order = new Order();
        order.setGoodsId(goodsId);
        order.setNumber(3);
        order.setCreateTime(new Date());
        this.save(order);

        // 扣减库存
        Storage storage = storageService.findByGoodsId(goodsId);
        storage.setCount(storage.getCount() - number);
        storage.setUpdateTime(new Date());
        storageService.updateById(storage);
    }

}
