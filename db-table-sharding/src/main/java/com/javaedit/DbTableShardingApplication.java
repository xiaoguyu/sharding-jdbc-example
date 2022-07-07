package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wjw
 * @description: 分库分表
 * @title: TableReadWriteShardingApplication
 * @date 2022/7/5 16:27
 */
@MapperScan("com.javaedit.mapper")
// 事务支持
@EnableTransactionManagement(proxyTargetClass = true)
@SpringBootApplication
public class DbTableShardingApplication {

    /**
     * t_order分库分表，t_storage默认使用第一个库
     */
    public static void main(String[] args) {
        SpringApplication.run(DbTableShardingApplication.class, args);
    }

}
