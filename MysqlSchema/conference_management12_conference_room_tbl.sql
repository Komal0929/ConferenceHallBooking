CREATE DATABASE  IF NOT EXISTS `conference_management12` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `conference_management12`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: conference_management12
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `conference_room_tbl`
--

DROP TABLE IF EXISTS `conference_room_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conference_room_tbl` (
  `confroom_id` int NOT NULL AUTO_INCREMENT,
  `hotel_id` int NOT NULL,
  `confroom_name` varchar(50) NOT NULL,
  `confroom_capacity` int NOT NULL,
  `confroom_isDining` varchar(10) NOT NULL,
  `confroom_isSmoking` varchar(10) NOT NULL,
  `confroom_isAC` varchar(10) NOT NULL,
  `confroom_isProjector_facility` varchar(50) NOT NULL,
  `confroom_is_dining` varchar(10) NOT NULL,
  `confroom_is_projector_facility` varchar(50) NOT NULL,
  `confroom_is_smoking` varchar(10) NOT NULL,
  PRIMARY KEY (`confroom_id`),
  UNIQUE KEY `UK_nitmi0hyewd080u6cmrmwo7ev` (`hotel_id`),
  CONSTRAINT `conference_room_tbl_ibfk_1` FOREIGN KEY (`hotel_id`) REFERENCES `hotel_tbl` (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conference_room_tbl`
--

LOCK TABLES `conference_room_tbl` WRITE;
/*!40000 ALTER TABLE `conference_room_tbl` DISABLE KEYS */;
INSERT INTO `conference_room_tbl` VALUES (1,1,'Marriate Hall',100,'Yes','No','Yes','Yes','','',''),(2,2,'Taj Hall',50,'Yes','No','No','Yes','','',''),(3,3,'Sayaji Hall',25,'No','No','No','Yes','','','');
/*!40000 ALTER TABLE `conference_room_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-03 10:24:00
