DROP DATABASE IF EXISTS `TracefoodBlockchainDB`;
CREATE DATABASE `TracefoodBlockchainDB`;
USE `TracefoodBlockchainDB`;

CREATE TABLE `Operation`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Product`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `parentId` INT,
  `foodId` INT,
  `name` VARCHAR(50) NOT NULL,
  `type` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`parentId`) REFERENCES Product(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Certification`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `certificationTypeId` INT NOT NULL,
  `productId` INT NOT NULL,
  `addDuringOperationId` INT NOT NULL,
  `value` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`addDuringOperationId`) REFERENCES Operation(`id`),
  FOREIGN KEY (`productId`) REFERENCES Product(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Processing`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `operationId` INT NOT NULL,
  `processorId` INT NOT NULL,
  `date` DATE NOT NULL,
  `newProductId` INT NOT NULL,
  `originProductId` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`operationId`) REFERENCES Operation(`id`),
  FOREIGN KEY (`originProductId`) REFERENCES Product(`id`),
  FOREIGN KEY (`newProductId`) REFERENCES Product(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Transport`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `operationId` INT NOT NULL,
  `productId` INT NOT NULL,
  `senderId` INT NOT NULL,
  `receiverId` INT NOT NULL,
  `departureDate` DATE NOT NULL,
  `arrivalDate` DATE NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`operationId`) REFERENCES Operation(`id`),
  FOREIGN KEY (`productId`) REFERENCES Product(`id`)
) AUTO_INCREMENT = 1;

CREATE TABLE `Production`
(
  `id` INT NOT NULL AUTO_INCREMENT,
  `operationId` INT NOT NULL,
  `producerId` INT NOT NULL,
  `date` DATE NOT NULL,
  `createdProductId` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`operationId`) REFERENCES Operation(`id`),
  FOREIGN KEY (`createdProductId`) REFERENCES Product(`id`)
) AUTO_INCREMENT = 1;
