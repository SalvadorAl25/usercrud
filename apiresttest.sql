-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: apiresttest
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `issues`
--

DROP TABLE IF EXISTS `issues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `issues` (
  `issues_id` bigint NOT NULL AUTO_INCREMENT,
  `date_create` date DEFAULT NULL,
  `date_finish` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `tittle` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`issues_id`),
  KEY `FKcigc16s3flsg53i2sy0m37e` (`user_id`),
  CONSTRAINT `FKcigc16s3flsg53i2sy0m37e` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issues`
--

LOCK TABLES `issues` WRITE;
/*!40000 ALTER TABLE `issues` DISABLE KEYS */;
INSERT INTO `issues` VALUES (1,'2023-07-10','2023-07-14','Realizar Reportes','Reportes',2);
/*!40000 ALTER TABLE `issues` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `role_id` bigint NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'Administrador'),(2,'Recursos Humanos'),(3,'Contabilidad'),(4,'Sistemas'),(5,'Almacen'),(6,'Acondicionamiento'),(7,'Calidad'),(8,'Mantenimiento');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedules`
--

DROP TABLE IF EXISTS `schedules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedules` (
  `schedule_id` bigint NOT NULL AUTO_INCREMENT,
  `fri_break` time DEFAULT NULL,
  `fri_exit` time DEFAULT NULL,
  `fri_in` time DEFAULT NULL,
  `mon_break` time DEFAULT NULL,
  `mon_exit` time DEFAULT NULL,
  `mon_in` time DEFAULT NULL,
  `thu_break` time DEFAULT NULL,
  `thu_exit` time DEFAULT NULL,
  `thu_in` time DEFAULT NULL,
  `tue_break` time DEFAULT NULL,
  `tue_exit` time DEFAULT NULL,
  `tue_in` time DEFAULT NULL,
  `wed_break` time DEFAULT NULL,
  `wed_exit` time DEFAULT NULL,
  `wed_in` time DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`schedule_id`),
  KEY `FKd4y4xekwahv9boo6lc8gfl3jv` (`user_id`),
  CONSTRAINT `FKd4y4xekwahv9boo6lc8gfl3jv` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedules`
--

LOCK TABLES `schedules` WRITE;
/*!40000 ALTER TABLE `schedules` DISABLE KEYS */;
INSERT INTO `schedules` VALUES (1,'15:00:00','18:00:00','09:00:00','14:00:00','18:00:00','09:00:00','15:00:00','18:00:00','09:00:00','15:00:00','18:00:00','09:00:00','15:00:00','18:00:00','09:00:00',2);
/*!40000 ALTER TABLE `schedules` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `date_birthday` date DEFAULT NULL,
  `img_profile` varchar(255) DEFAULT NULL,
  `rfc` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_last_name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `role_id` bigint DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKp56c1712k691lhsyewcssf40f` (`role_id`),
  CONSTRAINT `FKp56c1712k691lhsyewcssf40f` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (2,'Carr. Colima - Coquimatlan km 8.5','Coquimatlan','Mexico','1990-12-25','profile-image-id_raul@mail.com_Recursos Humanos.jpg','SURR9012259S10','Colima',_binary '','raul@mail.com','Suarez Rosales','Raul',2),(3,'Carr. Colima - Coquimatlan km 8.5','Coquimatlan','Mexico','1990-12-25','profile-image-id_raul@mail.com_Recursos Humanos.jpg','SURR9012259S10','Colima',_binary '','raul@mail.com','Suarez Rosales','Raul',2),(4,'Belisario Dominguz 117','Leon','Mexico','1989-07-24','profile-image-id_miriam@mail.com_Contabilidad.jpg','ROCM890724UW10','Guanajuato',_binary '','miriam@mail.com','Rodrigez Catalan','Miriam',3),(5,'Bolivia 203','Monterrey','Mexico','1997-05-19','profile-image-id_fer@mail.com_Almacen.jpg','ZASF9705194J5','Nuevo Leon',_binary '\0','fer@mail.com','Zapien Salas','Fernando',5),(6,'Av Hidalgo 1915','Tampico','Mexico','2004-01-06','profile-image-id_jose@mail.com_Sistemas.jpg','MOOL0401068W9','Tamaulipas',_binary '','jose@mail.com','Morales Olivera','Jose Luis',4),(7,'Av South San Francisco 159','Atotonilco El Alto','Mexico','1994-03-17','profile-image-id_pau@mail.com_Calidad.jpg','VIAP940317QD3','Jalisco',_binary '\0','pau@mail.com','Villaseñor Acosta','Paulina',7),(8,'Av Cuauhtemoc 462','Benito Juarez','Mexico','1994-11-18','profile-image-id_juan@mail.com_Sistemas.jpg','EIAJ941118K62','Distrito Federal',_binary '\0','juan@mail.com','Espinoza Alvarez','Juan Luis',4);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'apiresttest'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-01 19:19:32
