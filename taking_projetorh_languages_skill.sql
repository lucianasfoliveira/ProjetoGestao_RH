-- MySQL dump 10.13  Distrib 8.0.32, for macos13 (x86_64)
--
-- Host: 127.0.0.1    Database: taking_projetorh
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `languages_skill`
--

DROP TABLE IF EXISTS `languages_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `languages_skill` (
  `languagesskill_id` int NOT NULL AUTO_INCREMENT,
  `language_id` int DEFAULT NULL,
  `level_id` int DEFAULT NULL,
  `candidato_id` int DEFAULT NULL,
  PRIMARY KEY (`languagesskill_id`),
  KEY `language_id` (`language_id`),
  KEY `level_id` (`level_id`),
  KEY `candidato_id` (`candidato_id`),
  CONSTRAINT `languages_skill_ibfk_1` FOREIGN KEY (`language_id`) REFERENCES `languages` (`language_id`),
  CONSTRAINT `languages_skill_ibfk_2` FOREIGN KEY (`level_id`) REFERENCES `level` (`level_id`),
  CONSTRAINT `languages_skill_ibfk_3` FOREIGN KEY (`candidato_id`) REFERENCES `candidato` (`candidato_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languages_skill`
--

LOCK TABLES `languages_skill` WRITE;
/*!40000 ALTER TABLE `languages_skill` DISABLE KEYS */;
INSERT INTO `languages_skill` VALUES (1,1,1,1);
/*!40000 ALTER TABLE `languages_skill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-18 20:17:15
