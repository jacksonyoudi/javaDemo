CREATE TABLE `udp_histogram_ip` (
  `statTime` int(10) unsigned NOT NULL COMMENT '采样时间戳，目前是15分钟一次',
  `ap` varchar(63) CHARACTER SET ascii NOT NULL COMMENT '接入点',
  `src_ip` varchar(40) DEFAULT '' COMMENT '源ip',
  `rtt_20` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_20',
  `rtt_40` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_40',
  `rtt_60` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_60',
  `rtt_80` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_80',
  `rtt_100` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_100',
  `rtt_200` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_200',
  `rtt_300` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_300',
  `rtt_400` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_400',
  `rtt_500` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_500',
  `rtt_800` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_800',
  `rtt_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_infinity',
  `plr_0` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'RTT',
  `plr_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_1',
  `plr_5` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_5',
  `plr_10` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_10',
  `plr_15` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_15',
  `plr_30` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_30',
  `plr_50` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_50',
  `plr_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_infinity',
  PRIMARY KEY (`statTime`, `ap`, `src_ip`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8




CREATE TABLE `udp_histogram_region` (
  `statTime` int(10) unsigned NOT NULL COMMENT '采样时间戳',
  `ap` varchar(63) CHARACTER SET ascii NOT NULL COMMENT '接入点',
  `country` varchar(100) DEFAULT '' COMMENT 'country',
  `region` varchar(100) DEFAULT '' COMMENT 'region',
  `rtt_20` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_20',
  `rtt_40` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_40',
  `rtt_60` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_60',
  `rtt_80` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_80',
  `rtt_100` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_100',
  `rtt_200` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_200',
  `rtt_300` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_300',
  `rtt_400` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_400',
  `rtt_500` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_500',
  `rtt_800` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_800',
  `rtt_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_infinity',
  `plr_0` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'RTT',
  `plr_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_1',
  `plr_5` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_5',
  `plr_10` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_10',
  `plr_15` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_15',
  `plr_30` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_30',
  `plr_50` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_50',
  `plr_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_infinity',
  PRIMARY KEY (`statTime`, `ap`, `src_ip`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8









insert udp_histogram_ip(statTime,ap,src_ip,
rtt_20,rtt_40,rtt_60,rtt_60,rtt_80,rtt_100,rtt_200,rtt_300,rtt_400,rtt_500,rtt_800,rtt_infinity,
plr_0,plr_1,plr_5,plr_10,plr_15,plr_30,plr_50,plr_infinity)



CREATE TABLE `udp_qa_ip` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自动流水做主键',
  `stat_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳，N分钟',
  `src_type` smallint(6) unsigned NOT NULL DEFAULT '0' COMMENT '来源类型：0 -- 一般不会；1 -- 客户端推流；2 -- server；',
  `src_ip` varchar(40) DEFAULT '' COMMENT '源ip',
  `svr_ip` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT 'ip',
  `pkg_cnt` int(10) unsigned NOT NULL COMMENT 'udp包数',
  `inc_flow` double unsigned DEFAULT '0' COMMENT 'M',
  `avg_rtt` double unsigned NOT NULL DEFAULT '0' COMMENT 'RTT',
  `avg_pktlostrateq8_avg` double unsigned NOT NULL DEFAULT '0' COMMENT 'pktLostRateQ8',
  PRIMARY KEY (`id`,`stat_time`),
  CLUSTERING KEY `idx_clustering_time` (`stat_time`),
  KEY `idx_src` (`src_type`,`src_ip`,`svr_ip`),
  KEY `idx_svr` (`svr_ip`)
)  DISTRIBUTE BY HASH(`id`) AUTO_EXPIRE_KEY(`stat_time`) AUTO_EXPIRE_INTERVAL 604800 AUTO_EXPIRE_COUNT 60 ENGINE=TokuDB DEFAULT CHARSET=utf8


CREATE TABLE `_udp_histogram_ip` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自动流水做主键',
  `stat_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳，N分钟',
  `ap` varchar(63) CHARACTER SET ascii NOT NULL COMMENT 'ap',
  `src_ip` varchar(40) DEFAULT '' COMMENT 'ip',
  `rtt_20` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_20',
  `rtt_40` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_40',
  `rtt_60` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_60',
  `rtt_80` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_80',
  `rtt_100` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_100',
  `rtt_200` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_200',
  `rtt_300` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_300',
  `rtt_400` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_400',
  `rtt_500` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_500',
  `rtt_800` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_800',
  `rtt_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_infinity',
  `plr_0` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'RTT',
  `plr_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_1',
  `plr_5` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_5',
  `plr_10` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_10',
  `plr_15` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_15',
  `plr_30` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_30',
  `plr_50` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_50',
  `plr_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_infinity',
  PRIMARY KEY (`id`,`stat_time`, `ap`, `src_ip`),
  CLUSTERING KEY `idx_clustering_time` (`stat_time`)

) DISTRIBUTE BY HASH(`id`) AUTO_EXPIRE_KEY(`stat_time`) AUTO_EXPIRE_INTERVAL 604800 AUTO_EXPIRE_COUNT 4 ENGINE=TokuDB DEFAULT CHARSET=utf8


CREATE TABLE `_udp_histogram_ip` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自动流水做主键',
  `stat_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳，N分钟',
  `ap` varchar(63) NOT NULL COMMENT 'ap',
  `src_ip` varchar(40) NOT NULL DEFAULT '' COMMENT 'ip',
  `rtt_20` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_20',
  `rtt_40` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_40',
  `rtt_60` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_60',
  `rtt_80` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_80',
  `rtt_100` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_100',
  `rtt_200` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_200',
  `rtt_300` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_300',
  `rtt_400` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_400',
  `rtt_500` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_500',
  `rtt_800` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_800',
  `rtt_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_infinity',
  `plr_0` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'RTT',
  `plr_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_1',
  `plr_5` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_5',
  `plr_10` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_10',
  `plr_15` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_15',
  `plr_30` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_30',
  `plr_50` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_50',
  `plr_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_infinity',
  PRIMARY KEY (`id`,`stat_time`,`ap`,`src_ip`),
  CLUSTERING KEY `idx_clustering_time` (`stat_time`)
)  DISTRIBUTE BY HASH(`id`) AUTO_EXPIRE_KEY(`stat_time`) AUTO_EXPIRE_INTERVAL 604800 AUTO_EXPIRE_COUNT 4 ENGINE=TokuDB DEFAULT CHARSET=utf8



CREATE TABLE `client_ip_info` (
  `hip` varchar(100) NOT NULL COMMENT 'ip_hex',
  `kind` int(10) unsigned NOT NULL COMMENT 'ipv4 or ipv6',
  `sip` varchar(100) NOT NULL COMMENT 'ip_str',
  `nip` bigint(20) unsigned NOT NULL COMMENT 'ip uint32',
  `country` varchar(100) DEFAULT NULL COMMENT 'country',
  `prov` varchar(100) DEFAULT NULL COMMENT 'prov',
  `city` varchar(100) DEFAULT NULL COMMENT 'city',
  `isp` varchar(100) DEFAULT NULL COMMENT 'isp',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `lng` double DEFAULT NULL,
  `lat` double DEFAULT NULL,
  PRIMARY KEY (`hip`),
  KEY `key_nip` (`nip`),
  KEY `key_sip` (`sip`),
  KEY `key_kind` (`kind`),
  KEY `key_region` (`country`,`prov`),
  KEY `key_isp` (`isp`,`country`)
)  DISTRIBUTE BY HASH(`hip`) ENGINE=TokuDB DEFAULT CHARSET=utf8 ROW_FORMAT=TOKUDB_LZMA


CREATE TABLE `_udp_histogram_region` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `stat_time` int(10) unsigned NOT NULL COMMENT 'stat',
  `ap` varchar(63) CHARACTER SET ascii NOT NULL COMMENT '接入点',
  `country` varchar(100) DEFAULT '' COMMENT 'country',
  `region` varchar(100) DEFAULT '' COMMENT 'region',
  `rtt_20` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_20',
  `rtt_40` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_40',
  `rtt_60` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_60',
  `rtt_80` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_80',
  `rtt_100` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_100',
  `rtt_200` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_200',
  `rtt_300` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_300',
  `rtt_400` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_400',
  `rtt_500` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_500',
  `rtt_800` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_800',
  `rtt_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'rtt_infinity',
  `plr_0` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'RTT',
  `plr_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_1',
  `plr_5` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_5',
  `plr_10` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_10',
  `plr_15` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_15',
  `plr_30` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_30',
  `plr_50` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_50',
  `plr_infinity` int(10) unsigned NOT NULL DEFAULT '0' COMMENT 'plr_infinity',
  PRIMARY KEY (`id`,`stat_time`, `ap`, `country`, `region`)
) DISTRIBUTE BY HASH(`id`) ENGINE=TokuDB DEFAULT CHARSET=utf8 ROW_FORMAT=TOKUDB_LZMA
