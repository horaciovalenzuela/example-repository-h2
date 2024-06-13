CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    age INT NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255) NOT NULL,
    age INT NOT NULL
);

CREATE TABLE IF NOT EXISTS orders (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255),
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS products (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    price DOUBLE,
    description VARCHAR(255)
);

INSERT INTO users (name, surname, age) VALUES ('Juan', 'Pérez', 32);
INSERT INTO users (name, surname, age) VALUES ('María', 'García', 25);
INSERT INTO users (name, surname, age) VALUES ('Carlos', 'Rodríguez', 42);
INSERT INTO users (name, surname, age) VALUES ('Ana', 'López', 34);

INSERT INTO products (price, description) VALUES (500.00, 'Smartphone de última generación');
INSERT INTO products (price, description) VALUES (100.00, 'Auriculares inalámbricos con cancelación de ruido');

INSERT INTO orders (description, user_id) VALUES ('Compra de teléfono móvil y auriculares inalámbricos', 1);
INSERT INTO orders (description, user_id) VALUES ('Compra de teléfono móvil', 2);


