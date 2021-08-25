/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : yingx

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2021-08-25 11:19:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yx_admin
-- ----------------------------
DROP TABLE IF EXISTS `yx_admin`;
CREATE TABLE `yx_admin` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yx_admin
-- ----------------------------
INSERT INTO `yx_admin` VALUES ('1', 'xiaoh', '111111', '0', null);
INSERT INTO `yx_admin` VALUES ('2', '小黑s', '111111', '1', null);
INSERT INTO `yx_admin` VALUES ('3', 'admin', '111111', '1', null);
