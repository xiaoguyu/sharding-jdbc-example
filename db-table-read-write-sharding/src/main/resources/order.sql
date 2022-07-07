/*===========================================================================*/
/* 所有数据库都要创建两个表，否则/order/list接口报错，原因你猜猜*/
/*===========================================================================*/
drop table if exists tb_order_0;
create table tb_order_0
(
    id                  bigint(64) NOT NULL,
    goods_id            varchar(31) comment '商品id',
    number              int comment '购买数量',
    create_time         datetime,
    primary key (id)
);
INSERT INTO tb_order_0(id, goods_id, number, create_time) VALUES(444, 'g111', 2, now());

drop table if exists tb_order_1;
create table tb_order_1
(
    id                  bigint(64) NOT NULL,
    goods_id            varchar(31) comment '商品id',
    number              int comment '购买数量',
    create_time         datetime,
    primary key (id)
);
INSERT INTO tb_order_1(id, goods_id, number, create_time) VALUES(111, 'g111', 2, now());