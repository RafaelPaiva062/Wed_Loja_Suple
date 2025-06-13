drop table usuarios;
create database lojaSuple;
show tables;
use lojaSuple;
create table usuarios(
    id_usuario int primary key auto_increment,
    perfil varchar(255),
    email  varchar(200) not null,
    telefome varchar(200) not null,
    nome varchar(200) not null,
    login varchar(200) not null,
    senha varchar(200) not null,
    idade date not null,
    endereco varchar(255) not null
);
CREATE TABLE pagamentos (
id_pagamentos INT  PRIMARY KEY AUTO_INCREMENT,
id_usuario INT,
valor DECIMAL(10, 2),
data_pagamento DATETIME,
metodo_pagamento VARCHAR(50),
status VARCHAR(20),
FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);
