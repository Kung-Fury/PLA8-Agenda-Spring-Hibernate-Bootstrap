drop database agenda;
create database agenda;
USE agenda;

CREATE TABLE `contactos` (
  `idcontacto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcontacto`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

insert into contactos(nombre, email, telefono)
VALUES	('aaaaa', 'cont1@gmail.com', '12345' ), 
		('bbbbb', 'cont2@gmail.com', '123456');
SELECT * FROM contactos;