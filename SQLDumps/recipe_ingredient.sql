CREATE DATABASE  IF NOT EXISTS `foodieGrub` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `foodieGrub`;
-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: foodieGrub
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `recipe_ingredient`
--

DROP TABLE IF EXISTS `recipe_ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe_ingredient` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ingredient` varchar(30) NOT NULL,
  `ingredient_amount` varchar(20) DEFAULT NULL,
  `ingredient_amount_measurement` varchar(30) DEFAULT NULL,
  `recipe_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `recipe_ingredient_recipes_id_fk` (`recipe_id`),
  CONSTRAINT `recipe_ingredient_recipes_id_fk` FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=802 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipe_ingredient`
--

LOCK TABLES `recipe_ingredient` WRITE;
/*!40000 ALTER TABLE `recipe_ingredient` DISABLE KEYS */;
INSERT INTO `recipe_ingredient` VALUES (1,'Chicken breast ','1',NULL,1),(2,'Fettuccini noodles','1','pound',1),(3,'Extra virgin olive oil','3','tbsp',1),(4,'Chicken stock','1 1/2','cup',1),(5,'Garlic clove','1',NULL,1),(6,'Heavy cream','1 1/2','cup',1),(7,'Parmesan','1','cup',1),(8,'Parsley','1/4','cup',1),(9,'Lemon (Juice)','1',NULL,1),(10,'Eggs','8',NULL,2),(11,'Mayonnaise','1/2','cup',2),(12,'Chopped Green Onion','1/4','cup',2),(13,'Yellow mustard','1','teaspoon',2),(14,'Paprika','1/4','teaspoon',2),(15,'Salt and pepper to taste',NULL,NULL,2),(16,'Frozen hashbrowns, thawed ','1','bag',3),(17,'Salted butter, melted','1/4','cup',3),(18,'Eggs','3',NULL,3),(19,'Milk','1','cup',3),(20,'Salt','1','teaspoon',3),(21,'Shredded mild cheddar cheese','1','cup',3),(22,'Shredded swiss cheese','1','cup',3),(23,'Diced ham','1','cup',3);
/*!40000 ALTER TABLE `recipe_ingredient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-10 16:42:19
