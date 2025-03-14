-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-02-2023 a las 15:56:09
-- Versión del servidor: 10.4.17-MariaDB
-- Versión de PHP: 7.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `supermercado`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `cod_grupo` int(3) NOT NULL,
  `descripcion` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`cod_grupo`, `descripcion`) VALUES
(1, 'Fruteria'),
(2, 'Carnes'),
(3, 'Pescado'),
(4, 'Perfumeria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `DNI` int(10) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `puesto` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`DNI`, `nombre`, `puesto`) VALUES
(1111, 'Pedro', 1),
(2222, 'Antonio', 2),
(3333, 'Isabel', 3),
(4444, 'Ana', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `COD_PROD` int(11) NOT NULL,
  `COD_CAT` int(3) DEFAULT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL,
  `CANT` int(5) DEFAULT NULL,
  `PRECIO` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`COD_PROD`, `COD_CAT`, `NOMBRE`, `CANT`, `PRECIO`) VALUES
(1, 1, 'Manzana', 100, 5),
(2, 1, 'Mandarina', 120, 6),
(3, 1, 'Pera', 110, 4),
(4, 2, 'Ternera', 20, 16),
(5, 2, 'Pollo', 30, 12),
(6, 2, 'Jamón', 45, 20),
(7, 3, 'Lubina', 67, 25),
(8, 3, 'Atún', 100, 26),
(9, 3, 'Merluza', 110, 22),
(10, 4, 'Crema', 150, 15),
(11, 4, 'Colonia', 100, 13),
(12, 4, 'Gel', 160, 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`cod_grupo`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `fk_puesto` (`puesto`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`COD_PROD`),
  ADD KEY `COD_CAT` (`COD_CAT`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `fk_puesto` FOREIGN KEY (`puesto`) REFERENCES `categorias` (`cod_grupo`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `PRODUCTOS_ibfk_1` FOREIGN KEY (`COD_CAT`) REFERENCES `categorias` (`cod_grupo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
