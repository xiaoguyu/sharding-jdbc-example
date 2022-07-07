package com.javaedit.service;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.javaedit.entity.Storage;
import com.javaedit.mapper.StorageMapper;
import org.springframework.stereotype.Service;

/**
 * @author wjw
 * @description: 库存service
 * @title: StorageService
 * @date 2022/7/5 18:19
 */
@Service
public class StorageService extends ServiceImpl<StorageMapper, Storage> {

    public Storage findByGoodsId(String goodsId) {
        LambdaUpdateWrapper<Storage> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(Storage::getGoodsId, goodsId);
        return this.baseMapper.selectOne(wrapper);
    }
}
