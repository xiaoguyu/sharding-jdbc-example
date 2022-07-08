## 简介

sharding-jdbc案例，版本5.1.2

springboot + mybatis-plus + sharding-jdbc

## 血的教训
1. 官方文档切记选择正确的版本，不要以为master就是maven仓库中的最新那个版本，我就被坑了
   现在时间是2022年7月6日，官方最高版本是5.1.2，但是master和5.1.2版本的文档内容不一致，切记。
2. springboot的配置，要看官方文档SpringBootStarter部分，不要看YAML配置部分，两者不是一码事。

## 快速启动

相关sql文件在resource目录，配置好数据库，启动application即可，请求接口在controller中

## 模块说明

- read-write
  
  简单的读写分离

- db-sharding

  简单的不同表在不同库配置

  tb_order表使用sharding-jdbc的雪花算法生成id

  tb_storage表使用mybatis-plus生成uuid

- db-read-write-sharding

  不同表在不同库配置 + 静态读写分离

- table-sharding

  不分库，只分表案例

- table-read-write-sharding

  不分库，只分表+读写分离案例

- db-table-sharding

  分库分表

- db-table-read-write-sharding

  分库分表 + 读写分离

- seata-nacos

  Sharding-jdbc + Seata + Nacos整合

  搭配[博客](https://www.javaedit.com/archives/128/)食用更佳

## 参考资料

[ShardingSphere5.1.2文档](https://shardingsphere.apache.org/document/5.1.2/cn/overview/)

[yinjihuan/sharding-jdbc](https://github.com/yinjihuan/sharding-jdbc)