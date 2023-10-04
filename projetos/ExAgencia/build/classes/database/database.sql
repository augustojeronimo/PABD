create database agencia;

use agencia;

create table agente (
	cpf char(14) not null,
    nome varchar(70) not null,
    endereco varchar(70) not null,
    telefone char(15) not null,  
    primary key (cpf)
);

select * from agente;