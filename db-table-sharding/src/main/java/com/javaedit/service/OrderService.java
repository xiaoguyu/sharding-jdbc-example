package com.javaedit.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaedit.entity.Order;
import com.javaedit.entity.Storage;
import com.javaedit.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author wjw
 * @description: 订单service
 * @title: OrderServiceImpl
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
    // sharding-jdbc本地事务支持
    // https://shardingsphere.apache.org/document/5.1.1/cn/features/transaction/use-norms/local-transaction/
    @Transactional(rollbackFor = Exception.class)
    public void buy(Long orderId, String goodsId, Integer number) {
        Order order = new Order();
        order.setId(orderId);
        order.setGoodsId(goodsId);
        order.setNumber(3);
        order.setCreateTime(new Date());
        this.save(order);

        // 扣减库存
        Storage storage = storageService.findByGoodsId(goodsId);
        storage.setCount(storage.getCount() - number);
        storage.setUpdateTime(new Date());
        storageService.updateById(storage);

//        int i = 1 / 0;
    }

}
