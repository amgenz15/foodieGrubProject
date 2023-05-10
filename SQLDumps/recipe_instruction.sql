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
-- Table structure for table `recipe_instruction`
--

DROP TABLE IF EXISTS `recipe_instruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe_instruction` (
  `id` int NOT NULL AUTO_INCREMENT,
  `instruction` varchar(750) NOT NULL,
  `instruction_order` int NOT NULL,
  `recipe_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `recipe_instruction_recipes_id_fk` (`recipe_id`),
  CONSTRAINT `recipe_instruction_recipes_id_fk` FOREIGN KEY (`recipe_id`) REFERENCES `recipes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=793 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipe_instruction`
--

LOCK TABLES `recipe_instruction` WRITE;
/*!40000 ALTER TABLE `recipe_instruction` DISABLE KEYS */;
INSERT INTO `recipe_instruction` VALUES (1,'Wash Chicken breast then pat dry. Cut into thin strips. ',1,1),(2,'Boil fettucine pasta according to box instructions, when ready se aside.',2,1),(3,'Heat a non-stick pan with olive oil and add chicken strips. Cook for 6-7 minutes on each side until golden brown, on medium heat. Remove chicken from pan when ready and set aside.',3,1),(4,'Add minced garlic and saute for 3 minutes. Deglaze pan with chicken stock, add lemon juice and bring to boil.',4,1),(5,'Add heavy cream, then add the cooked pasta and chicken.',5,1),(6,'Add parmesan and stir until everything is well combined.',6,1),(7,'Sprinkle with parsley and enjoy!',7,1),(8,'Place eggs in a saucepan and cover with cold water. Bring water to a boil and immediately remove from heat. Cover and let eggs stand in hot water for 10 - 12 minutes. Remove from hot water, cool, peel, and chop.',1,2),(9,'Place chopped eggs in a bowl, stir in mayonnaise, green onion, and mustard. Season with paprika, salt, and pepper. Stir and serve on your favorite bread or crackers.',2,2),(10,'Preheat oven to 375 degrees. Spray 9-inch pie pan with non-stick cooking spray.',1,3),(11,'Place hashbrowns in pan and drizzle with melted butter. Bake 20 minutes and remove from oven.',2,3),(12,'Combine eggs, milk and salt in a medium bowl and wisk thoroughly. Set aside. ',3,3),(13,'Evenly layer cheddar cheese, swiss cheese and ham on top of cooked hashbrowns. Pour egg mixtue over top. ',4,3),(14,'Bake at 350 degrees for 40 minutes or until eggs are set. Remove from oven and let sit for 3 to 5 minutes. Serve warm. ',5,3);
/*!40000 ALTER TABLE `recipe_instruction` ENABLE KEYS */;
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
