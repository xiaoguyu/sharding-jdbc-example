package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wjw
 * @description: 单库 + tb_order分表 + tb_storage不分表 + 读写分离
 * @title: TableReadWriteShardingApplication
 * @date 2022/7/5 16:27
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
public class TableReadWriteShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TableReadWriteShardingApplication.class, args);
    }

}
