CREATE DATABASE IF NOT EXISTS `taskgkb`;

CREATE TABLE IF NOT EXISTS `taskgkb.user_info` (
  `age` int NOT NULL,
  `date_of_birth` date DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `taskgkb.user_info_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
