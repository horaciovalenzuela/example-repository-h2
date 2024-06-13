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

CREATE TABLE IF NOT EXISTS order_products (
    order_id BIGINT,
    product_id BIGINT,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

CREATE TABLE IF NOT EXISTS user_orders (
    user_id BIGINT,
    order_id BIGINT,
    PRIMARY KEY (user_id, order_id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);

INSERT INTO users (name, surname, age) VALUES ('Juan', 'Pérez', 32);
INSERT INTO users (name, surname, age) VALUES ('María', 'García', 25);
INSERT INTO users (name, surname, age) VALUES ('Carlos', 'Rodríguez', 42);
INSERT INTO users (name, surname, age) VALUES ('Ana', 'López', 34);

/*
INSERT INTO products (price, description) VALUES (500.00, 'Smartphone de última generación');
INSERT INTO products (price, description) VALUES (100.00, 'Auriculares inalámbricos con cancelación de ruido');

INSERT INTO orders (description, user_id) VALUES ('Compra de teléfono móvil y auriculares inalámbricos', 1);
INSERT INTO orders (description, user_id) VALUES ('Compra de teléfono móvil', 2);
*/
