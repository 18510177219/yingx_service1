/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : yingx

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2021-08-25 11:19:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yx_feedback
-- ----------------------------
DROP TABLE IF EXISTS `yx_feedback`;
CREATE TABLE `yx_feedback` (
  `id` varchar(255) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yx_feedback
-- ----------------------------
INSERT INTO `yx_feedback` VALUES ('1', '有点卡', '视频播放有点卡', '11', '2021-08-19 17:25:27');
INSERT INTO `yx_feedback` VALUES ('2', '删除失败', '删除浏览历史失败', '12', '2021-08-05 17:26:41');
INSERT INTO `yx_feedback` VALUES ('3', '有bug', '有很多bug', '12', '2021-08-17 18:04:03');
