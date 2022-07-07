/*==============================================================*/
/* db: sharding_db2                                             */
/*==============================================================*/
drop table if exists tb_storage;

create table tb_storage
(
    id                  varchar(32) NOT NULL,
    goods_id            varchar(31) comment '商品id',
    count             int comment '剩余数量',
    update_time         datetime,
    primary key (id)
);

INSERT INTO tb_storage(id, goods_id, count, update_time) VALUES('dbsec-222', 'g111', 98, now());