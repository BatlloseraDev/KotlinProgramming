-- Crear la base de datos
CREATE DATABASE CRUD;
USE CRUD;

-- Crear la tabla de usuarios
CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    nombre VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    edad INT NOT NULL,
    claveAcceso VARCHAR(255) NOT NULL,
    rol ENUM('ESTANDAR', 'ADMINISTRADOR', 'AMBOS') NOT NULL
);

-- Crear la tabla de estadísticas de juego
CREATE TABLE EstadisticasJuego (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    partidasJugadas INT NOT NULL,
    partidasGanadas INT NOT NULL,
    FOREIGN KEY (userId) REFERENCES Usuarios(id)
);

-- Insertar usuarios
INSERT INTO Usuarios (email, nombre, apellidos, edad, claveAcceso, rol) VALUES
('admin@example.com', 'Admin', 'Admin', 30, 'admin123', 'ADMINISTRADOR'),
('usuario1@example.com', 'Usuario', 'Uno', 25, 'usuario123', 'ESTANDAR'),
('usuario2@example.com', 'Usuario', 'Dos', 28, 'usuario456', 'ESTANDAR'),
('ambos@example.com', 'Ambos', 'Ambos', 35, 'ambos789', 'AMBOS');

-- Insertar estadísticas de juego
INSERT INTO EstadisticasJuego (userId, partidasJugadas, partidasGanadas) VALUES
(2, 40, 20),
(3, 35, 15),
(4, 45, 30);
