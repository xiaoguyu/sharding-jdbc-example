package com.javaedit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wjw
 * @description: 不同表在不同库
 * @title: DbShardingApplication
 * @date 2022/7/5 16:27
 */
@MapperScan("com.javaedit.mapper")
@SpringBootApplication
public class DbShardingApplication {

    /**
     * 建议在两个库都创建order表和storage表
     * 然后放入不同数据，用以测试分片配置是否正确
     * 因为分片规则如果没有配置（配置错误也相当于没配置），则依次查找所有库中的同名表(这只是个人推测)
     */
    public static void main(String[] args) {
        SpringApplication.run(DbShardingApplication.class, args);
    }

}
