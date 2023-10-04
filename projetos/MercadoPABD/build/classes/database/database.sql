create database mercado;

use mercado;

create table produto (
	codigo int not null,
    nome varchar(70) not null,
    descricao varchar(70) not null,
    valor double(5,2) not null,
    primary key (codigo)
);

create table funcionario (
	cpf char(14) not null,
    nome varchar(70) not null,
    endereco varchar(70) not null,
    cargo varchar(30) not null,
    salario double(5,2) not null,
    primary key (cpf)
);

truncate produto;
truncate funcionario;


select * from funcionario;
select * from produto;