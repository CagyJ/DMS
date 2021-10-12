create database `dms`;
use dms;
CREATE TABLE `order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `origin` varchar(60) NOT NULL,
  `destination` varchar(60) NOT NULL,
  `car_license` varchar(30) DEFAULT NULL,
  `product_weight` double DEFAULT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO dms.`order` (id, name, origin, destination, car_license, product_weight, status)
    VALUES (1, 'test', 'budapest', 'german', 'a123', 123.6, 'completed');

CREATE TABLE `car` (
  `id` bigint NOT NULL,
  `car_license` varchar(30) NOT NULL,
  `driver_name` varchar(60) NOT NULL,
  `driver_phonenumber` int NOT NULL,
  `status` varchar(10) NOT NULL,
  `driver_address` varchar(60) DEFAULT NULL,
  `driver_id_number` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO dms.car (id, car_license, driver_name, driver_phonenumber, status, driver_address, driver_id_number) VALUES (1, 'a123', 'Jack', 12345678, 'free', 'budapest', 'b123');


CREATE TABLE `user` (
  `id` bigint NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO dms.user (id, username, password) VALUES (1, 'admin', 'admin');
INSERT INTO dms.user (id, username, password) VALUES (2, 'test', 'test');