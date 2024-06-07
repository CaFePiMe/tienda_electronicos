-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-06-07 03:45:48.494

-- tables
-- Table: Valoracion
CREATE TABLE Valoracion (
    id_val int  NOT NULL,
    id_usu int  NOT NULL,
    id_pro int  NOT NULL,
    valoracion int  NOT NULL,
    comentario varchar(50)  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT Valoracion_pk PRIMARY KEY (id_val)
);

-- Table: carro
CREATE TABLE carro (
    id_car int  NOT NULL,
    id_pro int  NOT NULL,
    id_usu int  NOT NULL,
    cantidad int  NOT NULL,
    precio decimal(10,2)  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT carro_pk PRIMARY KEY (id_car)
);

-- Table: categoria
CREATE TABLE categoria (
    id_cat int  NOT NULL,
    nombre varchar(50)  NOT NULL,
    descripcion varchar(50)  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT categoria_pk PRIMARY KEY (id_cat)
);

-- Table: compra
CREATE TABLE compra (
    id_com int  NOT NULL,
    id_usu int  NOT NULL,
    total decimal(10,2)  NOT NULL,
    estado varchar(50)  NOT NULL,
    fecha date  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT compra_pk PRIMARY KEY (id_com)
);

-- Table: compra_carro
CREATE TABLE compra_carro (
    id_com int  NOT NULL,
    id_car int  NOT NULL,
    CONSTRAINT compra_carro_pk PRIMARY KEY (id_car,id_com)
);

-- Table: producto
CREATE TABLE producto (
    id_pro int  NOT NULL,
    id_prv int  NOT NULL,
    id_cat int  NOT NULL,
    nombre varchar(50)  NOT NULL,
    descripcion varchar(200)  NOT NULL,
    precio decimal(10,2)  NOT NULL,
    stock int  NOT NULL,
    imagen varchar(200)  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT producto_pk PRIMARY KEY (id_pro)
);

-- Table: proveedor
CREATE TABLE proveedor (
    id_prv int  NOT NULL,
    nombre varchar(50)  NOT NULL,
    nit int  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT proveedor_pk PRIMARY KEY (id_prv)
);

-- Table: usuario
CREATE TABLE usuario (
    id_usu int  NOT NULL,
    email varchar(50)  NOT NULL,
    nombre varchar(50)  NOT NULL,
    password varchar(50)  NOT NULL,
    nit int  NOT NULL,
    admin boolean  NOT NULL,
    activo int  NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (id_usu)
);

-- foreign keys
-- Reference: Valoracion_producto (table: Valoracion)
ALTER TABLE Valoracion ADD CONSTRAINT Valoracion_producto
    FOREIGN KEY (id_pro)
    REFERENCES producto (id_pro)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: Valoracion_usuario (table: Valoracion)
ALTER TABLE Valoracion ADD CONSTRAINT Valoracion_usuario
    FOREIGN KEY (id_usu)
    REFERENCES usuario (id_usu)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: carro_producto (table: carro)
ALTER TABLE carro ADD CONSTRAINT carro_producto
    FOREIGN KEY (id_pro)
    REFERENCES producto (id_pro)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: carro_usuario (table: carro)
ALTER TABLE carro ADD CONSTRAINT carro_usuario
    FOREIGN KEY (id_usu)
    REFERENCES usuario (id_usu)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: compra_carro_carro (table: compra_carro)
ALTER TABLE compra_carro ADD CONSTRAINT compra_carro_carro
    FOREIGN KEY (id_car)
    REFERENCES carro (id_car)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: compra_carro_compra (table: compra_carro)
ALTER TABLE compra_carro ADD CONSTRAINT compra_carro_compra
    FOREIGN KEY (id_com)
    REFERENCES compra (id_com)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: compra_usuario (table: compra)
ALTER TABLE compra ADD CONSTRAINT compra_usuario
    FOREIGN KEY (id_usu)
    REFERENCES usuario (id_usu)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: producto_categoria (table: producto)
ALTER TABLE producto ADD CONSTRAINT producto_categoria
    FOREIGN KEY (id_cat)
    REFERENCES categoria (id_cat)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: producto_proveedor (table: producto)
ALTER TABLE producto ADD CONSTRAINT producto_proveedor
    FOREIGN KEY (id_prv)
    REFERENCES proveedor (id_prv)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Insertando en la tabla proveedor
INSERT INTO proveedor (id_prv, nombre, nit, activo) VALUES (1, 'Proveedor A', 123456789, 1);
INSERT INTO proveedor (id_prv, nombre, nit, activo) VALUES (2, 'Proveedor B', 234567890, 1);

-- Insertando en la tabla categoria
INSERT INTO categoria (id_cat, nombre, descripcion, activo) VALUES (1, 'Categoria A', 'Descripción A', 1);
INSERT INTO categoria (id_cat, nombre, descripcion, activo) VALUES (2, 'Categoria B', 'Descripción B', 1);

-- Insertando en la tabla producto
INSERT INTO producto (id_pro, id_prv, id_cat, nombre, descripcion, precio, stock, imagen, activo) VALUES (1, 1, 1, 'Producto A', 'Descripción del Producto A', 100.00, 10, 'imagen.png', 1);
INSERT INTO producto (id_pro, id_prv, id_cat, nombre, descripcion, precio, stock, imagen, activo) VALUES (2, 2, 2, 'Producto B', 'Descripción del Producto B', 200.00, 20, 'imagen.png', 1);

-- Insertando en la tabla usuario
INSERT INTO usuario (id_usu, email, nombre, password, nit, admin, activo) VALUES (1, 'usuario1@example.com', 'Usuario 1', 'password1', 11111111, false, 1);
INSERT INTO usuario (id_usu, email, nombre, password, nit, admin, activo) VALUES (2, 'usuario2@example.com', 'Usuario 2', 'password2', 22222222, true, 1);

-- Insertando en la tabla carro
INSERT INTO carro (id_car, id_pro, id_usu, cantidad, precio, activo) VALUES (1, 1, 1, 5, 500.00, 1);
INSERT INTO carro (id_car, id_pro, id_usu, cantidad, precio, activo) VALUES (2, 2, 2, 3, 600.00, 1);

-- Insertando en la tabla compra
INSERT INTO compra (id_com, id_usu, total, estado, fecha, activo) VALUES (1, 1, 2500.00, 'Completada', '2024-06-07', 1);
INSERT INTO compra (id_com, id_usu, total, estado, fecha, activo) VALUES (2, 2, 1800.00, 'En Proceso', '2024-06-08', 1);

-- Insertando en la tabla compra_carro
INSERT INTO compra_carro (id_com, id_car) VALUES (1, 1);
INSERT INTO compra_carro (id_com, id_car) VALUES (2, 2);

-- Insertando en la tabla Valoracion
INSERT INTO Valoracion (id_val, id_usu, id_pro, valoracion, comentario, activo) VALUES (1, 1, 1, 5, 'Excelente producto', 1);
INSERT INTO Valoracion (id_val, id_usu, id_pro, valoracion, comentario, activo) VALUES (2, 2, 2, 4, 'Buen producto', 1);

-- End of file.


