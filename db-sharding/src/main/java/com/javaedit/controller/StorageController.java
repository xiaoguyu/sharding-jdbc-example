package com.javaedit.controller;

import com.javaedit.entity.Storage;
import com.javaedit.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author wjw
 * @description: 库存controller
 * @title: StorageController
 * @date 2022/7/5 17:02
 */
@RequestMapping("/storage")
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/list")
    public Object list() {
        return storageService.list();
    }

    @GetMapping("/create")
    public Object create() {
        Storage storage = new Storage();
        storage.setCount(1);
        storage.setGoodsId("1");
        storage.setUpdateTime(new Date());
        return storageService.save(storage);
    }
}
