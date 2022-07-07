/*==============================================================*/
/* db: sharding_db1                                           */
/*==============================================================*/
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

drop table if exists tb_order_2;
create table tb_order_2
(
    id                  bigint(64) NOT NULL,
    goods_id            varchar(31) comment '商品id',
    number              int comment '购买数量',
    create_time         datetime,
    primary key (id)
);
INSERT INTO tb_order_2(id, goods_id, number, create_time) VALUES(222, 'g111', 2, now());

drop table if exists tb_order_3;
create table tb_order_3
(
    id                  bigint(64) NOT NULL,
    goods_id            varchar(31) comment '商品id',
    number              int comment '购买数量',
    create_time         datetime,
    primary key (id)
);
INSERT INTO tb_order_3(id, goods_id, number, create_time) VALUES(333, 'g111', 2, now());