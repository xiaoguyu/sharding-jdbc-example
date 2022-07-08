package com.javaedit.controller;

import com.javaedit.entity.Storage;
import com.javaedit.service.StorageService;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author wjw
 * @description: 库存controller
 * @title: StorageController
 * @date 2022/7/5 17:02
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/list")
    public Object list() {
        return storageService.list();
    }

    @GetMapping("/storage")
    public Storage storage(@RequestParam("goodsId") String goodsId, @RequestParam("number") Integer number) {
        System.out.println("Storage Service Begin ... xid: " + RootContext.getXID());

        Storage storage = storageService.findByGoodsId(goodsId);
        storage.setCount(storage.getCount() - number);
        // 这里不填new Date()是因为涉及seata的undolog的jackson序列化报错，懒得处理了
        storage.setUpdateTime(null);
        storageService.updateById(storage);

        System.out.println("Storage Service End ... ");
        return storage;
    }
}
