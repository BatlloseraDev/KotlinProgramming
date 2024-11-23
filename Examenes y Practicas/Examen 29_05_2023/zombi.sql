-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS zombie;
USE zombie;

-- Crear la tabla "extremidades"
CREATE TABLE IF NOT EXISTS extremidades (
  id INT AUTO_INCREMENT,
  tipo VARCHAR(50),
  PRIMARY KEY (id)
);

-- Insertar los datos en la tabla "extremidades"
INSERT INTO extremidades (tipo) VALUES
  ('brazo'),
  ('cabeza'),
  ('brazo cortado'),
  ('pierna'),
  ('pierna cortada'),
  ('cabeza partida');

-- Crear la tabla "información"
CREATE TABLE IF NOT EXISTS informacion (
  id INT AUTO_INCREMENT,
  texto VARCHAR(255),
  PRIMARY KEY (id)
);

