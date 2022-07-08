package com.javaedit.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaedit.entity.Order;
import com.javaedit.entity.Storage;
import com.javaedit.mapper.OrderMapper;
import org.apache.shardingsphere.transaction.annotation.ShardingSphereTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
     * @apiNote 购买商品，创建订单（使用Seata + Shardingjdbc事务）
     * @author wjw
     * @date 2022/7/5 18:06
     */
    @Transactional
    @ShardingSphereTransactionType(TransactionType.BASE)
    public void buy(String goodsId, Integer number) {
        Order order = new Order();
        order.setGoodsId(goodsId);
        order.setNumber(3);
        this.save(order);

        // 扣减库存
        storageService.storage(goodsId, number);
    }

}
