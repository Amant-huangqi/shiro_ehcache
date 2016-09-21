/*
Navicat MySQL Data Transfer

Source Server         : 123
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test_shiro

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-09-16 15:01:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for roleresource
-- ----------------------------
DROP TABLE IF EXISTS `roleresource`;
CREATE TABLE `roleresource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) DEFAULT NULL,
  `resId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roleresource
-- ----------------------------
INSERT INTO `roleresource` VALUES ('1', '1', '1');
INSERT INTO `roleresource` VALUES ('2', '2', '5');
