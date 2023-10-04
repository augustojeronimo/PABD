create database teste;

use teste;

create table pessoa (
	cpf char(14) not null,
	nome varchar(45) not null,
	idade int,
	primary key (cpf)
);

describe pessoa;
SELECT * FROM pessoa;