use yuapi;

-- 接口信息
CREATE TABLE IF NOT EXISTS yuapi.`interface_info`
(
    `id`             BIGINT                             NOT NULL AUTO_INCREMENT COMMENT '主键' PRIMARY KEY,
    `name`           VARCHAR(256)                       NOT NULL COMMENT '名称',
    `description`    VARCHAR(256)                       NULL COMMENT '描述',
    `url`            VARCHAR(512)                       NOT NULL COMMENT '接口地址',
    `requestParams`  text                               NULL COMMENT '请求参数',
    `requestHeader`  TEXT                               NULL COMMENT '请求头',
    `responseHeader` TEXT                               NULL COMMENT '响应头',
    `status`         INT      DEFAULT 0                 NOT NULL COMMENT '接口状态(0-关闭, 1-开启)',
    `method`         VARCHAR(256)                       NOT NULL COMMENT '请求类型',
    `userId`         BIGINT                             NOT NULL COMMENT '创建人',
    `createTime`     DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    `updateTime`     DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `isDelete`       TINYINT  DEFAULT 0                 NOT NULL COMMENT '是否删除(0-未删, 1-已删)'
) COMMENT '接口信息' ENGINE INNODB
                 DEFAULT CHARSET utf8;

INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (1, '顾鑫鹏', '崔浩宇', 'www.marianela-dare.name', '范浩然', '杨峻熙', 0, '王锦程', 2734523923);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (2, '武浩', '韦晓啸', 'www.markus-dicki.info', '潘正豪', '于健雄', 0, '史文', 68820);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (3, '邵天翊', '洪峻熙', 'www.allen-rowe.net', '张炎彬', '史瑾瑜', 0, '马驰', 77407987);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (4, '陈子轩', '田健柏', 'www.azalee-breitenberg.name', '王哲瀚', '白鹏', 0, '张峻熙', 245662);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (5, '范梓晨', '马思', 'www.brendan-lind.name', '黎伟泽', '朱瑾瑜', 0, '萧潇然', 17);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (6, '白熠彤', '苏致远', 'www.ricardo-hartmann.com', '薛荣轩', '石俊驰', 0, '武浩轩', 589);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (7, '孙天磊', '雷彬', 'www.jody-fahey.org', '方泽洋', '覃文昊', 0, '曾明杰', 644);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (8, '毛瑞霖', '马文博', 'www.tracy-abshire.net', '覃擎苍', '范绍辉', 0, '廖弘文', 849);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (9, '龚文博', '苏子涵', 'www.roscoe-gorczany.org', '田晟睿', '罗文博', 0, '史绍齐', 94123615);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (10, '杨弘文', '曾昊然', 'www.bruno-miller.name', '沈鹤轩', '杜鸿涛', 0, '王子涵', 6);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (11, '高昊然', '韦博文', 'www.charlyn-rau.biz', '莫志强', '钟立诚', 0, '马钰轩', 99756471);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (12, '周弘文', '李炎彬', 'www.palmer-mclaughlin.io', '侯天磊', '王智渊', 0, '钱立辉', 9511325);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (13, '任健柏', '覃晟睿', 'www.troy-mertz.net', '赵雨泽', '魏文昊', 0, '范烨伟', 231);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (14, '杜子骞', '贾晟睿', 'www.dallas-klocko.co', '龙子涵', '傅明轩', 0, '赵语堂', 737623);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (15, '陈烨霖', '顾雨泽', 'www.barbra-kris.co', '于晟睿', '徐文博', 0, '赖锦程', 1619854113);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (16, '金弘文', '蒋泽洋', 'www.nydia-mills.info', '谢伟泽', '江文', 0, '傅俊驰', 55961);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (17, '莫君浩', '宋绍齐', 'www.isreal-dickens.co', '廖雨泽', '秦弘文', 0, '龙浩宇', 960182015);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (18, '何潇然', '蔡鹏', 'www.oliva-kuhic.io', '任晟睿', '曹子骞', 0, '孙天宇', 93890);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (19, '吕旭尧', '丁致远', 'www.xenia-ortiz.com', '黎鹏飞', '吕耀杰', 0, '洪擎宇', 16885);
INSERT INTO yuapi.`interface_info` (`id`, `name`, `description`, `url`, `requestHeader`, `responseHeader`, `status`,
                                    `method`, `userId`)
VALUES (20, '石梓晨', '万皓轩', 'www.malka-runolfsson.name', '高熠彤', '魏烨伟', 0, '赖凯瑞', 575);