/*==============================================================*/
/* db: sharding_db1                                             */
/*==============================================================*/
drop table if exists tb_order;

create table tb_order
(
    id                  bigint(64) NOT NULL,
    goods_id            varchar(31) comment '商品id',
    number              int comment '购买数量',
    create_time         datetime,
    primary key (id)
);

INSERT INTO tb_order(id, goods_id, number, create_time) VALUES(111, 'g111', 2, now());