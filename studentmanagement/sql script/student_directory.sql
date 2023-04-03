CREATE DATABASE  IF NOT EXISTS `student_directory`;
USE `student_directory`;

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `student` VALUES 
	(1,'Jon','Snow','jsnow@gmail.com'),
	(2,'Micah','Bell','micah@icloud.com');


