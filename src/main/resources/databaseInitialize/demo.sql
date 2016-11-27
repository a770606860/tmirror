/*
Navicat MySQL Data Transfer

Source Server         : todemo
Source Server Version : 50550
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50550
File Encoding         : 65001

Date: 2016-11-27 11:00:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `descp` varchar(3000) DEFAULT NULL,
  `school_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '计算机科学', null, '1');
INSERT INTO `department` VALUES ('2', '材料科学', null, '1');

-- ----------------------------
-- Table structure for department_comment
-- ----------------------------
DROP TABLE IF EXISTS `department_comment`;
CREATE TABLE `department_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(300) NOT NULL,
  `c_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upvote` int(11) NOT NULL DEFAULT '0',
  `downvote` int(11) NOT NULL DEFAULT '0',
  `dept_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  KEY `entity_id` (`u_id`),
  CONSTRAINT `department_comment_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`id`),
  CONSTRAINT `department_comment_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department_comment
-- ----------------------------
INSERT INTO `department_comment` VALUES ('1', '学术天堂', '2016-11-27 10:56:13', '0', '0', '1', '1');

-- ----------------------------
-- Table structure for e_vote_d_c
-- ----------------------------
DROP TABLE IF EXISTS `e_vote_d_c`;
CREATE TABLE `e_vote_d_c` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vote` enum('U','D') NOT NULL,
  `u_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `c_id` (`c_id`),
  KEY `e_id` (`u_id`),
  CONSTRAINT `e_vote_d_c_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `department_comment` (`id`),
  CONSTRAINT `e_vote_d_c_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_vote_d_c
-- ----------------------------

-- ----------------------------
-- Table structure for e_vote_i_c
-- ----------------------------
DROP TABLE IF EXISTS `e_vote_i_c`;
CREATE TABLE `e_vote_i_c` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vote` enum('U','D') NOT NULL,
  `u_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `c_id` (`c_id`),
  KEY `e_id` (`u_id`),
  CONSTRAINT `e_vote_i_c_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`),
  CONSTRAINT `e_vote_i_c_ibfk_2` FOREIGN KEY (`c_id`) REFERENCES `instructor_comment` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_vote_i_c
-- ----------------------------
INSERT INTO `e_vote_i_c` VALUES ('1', 'U', '1', '1');
INSERT INTO `e_vote_i_c` VALUES ('2', 'U', '2', '1');

-- ----------------------------
-- Table structure for e_vote_s_c
-- ----------------------------
DROP TABLE IF EXISTS `e_vote_s_c`;
CREATE TABLE `e_vote_s_c` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vote` enum('U','D') NOT NULL,
  `u_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `c_id` (`c_id`),
  KEY `e_id` (`u_id`),
  CONSTRAINT `e_vote_s_c_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `school_comment` (`id`),
  CONSTRAINT `e_vote_s_c_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of e_vote_s_c
-- ----------------------------
INSERT INTO `e_vote_s_c` VALUES ('1', 'U', '1', '1');

-- ----------------------------
-- Table structure for instructor
-- ----------------------------
DROP TABLE IF EXISTS `instructor`;
CREATE TABLE `instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `gender` enum('F','M','X') NOT NULL,
  `descp` varchar(3000) DEFAULT NULL,
  `dept_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `dept_id` (`dept_id`),
  CONSTRAINT `instructor_ibfk_1` FOREIGN KEY (`dept_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of instructor
-- ----------------------------
INSERT INTO `instructor` VALUES ('1', '李雷', 'M', null, '2');
INSERT INTO `instructor` VALUES ('2', '韩梅梅', 'F', null, '2');

-- ----------------------------
-- Table structure for instructor_comment
-- ----------------------------
DROP TABLE IF EXISTS `instructor_comment`;
CREATE TABLE `instructor_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(300) NOT NULL,
  `c_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upvote` int(11) NOT NULL DEFAULT '0',
  `downvote` int(11) NOT NULL DEFAULT '0',
  `inst_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `course_name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `inst_id` (`inst_id`),
  KEY `entity_id` (`u_id`),
  CONSTRAINT `instructor_comment_ibfk_1` FOREIGN KEY (`inst_id`) REFERENCES `instructor` (`id`),
  CONSTRAINT `instructor_comment_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of instructor_comment
-- ----------------------------
INSERT INTO `instructor_comment` VALUES ('1', '很nice', '2016-11-27 10:52:14', '2', '0', '1', '1', '离散数学');
INSERT INTO `instructor_comment` VALUES ('2', '听天书', '2016-11-27 10:53:25', '0', '0', '2', '1', '微观经济学');
INSERT INTO `instructor_comment` VALUES ('3', 'so easy', '2016-11-27 10:55:19', '0', '0', '2', '2', '微观经济学');

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `descp` varchar(3000) DEFAULT NULL,
  `province` enum('天津','北京','上海','重庆','河北','山西','辽宁','吉林','黑龙江','江苏','浙江','安徽','福建','江西','山东','河南','湖北','湖南','广东','海南','四川','贵州','云南','陕西','甘肃','青海','台湾','内蒙古','广西','西藏','宁夏','新疆','香港','澳门') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  KEY `prov_id` (`province`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('1', '湖南大学', null, '湖南');
INSERT INTO `school` VALUES ('2', '北京大学', null, '北京');

-- ----------------------------
-- Table structure for school_comment
-- ----------------------------
DROP TABLE IF EXISTS `school_comment`;
CREATE TABLE `school_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(300) NOT NULL,
  `c_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `upvote` int(11) NOT NULL DEFAULT '0',
  `downvote` int(11) NOT NULL DEFAULT '0',
  `school_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `school_id` (`school_id`),
  KEY `entity_id` (`u_id`),
  CONSTRAINT `school_comment_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`id`),
  CONSTRAINT `school_comment_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school_comment
-- ----------------------------
INSERT INTO `school_comment` VALUES ('1', '很好', '2016-11-27 10:50:29', '2', '0', '1', '1');
INSERT INTO `school_comment` VALUES ('2', '很不错', '2016-11-27 10:50:49', '1', '0', '1', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `hpassword` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'weiwei@sina.com', '1234');
INSERT INTO `user` VALUES ('2', 'xxllzf@sina.com', '1234');
