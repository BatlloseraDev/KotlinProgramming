CREATE DATABASE Alumnado;

USE Alumnado;

CREATE TABLE alumno (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50),
  edad INT,
  fecha_nacimiento DATE,
  matriculado BOOLEAN,
  PRIMARY KEY (id)
);

INSERT INTO alumno (id,nombre, edad, fecha_nacimiento, matriculado) VALUES 
(1, "Juan", 20, "2002-01-01", true),
(2, "María", 22, "2000-05-10", false),
(3, "Pedro", 19, "2003-03-15", true),
(4, "Luisa", 21, "2001-12-20", false),
(5, "Ana", 18, "2004-06-30", true),
(6, "Carlos", 20, "2002-09-01", true),
(7, "Lucía", 21, "2001-02-28", false),
(8, "Pablo", 22, "2000-07-15", true),
(9, "Sara", 19, "2003-11-10", false),
(10, "Javier", 21, "2001-12-25", true),
(11, "Marta", 20, "2002-04-05", false),
(12, "David", 19, "2003-08-20", true),
(13, "Carmen", 22, "2000-09-12", false),
(14, "Hugo", 21, "2001-05-18", true),
(15, "Alejandra", 18, "2004-03-01", false);

