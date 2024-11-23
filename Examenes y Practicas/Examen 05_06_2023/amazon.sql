CREATE DATABASE amazon;

USE amazon;

CREATE TABLE objetos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100),
  peso INT,
  peligroso BOOLEAN
);

INSERT INTO objetos (nombre, peso, peligroso) VALUES
  ('Producto 1', 80, FALSE),
  ('Producto 2', 110, TRUE),
  ('Producto 3', 90, FALSE),
  ('Producto 4', 120, TRUE),
  ('Producto 5', 130, TRUE),
  ('Producto 6', 70, FALSE),
  ('Producto 7', 140, TRUE),
  ('Producto 8', 60, FALSE),
  ('Producto 9', 100, FALSE),
  ('Producto 10', 110, TRUE),
  ('Producto 11', 150, TRUE),
  ('Producto 12', 90, FALSE),
  ('Producto 13', 160, TRUE),
  ('Producto 14', 80, FALSE),
  ('Producto 15', 100, FALSE),
  ('Producto 16', 120, TRUE),
  ('Producto 17', 130, TRUE),
  ('Producto 18', 70, FALSE),
  ('Producto 19', 140, TRUE),
  ('Producto 20', 60, FALSE);
