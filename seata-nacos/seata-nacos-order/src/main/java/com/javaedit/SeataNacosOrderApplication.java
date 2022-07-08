package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

/**
 * @author wjw
 * @description:
 * @title: SeataNacosOrderApplication
 * @date 2022/7/7 16:00
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
// 启用feign
@EnableFeignClients
// 启用服务发现
@EnableDiscoveryClient
// 启用事务注解
@EnableTransactionManagement(proxyTargetClass = true)
public class SeataNacosOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataNacosOrderApplication.class, args);
    }

    /**
     * feign需要
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
