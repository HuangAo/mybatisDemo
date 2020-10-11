CREATE DATABASE `mybatisTest`;

use `mybatis`;

CREATE TABLE `user` (
  `id` INT(20) NOT NULL PRIMARY KEY,
  `name` VARCHAR(30) DEFAULT NULL,
  `pwd` VARCHAR(30) DEFAULT NULL
  )ENGINE=INNODB DEFAULT CHARSET=utf8;
  
insert into user (id,name,pwd) VALUES(1,'huangao','123456'),(2,'james','654321'),(3,'jordan','7676765');

CREATE TABLE `teacher` (
  `id` INT(20) NOT NULL PRIMARY KEY,
  `name` VARCHAR(30) DEFAULT NULL
  )ENGINE=INNODB DEFAULT CHARSET=utf8;

insert into teacher (id,name) values(1,'黄老师');


CREATE TABLE `student` (
  `id` INT(20) NOT NULL PRIMARY KEY,
  `name` VARCHAR(30) DEFAULT NULL,
  `tid` INT(20) DEFAULT NULL,
   KEY `fktid` (`tid`),
   CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`id`) 
  )ENGINE=INNODB DEFAULT CHARSET=utf8;
  
 insert into student (id,name,tid) values (1,'小明',1);
 insert into student (id,name,tid) values (2,'小张',1);
 insert into student (id,name,tid) values (3,'小王',1);
 insert into student (id,name,tid) values (4,'小李',1);
 insert into student (id,name,tid) values (5,'小红',1);


