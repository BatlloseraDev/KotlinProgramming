CREATE DATABASE Viajes22;

USE Viajes22;

CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50),
  fecha_nacimiento DATE
);

INSERT INTO usuario (nombre, fecha_nacimiento) VALUES 
  ('Juan Pérez', '1990-01-15'),
  ('María García', '1985-06-23'),
  ('Ana Gómez', '1995-03-08'),
  ('Carlos López', '1978-11-04'),
  ('Laura Fernández', '2001-09-12');

CREATE TABLE destinos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50),
  precio INT,
  disponible BOOLEAN,
  duracion INT
);

INSERT INTO destinos (nombre, precio, disponible, duracion) VALUES 
  ('Destino 1', 1000, TRUE, 3),
  ('Destino 2', 1500, TRUE, 5),
  ('Destino 3', 800, FALSE, 4),
  ('Destino 4', 2000, TRUE, 7),
  ('Destino 5', 1200, TRUE, 6);

CREATE TABLE ciudades (
  id INT AUTO_INCREMENT PRIMARY KEY,
  ciudad VARCHAR(50)
);

INSERT INTO ciudades (ciudad) VALUES 
  ('Madrid'),
  ('Barcelona'),
  ('Valencia'),
  ('Sevilla'),
  ('Bilbao');

CREATE TABLE ruta (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_destino INT,
  id_ciudad INT,
  FOREIGN KEY (id_destino) REFERENCES destinos(id),
  FOREIGN KEY (id_ciudad) REFERENCES ciudades(id)
);

INSERT INTO ruta (id_destino, id_ciudad) VALUES 
  (1, 1),
  (1, 2),
  (1, 3),
  (2, 1),
  (2, 4),
  (2, 5),
  (3, 1),
  (3, 2),
  (4, 2),
  (4, 3),
  (4, 4),
  (4, 5),
  (5, 3),
  (5, 4),
  (5, 5);

CREATE TABLE viaje (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_usuario INT,
  id_destino INT,
  fecha_viaje DATE,
  pagado BOOLEAN,
  FOREIGN KEY (id_usuario) REFERENCES usuario(id),
  FOREIGN KEY (id_destino) REFERENCES destinos(id)
);

INSERT INTO viaje (id_usuario, id_destino, fecha_viaje, pagado) VALUES 
  (1, 1, '2023-06-15', TRUE),
  (2, 3, '2023-07-10', FALSE),
  (3, 2, '2023-08-20', TRUE),
  (4, 4, '2023-09-05', FALSE),
  (5, 5, '2023-10-12', TRUE);
