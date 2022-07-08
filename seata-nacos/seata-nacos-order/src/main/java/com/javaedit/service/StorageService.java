package com.javaedit.service;

import com.javaedit.entity.Storage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wjw
 * @description: 库存service
 * @title: StorageService
 * @date 2022/7/5 18:19
 */
@FeignClient("storage-service")
public interface StorageService {

    @GetMapping(path = "/storage")
    Storage storage(@RequestParam("goodsId") String goodsId, @RequestParam("number") Integer number);
}
