-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: localhost    Database: Prg4_College
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `class` (
  `USN` varchar(20) NOT NULL,
  `SSID` int DEFAULT NULL,
  PRIMARY KEY (`USN`),
  KEY `SSID` (`SSID`),
  CONSTRAINT `class_ibfk_1` FOREIGN KEY (`USN`) REFERENCES `student` (`USN`),
  CONSTRAINT `class_ibfk_2` FOREIGN KEY (`SSID`) REFERENCES `semsec` (`SSID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES ('1BI15CS103',101),('1BI15CS101',102),('1BI15CS102',104),('1BI15CS104',106),('1BI15CS105',108);
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Subcode` varchar(20) NOT NULL,
  `Title` varchar(50) DEFAULT NULL,
  `Sem` int DEFAULT NULL,
  `Credits` int DEFAULT NULL,
  PRIMARY KEY (`Subcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('18CS43','OS',4,3),('18CS52','DBMS',5,4),('18CS55','RM',5,2),('18CS81','DS',8,3),('18CS83','AIML',8,3);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `iamarks`
--

DROP TABLE IF EXISTS `iamarks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `iamarks` (
  `USN` varchar(20) NOT NULL,
  `Subcode` varchar(20) NOT NULL,
  `SSID` int NOT NULL,
  `Test1` int DEFAULT NULL,
  `Test2` int DEFAULT NULL,
  `Test3` int DEFAULT NULL,
  `FinalIA` int DEFAULT NULL,
  PRIMARY KEY (`USN`,`Subcode`,`SSID`),
  KEY `Subcode` (`Subcode`),
  KEY `SSID` (`SSID`),
  CONSTRAINT `iamarks_ibfk_1` FOREIGN KEY (`USN`) REFERENCES `student` (`USN`),
  CONSTRAINT `iamarks_ibfk_2` FOREIGN KEY (`Subcode`) REFERENCES `course` (`Subcode`),
  CONSTRAINT `iamarks_ibfk_3` FOREIGN KEY (`SSID`) REFERENCES `semsec` (`SSID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `iamarks`
--

LOCK TABLES `iamarks` WRITE;
/*!40000 ALTER TABLE `iamarks` DISABLE KEYS */;
INSERT INTO `iamarks` VALUES ('1BI15CS101','18CS52',103,16,19,16,18),('1BI15CS101','18CS55',102,10,12,9,11),('1BI15CS102','18CS43',104,16,15,18,17),('1BI15CS104','18CS83',103,10,11,10,11),('1BI15CS106','18CS43',103,13,15,13,14);
/*!40000 ALTER TABLE `iamarks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semsec`
--

DROP TABLE IF EXISTS `semsec`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `semsec` (
  `SSID` int NOT NULL,
  `Sem` int DEFAULT NULL,
  `Sec` char(1) DEFAULT NULL,
  PRIMARY KEY (`SSID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semsec`
--

LOCK TABLES `semsec` WRITE;
/*!40000 ALTER TABLE `semsec` DISABLE KEYS */;
INSERT INTO `semsec` VALUES (101,5,'B'),(102,8,'C'),(103,8,'B'),(104,8,'A'),(105,4,'C'),(106,4,'C'),(107,4,'C'),(108,5,'A');
/*!40000 ALTER TABLE `semsec` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `USN` varchar(20) NOT NULL,
  `SName` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Phone` bigint DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  PRIMARY KEY (`USN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1BI15CS101','John','ITPL',9987998799,'M'),('1BI15CS102','Dan','ITPL',7786778677,'M'),('1BI15CS103','Rohini','AECS',9876987698,'F'),('1BI15CS104','Priya','Kundalahalli',6464554343,'F'),('1BI15CS105','Darshan','Koramangala',7676980909,'M'),('1BI15CS106','Shreya','Whitefield',8898897676,'F'),('1BI15CS107','Diya','Marathalli',8878878878,'F'),('1BI15CS108','Alia','Brookefield',7609898090,'F');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `test1_1bi15cs101`
--

DROP TABLE IF EXISTS `test1_1bi15cs101`;
/*!50001 DROP VIEW IF EXISTS `test1_1bi15cs101`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `test1_1bi15cs101` AS SELECT 
 1 AS `USN`,
 1 AS `Subcode`,
 1 AS `Test1`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `test1_1bi15cs101`
--

/*!50001 DROP VIEW IF EXISTS `test1_1bi15cs101`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `test1_1bi15cs101` AS select `iamarks`.`USN` AS `USN`,`iamarks`.`Subcode` AS `Subcode`,`iamarks`.`Test1` AS `Test1` from `iamarks` where (`iamarks`.`USN` = '1BI15CS101') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-03 16:46:03
