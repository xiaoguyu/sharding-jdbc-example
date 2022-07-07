package com.javaedit.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.javaedit.entity.Storage;
import com.javaedit.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private StorageMapper storageMapper;

    @GetMapping("/list")
    public Object list() {
        QueryWrapper<Storage> wrapper = new QueryWrapper<>();
        return storageMapper.selectList(wrapper);
    }

}
