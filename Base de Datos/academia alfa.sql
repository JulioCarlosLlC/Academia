-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-03-2017 a las 06:41:21
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `academia`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getListaAlumno` ()  NO SQL
begin
	select * from alumno;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getListaCiclo` ()  NO SQL
begin
	select * from ciclo;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getListaMatricula` ()  NO SQL
BEGIN
	SELECT *FROM matricula;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getListaNotas` ()  NO SQL
BEGIN
	SELECT * FROM notas;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getListaSede` ()  NO SQL
begin
	select * from sede;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getLogin` (IN `_usuario` VARCHAR(40))  NO SQL
BEGIN
	SELECT clave FROM login where usuario=_usuario LIMIT 1 ;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getRegistrarAlumno` (IN `_codigo` VARCHAR(10), IN `_nombre` VARCHAR(20), IN `_apellido` VARCHAR(40))  NO SQL
BEGIN
	INSERT INTO alumno (codigo,nombre,apellidos) VALUES (_codigo,_nombre,_apellido);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getRegistrarCiclo` (IN `_codigo_ciclo` VARCHAR(10), IN `_nombre_ciclo` VARCHAR(10))  NO SQL
BEGIN
	INSERT INTO ciclo (IdCiclo,NomCiclo) VALUES (_codigo_ciclo,_nombre_ciclo);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getRegistrarLogin` (IN `_codigo_alumno` VARCHAR(10), IN `_nombre` VARCHAR(40), IN `_clave` VARCHAR(32))  NO SQL
BEGIN
	INSERT INTO login (codigo,usuario,clave) VALUES (_codigo_alumno,_nombre,_clave);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getRegistrarMatricula` (IN `_cod_matricula` VARCHAR(10), IN `_cod_alumno` VARCHAR(10), IN `_idsede` VARCHAR(10), IN `_idciclo` VARCHAR(10), IN `_turno` VARCHAR(2))  NO SQL
BEGIN

    INSERT INTO matricula (codMatricula,codAlumno,IdSede,IdCiclo,turno) VALUES (_cod_matricula,_cod_alumno,_idsede,_idciclo,_turno);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getRegistrarNotas` (IN `_codigo` VARCHAR(10), IN `_esemanal` FLOAT, IN `_emensual` FLOAT, IN `_esimulacro` FLOAT)  NO SQL
BEGIN
	INSERT INTO notas (codAlum,semanal,mensual,simulacro) VALUES (_codigo,_esemanal,_emensual,_esimulacro);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `usp_getRegistrarSede` (IN `_codigo_sede` VARCHAR(10), IN `_nombre_sede` VARCHAR(20))  NO SQL
BEGIN
	INSERT INTO sede (IdSede,NomSede) VALUES (_codigo_sede,_nombre_sede);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `codigo` varchar(10) CHARACTER SET utf8 NOT NULL,
  `nombre` varchar(20) CHARACTER SET utf8 NOT NULL,
  `apellidos` varchar(40) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`codigo`, `nombre`, `apellidos`) VALUES
('1001019931', 'Julio Carlos', 'Llactahuaman Cuadros'),
('1001019932', 'Kevin', 'Molina Vera'),
('1001019933', 'Richard', 'Navarro Vega');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciclo`
--

CREATE TABLE `ciclo` (
  `IdCiclo` varchar(10) CHARACTER SET utf8 NOT NULL,
  `NomCiclo` varchar(10) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `codigo` varchar(10) CHARACTER SET utf8 NOT NULL,
  `usuario` varchar(40) CHARACTER SET utf8 NOT NULL,
  `clave` varchar(100) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`codigo`, `usuario`, `clave`) VALUES
('1001019931', 'Llactahuaman Cuadros', 'f37b21a4656647c7d07aede7cd3c8d96');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `codMatricula` varchar(10) CHARACTER SET utf8 NOT NULL,
  `codAlumno` varchar(10) CHARACTER SET utf8 NOT NULL,
  `IdSede` varchar(10) CHARACTER SET utf8 NOT NULL,
  `IdCiclo` varchar(10) CHARACTER SET utf8 NOT NULL,
  `turno` varchar(2) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE `notas` (
  `codAlum` varchar(10) CHARACTER SET utf8 NOT NULL,
  `semanal` float NOT NULL,
  `mensual` float NOT NULL,
  `simulacro` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sede`
--

CREATE TABLE `sede` (
  `IdSede` varchar(10) CHARACTER SET utf8 NOT NULL,
  `NomSede` varchar(20) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `ciclo`
--
ALTER TABLE `ciclo`
  ADD PRIMARY KEY (`IdCiclo`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD KEY `codAlum` (`codigo`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`codMatricula`),
  ADD KEY `codAlum` (`codAlumno`,`IdSede`,`IdCiclo`),
  ADD KEY `IdCiclo` (`IdCiclo`),
  ADD KEY `IdSede` (`IdSede`);

--
-- Indices de la tabla `notas`
--
ALTER TABLE `notas`
  ADD KEY `codAlum` (`codAlum`);

--
-- Indices de la tabla `sede`
--
ALTER TABLE `sede`
  ADD PRIMARY KEY (`IdSede`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`codigo`) REFERENCES `alumno` (`codigo`);

--
-- Filtros para la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`codAlumno`) REFERENCES `alumno` (`codigo`),
  ADD CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`IdCiclo`) REFERENCES `ciclo` (`IdCiclo`),
  ADD CONSTRAINT `matricula_ibfk_3` FOREIGN KEY (`IdSede`) REFERENCES `sede` (`IdSede`);

--
-- Filtros para la tabla `notas`
--
ALTER TABLE `notas`
  ADD CONSTRAINT `notas_ibfk_1` FOREIGN KEY (`codAlum`) REFERENCES `alumno` (`codigo`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
