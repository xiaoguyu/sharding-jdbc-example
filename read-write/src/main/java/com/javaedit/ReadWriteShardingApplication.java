package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wjw
 * @description: 简单读写分离
 * @title: DbReadWriteShardingApplication
 * @date 2022/7/6 10:27
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
public class ReadWriteShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadWriteShardingApplication.class, args);
    }

}
