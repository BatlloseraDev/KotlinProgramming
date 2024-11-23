CREATE DATABASE Examen2; -- Crea la base de datos (sólo si no existe)
USE Examen2; -- Selecciona la base de datos

-- Crea la tabla guerreras
CREATE TABLE guerreras (
  id INT AUTO_INCREMENT PRIMARY KEY,
  esperanzadevida INT DEFAULT 120,
  nombre VARCHAR(255),
  edad INT,
  indice_inteligencia INT,
  fuerza INT
);

-- Inserta 15 registros en la tabla guerreras
INSERT INTO guerreras (nombre, edad, indice_inteligencia, fuerza)
VALUES ('Guerrera1', 25, 8, 30),
       ('Guerrera2', 30, 7, 35),
       ('Guerrera3', 28, 6, 25),
       ('Guerrera4', 32, 9, 40),
       ('Guerrera5', 27, 8, 30),
       ('Guerrera6', 29, 7, 35),
       ('Guerrera7', 26, 6, 25),
       ('Guerrera8', 30, 9, 40),
       ('Guerrera9', 31, 8, 30),
       ('Guerrera10', 28, 7, 35),
       ('Guerrera11', 33, 6, 25),
       ('Guerrera12', 27, 9, 40),
       ('Guerrera13', 29, 8, 30),
       ('Guerrera14', 26, 7, 35),
       ('Guerrera15', 31, 6, 25);
