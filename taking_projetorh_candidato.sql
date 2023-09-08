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
-- Table structure for table `candidato`
--

DROP TABLE IF EXISTS `candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidato` (
  `candidato_id` int NOT NULL AUTO_INCREMENT,
  `gender_id` int DEFAULT NULL,
  `city_id` int DEFAULT NULL,
  `countryOfOrigin_id` int DEFAULT NULL,
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `identificationDocument` varchar(50) DEFAULT NULL,
  `linkedinProfileUrl` varchar(255) DEFAULT NULL,
  `mobileNumber` varchar(50) DEFAULT NULL,
  `phoneNumber` varchar(50) DEFAULT NULL,
  `addressZipCode` varchar(8) DEFAULT NULL,
  `addressNumber` varchar(5) DEFAULT NULL,
  `addressStreet` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`candidato_id`),
  KEY `gender_id` (`gender_id`),
  KEY `city_id` (`city_id`),
  KEY `countryOfOrigin_id` (`countryOfOrigin_id`),
  CONSTRAINT `candidato_ibfk_1` FOREIGN KEY (`gender_id`) REFERENCES `gender` (`gender_id`),
  CONSTRAINT `candidato_ibfk_2` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`),
  CONSTRAINT `candidato_ibfk_3` FOREIGN KEY (`countryOfOrigin_id`) REFERENCES `country_Origin` (`countryOfOrigin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidato`
--

LOCK TABLES `candidato` WRITE;
/*!40000 ALTER TABLE `candidato` DISABLE KEYS */;
INSERT INTO `candidato` VALUES (1,2,2,1,'Maria','Silva','claudiosilva@email.com','1980-01-02','00000000-5','www.linkedin.com.br/claudio','11-99999-9999','11-5555-5555','00000000','50','Rua Claudio da Silva'),(2,1,2,1,'Maria','Silva','claudiosilva@email.com','1980-01-02','00000000-5','www.linkedin.com.br/claudio','11-99999-9999','11-5555-5555','00000000','50','Rua Claudio da Silva'),(3,3,3,1,'Claudio','Silva','claudiosilva@email.com','1980-01-02','00000000-5','www.linkedin.com.br/claudio','11-99999-9999','11-5555-5555','00000000','50','Rua Claudio da Silva');
/*!40000 ALTER TABLE `candidato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-18 20:17:12
