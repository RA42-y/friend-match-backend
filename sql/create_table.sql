create table if not exists tag
(
    id           bigint auto_increment comment 'id'
    primary key,
    tag_name     varchar(256)                       null comment '标签名',
    user_id      bigint                             null comment '用户 id',
    parent_id    bigint                             null comment '父标签 id',
    is_parent    tinyint                            null comment '是否为父标签 0-否 1-是',
    gmt_create   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    gmt_modified datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '修改时间',
    is_deleted   tinyint  default 0                 null comment '逻辑删除',
    constraint uniIdx_tag_name
    unique (tag_name)
    )
    comment '标签';

create index idx_user_id
    on tag (user_id);

create table if not exists team
(
    id          bigint auto_increment comment 'id'
    primary key,
    name        varchar(256)                       not null comment '队伍名称',
    description varchar(1024)                      null comment '描述',
    maxNum      int      default 1                 not null comment '最大人数',
    expireTime  datetime                           null comment '过期时间',
    userId      bigint                             null comment '用户id（队长 id）',
    status      int      default 0                 not null comment '0 - 公开，1 - 私有，2 - 加密',
    password    varchar(512)                       null comment '密码',
    createTime  datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime  datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete    tinyint  default 0                 not null comment '是否删除'
    )
    comment '队伍';

create table if not exists user
(
    id           bigint auto_increment comment 'id'
    primary key,
    username     varchar(256)      null comment '用户昵称',
    userPassword varchar(512)      not null comment '密码',
    userAccount  varchar(256)      null comment '账户',
    gender       tinyint           null comment '性别 0-男性 1-女性',
    phone        varchar(256)      null comment '电话',
    email        varchar(512)      null comment '邮箱',
    avatarUrl    varchar(1024)     null comment '头像链接',
    userStatus   tinyint default 0 null comment '状态 0 - 正常',
    createTime   datetime          null comment '创建时间',
    updateTime   datetime          null comment '修改时间',
    isDelete     tinyint default 0 null comment '逻辑删除',
    userRole     tinyint default 0 null comment '权限 0 - 普通 1 - 管理员',
    userCode   varchar(256)      null comment '用户编号',
    tags         varchar(1024)     null comment '标签列表 json',
    profile      varchar(512)      null comment '个人简介'
    )
    comment '用户';

create table if not exists user_team
(
    id         bigint auto_increment comment 'id'
    primary key,
    userId     bigint                             null comment '用户id',
    teamId     bigint                             null comment '队伍id',
    joinTime   datetime                           null comment '加入时间',
    createTime datetime default CURRENT_TIMESTAMP null comment '创建时间',
    updateTime datetime default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    isDelete   tinyint  default 0                 not null comment '是否删除'
)
    comment '用户队伍关系';


