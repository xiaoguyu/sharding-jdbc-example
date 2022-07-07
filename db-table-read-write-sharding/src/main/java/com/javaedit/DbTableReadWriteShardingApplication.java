package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wjw
 * @description: 分库分表 + 读写分离
 * @title: TableReadWriteShardingApplication
 * @date 2022/7/5 16:27
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
public class DbTableReadWriteShardingApplication {

    /**
     * t_order分库分表，t_storage默认使用第一个库
     */
    public static void main(String[] args) {
        SpringApplication.run(DbTableReadWriteShardingApplication.class, args);
    }

}
