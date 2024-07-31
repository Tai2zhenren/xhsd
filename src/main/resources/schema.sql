-- 用户表
CREATE TABLE IF NOT EXISTS user (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    role VARCHAR(50)
    );

-- 商品表
CREATE TABLE IF NOT EXISTS product (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       name VARCHAR(100) NOT NULL,
    description TEXT,
    price DOUBLE NOT NULL
    );

-- 订单表
CREATE TABLE IF NOT EXISTS `order` (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       status VARCHAR(50) NOT NULL
    );

-- 订单项表
CREATE TABLE IF NOT EXISTS order_item (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          order_id BIGINT,
                                          product_id BIGINT,
                                          quantity INT,
                                          price DOUBLE,
                                          FOREIGN KEY (order_id) REFERENCES `order`(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
    );

-- 供应商表
CREATE TABLE IF NOT EXISTS supplier (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        name VARCHAR(100) NOT NULL,
    contact_info TEXT
    );

-- 发票表
CREATE TABLE IF NOT EXISTS invoice (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       invoice_number VARCHAR(50) NOT NULL,
    amount DOUBLE NOT NULL,
    status VARCHAR(50)
    );

-- 物流表
CREATE TABLE IF NOT EXISTS shipping (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        tracking_number VARCHAR(50) NOT NULL,
    status VARCHAR(50)
    );
