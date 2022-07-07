package com.javaedit.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javaedit.entity.Storage;
import com.javaedit.mapper.StorageMapper;
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

    @GetMapping("/update")
    public Object update() {
        Storage storage = storageService.getById("dbsec-222");
        storage.setCount(storage.getCount() - 3);
        storage.setUpdateTime(new Date());
        storageService.updateById(storage);
        return storage;
    }

}
