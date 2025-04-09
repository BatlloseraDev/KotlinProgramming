-- Crear la base de datos Protectora si no existe
CREATE DATABASE IF NOT EXISTS Protectora;

-- Seleccionar la base de datos Protectora
USE Protectora;

-- Crear la tabla de animales
CREATE TABLE IF NOT EXISTS animales (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100),
    Tipo VARCHAR(50),
    Sexo VARCHAR(50),
    Edad INT,
    Sociable BOOLEAN,
    Apadrinado BOOLEAN,
    Raza VARCHAR(100),
    Tamaño DECIMAL(5,2),
    PPP BOOLEAN,
    Leishmania BOOLEAN,
    Esterilizado BOOLEAN
);

-- Insertar datos de los animales
INSERT INTO animales (Nombre, Tipo, Sexo, Edad, Sociable, Apadrinado, Raza, Tamaño, PPP, Leishmania, Esterilizado)
VALUES 
    ('Max', 'Perro', 'Macho', 3, TRUE, FALSE, 'Labrador', 25.00, FALSE, FALSE, FALSE),
    ('Luna', 'Gato', 'Hembra', 2, TRUE, TRUE, NULL, NULL, NULL, NULL, TRUE),
    ('Rocky', 'Perro', 'Macho', 5, FALSE, TRUE, 'Bulldog', 30.00, TRUE, TRUE, FALSE),
    ('Simba', 'Gato', 'Macho', 1, TRUE, FALSE, NULL, NULL, NULL, NULL, TRUE),
    ('Lila', 'Perro', 'Hembra', 2, TRUE, FALSE, 'Golden Retriever', 20.00, FALSE, FALSE, FALSE),
    ('Garfield', 'Gato', 'Macho', 4, TRUE, TRUE, NULL, NULL, NULL, NULL, FALSE),
    ('Nala', 'Gato', 'Hembra', 3, TRUE, FALSE, NULL, NULL, NULL, NULL, FALSE),
    ('Bruno', 'Perro', 'Macho', 4, TRUE, FALSE, 'Boxer', 28.00, FALSE, TRUE, FALSE),
    ('Toby', 'Perro', 'Macho', 1, TRUE, TRUE, 'Chihuahua', 3.50, FALSE, FALSE, TRUE),
    ('Bella', 'Gato', 'Hembra', 5, TRUE, FALSE, NULL, NULL, NULL, NULL, TRUE),
    ('Buddy', 'Perro', 'Macho', 7, TRUE, TRUE, 'Beagle', 15.00, FALSE, FALSE, FALSE),
    ('Oreo', 'Gato', 'Hembra', 2, TRUE, FALSE, NULL, NULL, NULL, NULL, TRUE),
    ('Lucy', 'Perro', 'Hembra', 3, TRUE, FALSE, 'Cocker Spaniel', 18.00, FALSE, FALSE, TRUE),
    ('Leo', 'Gato', 'Macho', 6, FALSE, FALSE, NULL, NULL, NULL, NULL, FALSE),
    ('Molly', 'Perro', 'Hembra', 4, TRUE, TRUE, 'Dálmata', 22.00, FALSE, TRUE, FALSE),
    ('Whiskers', 'Gato', 'Macho', 2, TRUE, FALSE, NULL, NULL, NULL, NULL, FALSE),
    ('Lucky', 'Perro', 'Macho', 8, FALSE, FALSE, 'Pastor Alemán', 30.00, TRUE, FALSE, TRUE),
    ('Sasha', 'Gato', 'Hembra', 1, TRUE, FALSE, NULL, NULL, NULL, NULL, FALSE),
    ('Rocky', 'Perro', 'Macho', 2, TRUE, FALSE, 'Pitbull', 28.00, TRUE, FALSE, TRUE),
    ('Ginger', 'Gato', 'Hembra', 7, TRUE, TRUE, NULL, NULL, NULL, NULL, TRUE);


-- Crear la tabla gastofecha
CREATE TABLE IF NOT EXISTS gastofecha (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    fecha VARCHAR(50),
    gasto DOUBLE
);

-- Insertar registros en la tabla gastofecha
INSERT INTO gastofecha (fecha, gasto) VALUES 
    ('2024-05-01', 100.50),
    ('2024-05-03', 75.20),
    ('2024-05-08', 120.75),
    ('2024-05-12', 90.00);
