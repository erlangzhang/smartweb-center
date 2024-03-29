DROP TABLE IF EXISTS `T_USER_INFO`;
CREATE TABLE `T_USER_INFO` (
  `USER_ID`  int(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `USER_NAME` varchar(32) NOT NULL,
  `USER_FULL_NAME` varchar(64) NOT NULL,
  `USER_PWD` varchar(64) NOT NULL,
  `USER_SEX` char(1) NOT NULL,
  `USER_MAIL` varchar(64) NOT NULL ,
  `USER_PHONE` char(64) NOT NULL ,
  `USER_BIRTH_DATE` date not null ,
  `USER_STATUS` tinyint(2) NOT NULL ,
  `USER_REG_TIME` datetime NOT NULL ,
  `LAST_UPDATE_TIME` datetime NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户基本信息';

DROP TABLE IF EXISTS `T_USER_DETAIL_INFO`;
CREATE TABLE `T_USER_DETAIL_INFO` (
  `USER_DETAIL_ID` int(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `USER_ID` int(10) UNSIGNED NOT NULL ,
  `USER_PHOTO` varchar(32) NOT NULL,
  `USER_DESC` varchar(64) NOT NULL,
  `LAST_UPDATE_TIME` datetime NOT NULL,
  PRIMARY KEY (`USER_DETAIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户详细信息表';