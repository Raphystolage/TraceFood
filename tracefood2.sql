DROP DATABASE IF EXISTS `TracefoodClassicDB`;
CREATE DATABASE `TracefoodClassicDB`;
USE `TracefoodClassicDB`;

CREATE TABLE `User`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `emailAddress` VARCHAR(100) NOT NULL,
  `password` VARCHAR(150) NOT NULL,
  `companyName` VARCHAR(200) NOT NULL,
  `address` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Seller`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `type` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`userId`) REFERENCES User(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Producer`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `type` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`userId`) REFERENCES User(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Processor`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `type` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`userId`) REFERENCES User(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `HoReCa`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `userId` INT NOT NULL,
  `type` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`userId`) REFERENCES User(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Food`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Consumer`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL,
  `emailAddress` VARCHAR(100) NOT NULL,
  `password` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Evaluation`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `authorId` INT NOT NULL,
  `foodId` INT NOT NULL,
  `rate` INT,
  `comment` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`authorId`) REFERENCES Consumer(`id`),
  FOREIGN KEY (`foodId`) REFERENCES Food(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `CertificationType`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL,
  `description` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `CertificationTypeGiveableByUser`
(
  `certificationTypeId` INT NOT NULL,
  `userId` INT NOT NULL,
  PRIMARY KEY (`certificationTypeId`, `userId`),
  FOREIGN KEY (`certificationTypeId`) REFERENCES CertificationType(`id`),
  FOREIGN KEY (`userId`) REFERENCES User(`id`)
);
