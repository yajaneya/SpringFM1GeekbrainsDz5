DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), price int, PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Milk', 50), ('Bred', 30), ('Solt', 15), ('Soda', 12), ('Tea', 110);
