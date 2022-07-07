package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wjw
 * @description: 不同表在不同库配置 + 静态读写分离
 * @title: DbReadWriteShardingApplication
 * @date 2022/7/6 10:27
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
public class DbReadWriteShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbReadWriteShardingApplication.class, args);
    }

}
