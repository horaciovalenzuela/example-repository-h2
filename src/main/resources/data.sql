CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL
);


INSERT INTO users (nombre, apellido) VALUES ('Ada', 'Turing');
INSERT INTO users (nombre, apellido) VALUES ('Ada', 'Lovelace');