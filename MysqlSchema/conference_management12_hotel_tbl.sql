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
-- Table structure for table `hotel_tbl`
--

DROP TABLE IF EXISTS `hotel_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotel_tbl` (
  `hotel_id` int NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(50) NOT NULL,
  `hotel_uname` varchar(50) NOT NULL,
  `hotel_password` varchar(15) NOT NULL,
  `hotel_contact_number` varchar(12) NOT NULL,
  `hotel_contact_person` varchar(50) NOT NULL,
  `hotel_email` varchar(50) NOT NULL,
  `hotel_isParking` varchar(10) DEFAULT NULL,
  `hotel_city` varchar(20) NOT NULL,
  `hotel_district` varchar(20) NOT NULL,
  `hotel_state` varchar(20) NOT NULL,
  `hotel_pincode` int NOT NULL,
  `hotel_is_parking` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel_tbl`
--

LOCK TABLES `hotel_tbl` WRITE;
/*!40000 ALTER TABLE `hotel_tbl` DISABLE KEYS */;
INSERT INTO `hotel_tbl` VALUES (1,'Marriate','marriate12@gmail.com','1234','7387986939','Shubham','marriate12@gmail.com','Yes','Kolhapur','Kolhapur','Maharashtra',150102,NULL),(2,'Taj Palace','tajpalace@12gmail.com','tajpalace@12','7896541231','Shridhar','tajpalace@12gmail.com','Yes','Mumbai','Mumbai','Maharashtra',410005,NULL),(3,'Sayaji','sayaji@12gmail.com','sayaji@12','9890044186','Komal','sayaji@12gmail.com','Yes','Nashik','Nashik','Maharashtra',412506,NULL);
/*!40000 ALTER TABLE `hotel_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-03 10:24:02
