/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50153
Source Host           : localhost:3306
Source Database       : demowebdb

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2010-12-28 13:17:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Create Databases
-- ----------------------------
CREATE DATABASE demowebdb
DEFAULT CHARACTER
SET utf8
COLLATE utf8_general_ci;
 
use demowebdb; 
-- ----------------------------
-- Table structure for `user_t`
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `Name` varchar(50) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`User_SQ`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

