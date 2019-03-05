-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: clue
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clue`
--

DROP TABLE IF EXISTS `clue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `clue` (
  `game_id` int(11) NOT NULL AUTO_INCREMENT,
  `player_number` int(11) DEFAULT NULL,
  `date_played` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`game_id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clue`
--

LOCK TABLES `clue` WRITE;
/*!40000 ALTER TABLE `clue` DISABLE KEYS */;
INSERT INTO `clue` VALUES (69,1,'2019-03-05 06:00:00'),(70,2,'2019-03-05 06:00:00'),(72,3,'2019-03-05 06:00:00');
/*!40000 ALTER TABLE `clue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clue_clues`
--

DROP TABLE IF EXISTS `clue_clues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `clue_clues` (
  `clue_game_id` int(11) DEFAULT NULL,
  `clues_id` int(11) NOT NULL AUTO_INCREMENT,
  `mustard` varchar(7) DEFAULT NULL,
  `scarlet` varchar(7) DEFAULT NULL,
  `white` varchar(5) DEFAULT NULL,
  `green` varchar(5) DEFAULT NULL,
  `peacock` varchar(7) DEFAULT NULL,
  `plum` varchar(4) DEFAULT NULL,
  `knife` varchar(5) DEFAULT NULL,
  `candlestick` varchar(11) DEFAULT NULL,
  `pipe` varchar(4) DEFAULT NULL,
  `revolver` varchar(8) DEFAULT NULL,
  `rope` varchar(4) DEFAULT NULL,
  `wrench` varchar(6) DEFAULT NULL,
  `ballroom` varchar(8) DEFAULT NULL,
  `kitchen` varchar(7) DEFAULT NULL,
  `conservatory` varchar(12) DEFAULT NULL,
  `billard` varchar(7) DEFAULT NULL,
  `dining` varchar(6) DEFAULT NULL,
  `library` varchar(7) DEFAULT NULL,
  `hall` varchar(4) DEFAULT NULL,
  `study` varchar(5) DEFAULT NULL,
  `lounge` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`clues_id`),
  KEY `fk_clue_suspects_clue1_idx` (`clue_game_id`),
  CONSTRAINT `fk_clue_suspects_clue1` FOREIGN KEY (`clue_game_id`) REFERENCES `clue` (`game_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clue_clues`
--

LOCK TABLES `clue_clues` WRITE;
/*!40000 ALTER TABLE `clue_clues` DISABLE KEYS */;
INSERT INTO `clue_clues` VALUES (NULL,1,'x','x','x','x','x','x',NULL,NULL,NULL,NULL,NULL,NULL,'x','x','x','x','x','x','x','x','x'),(NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'x','x',NULL,NULL,NULL,NULL,NULL,NULL),(NULL,3,NULL,NULL,NULL,NULL,NULL,NULL,'x','x','x','x','x','x','x','x',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(NULL,4,NULL,NULL,NULL,NULL,NULL,NULL,'x','x',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(NULL,5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'x','x',NULL,NULL,NULL,'x',NULL,'x',NULL,NULL,NULL,NULL,NULL),(NULL,6,NULL,NULL,'x','x','x','x',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'x','x',NULL,NULL,NULL,NULL,NULL,NULL),(NULL,7,'x',NULL,NULL,NULL,NULL,'x',NULL,NULL,'x','x','x',NULL,NULL,NULL,'x','x','x','x',NULL,NULL,NULL),(NULL,8,NULL,NULL,NULL,NULL,NULL,NULL,'x','x','x',NULL,NULL,NULL,NULL,NULL,'x','x','x',NULL,NULL,NULL,NULL),(NULL,9,NULL,NULL,'x','x','x','x',NULL,NULL,'x',NULL,NULL,NULL,NULL,'x','x','x','x','x',NULL,NULL,NULL);
/*!40000 ALTER TABLE `clue_clues` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-05 17:55:25
