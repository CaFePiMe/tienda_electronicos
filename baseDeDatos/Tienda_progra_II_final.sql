-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-05-29 21:24:41.45

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
    id_com int  NOT NULL,
    id_pro int  NOT NULL,
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

-- Table: producto
CREATE TABLE producto (
    id_pro int  NOT NULL,
    id_prv int  NOT NULL,
    id_cat int  NOT NULL,
    nombre varchar(50)  NOT NULL,
    descripcion varchar(50)  NOT NULL,
    precio decimal(10,2)  NOT NULL,
    stock int  NOT NULL,
    imagen varchar(50)  NOT NULL,
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

-- Reference: carro_compra (table: carro)
ALTER TABLE carro ADD CONSTRAINT carro_compra
    FOREIGN KEY (id_com)
    REFERENCES compra (id_com)  
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

-- Insert into usuario
INSERT INTO usuario (id_usu, email, nombre, password, nit, admin, activo)
VALUES (0, 'admin@admin.com', 'admin', 'admi123', 000, TRUE, 1);

-- Insert into proveedor
INSERT INTO proveedor (id_prv, nombre, nit, activo)
VALUES (0, 'nuestro', 00000000, 1);

-- Insert into categoria
INSERT INTO categoria (id_cat, nombre, descripcion, activo)
VALUES (0, 'nula', 'nula', 1);

-- Insert into producto
INSERT INTO producto (id_pro, id_prv, id_cat, nombre, descripcion, precio, stock, imagen, activo)
VALUES (0, 0, 0, 'nula', 'nula', 0, 0, 'nula', 1);

-- Insert into compra
INSERT INTO compra (id_com, id_usu, total, estado, fecha, activo)
VALUES (0, 0, 0, 'nula', '0001-01-01', 1);

-- Insert into carro
INSERT INTO carro (id_car, id_com, id_pro, cantidad, precio, activo)
VALUES (0, 0, 0, 0, 0, 1);

-- Insert into Valoracion
INSERT INTO Valoracion (id_val, id_usu, id_pro, valoracion, comentario, activo)
VALUES (0, 0, 0, 0, 'nula', 1);

-- End of file.


