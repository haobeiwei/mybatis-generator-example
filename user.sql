CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(18) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `birth_date` datetime DEFAULT NULL COMMENT '出生日期',
  `salary` decimal(20,2) DEFAULT NULL COMMENT '薪水',
  `sex` tinyint(1) DEFAULT NULL COMMENT '0,未知；1男2女',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;