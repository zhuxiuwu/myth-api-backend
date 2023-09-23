create table if not exists yuapi.`user_interface_info`
(
    id
    bigint
    auto_increment
    comment
    '主键'
    primary
    key,
    `userId`
    bigint
    not
    null
    comment
    '调用用户id',
    `interfaceInfoId`
    bigint
    not
    null
    comment
    '接口id',
    `totalNum`
    int
    default
    0
    not
    null
    comment
    '总调用次数',
    `leftNum`
    int
    default
    0
    not
    null
    comment
    '剩余次数',
    `status`
    int
    default
    0
    not
    null
    comment
    '0-正常 1-禁用',
    createTime
    datetime
    default
    current_timestamp
(
) not null comment '创建时间',
    updateTime datetime default current_timestamp
(
) not null on update current_timestamp
(
) comment '更新时间',
    isDelete tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
    )
    comment '用户调用接口关系' charset = utf8;



