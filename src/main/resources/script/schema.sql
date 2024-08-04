create database crud_gradle_db;

CREATE TABLE Products_db(
        id SERIAL PRIMARY KEY,
        productName VARCHAR(255),
        qty INTEGER,
        price NUMERIC
);
