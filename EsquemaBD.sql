-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.14-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para tienda
CREATE DATABASE IF NOT EXISTS `tienda` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `tienda`;

-- Volcando estructura para tabla tienda.movimientos
CREATE TABLE IF NOT EXISTS `movimientos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_producto` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_tipo_mov` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_producto` (`id_producto`),
  KEY `FK_tpo_movimiento` (`id_tipo_mov`),
  CONSTRAINT `FK_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`),
  CONSTRAINT `FK_tpo_movimiento` FOREIGN KEY (`id_tipo_mov`) REFERENCES `tipo_movimiento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tienda.movimientos: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
INSERT INTO `movimientos` (`id`, `id_producto`, `fecha`, `id_tipo_mov`, `cantidad`) VALUES
	(1, 1, '2018-12-15 22:45:55', 2, 10),
	(2, 2, '2018-12-15 22:46:44', 2, 10),
	(3, 3, '2018-12-15 21:47:14', 2, 10),
	(4, 4, '2018-12-15 22:47:35', 2, 10),
	(5, 5, '2018-12-15 22:47:55', 2, 10),
	(6, 1, '2018-12-18 22:51:37', 1, 3),
	(7, 2, '2018-12-18 22:51:37', 1, 3),
	(8, 3, '2018-12-18 22:51:37', 1, 3),
	(9, 4, '2018-12-18 22:51:37', 1, 3),
	(10, 5, '2018-12-18 22:51:37', 1, 3);
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;

-- Volcando estructura para tabla tienda.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `costo` double NOT NULL,
  `venta` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tienda.producto: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` (`id`, `nombre`, `costo`, `venta`) VALUES
	(1, 'Lapiz', 500, 1000),
	(2, 'Cuaderno', 1000, 1500),
	(3, 'Block', 2000, 2500),
	(4, 'Maletin', 70000, 80000),
	(5, 'Lapicero', 700, 1500);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

-- Volcando estructura para tabla tienda.tipo_movimiento
CREATE TABLE IF NOT EXISTS `tipo_movimiento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla tienda.tipo_movimiento: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_movimiento` DISABLE KEYS */;
INSERT INTO `tipo_movimiento` (`id`, `descripcion`) VALUES
	(1, 'Venta'),
	(2, 'Compra');
/*!40000 ALTER TABLE `tipo_movimiento` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
