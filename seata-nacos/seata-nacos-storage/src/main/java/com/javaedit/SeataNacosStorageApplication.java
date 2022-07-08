package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wjw
 * @description:
 * @title: SeataNacosStorageApplication
 * @date 2022/7/7 16:21
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
// 启用服务发现
@EnableDiscoveryClient
public class SeataNacosStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataNacosStorageApplication.class, args);
    }

}
