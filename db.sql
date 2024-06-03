create table hospital(
id int2 primary key AUTO_INCREMENT,
nome_hospital varchar(255) not null unique,
endereco text not NULL
);

create table tipo_utilizador(
    id int2 primary key not null AUTO_INCREMENT,
    descricao VARCHAR(70) not null unique
);

create table utilizador (
id int2 not null PRIMARY key AUTO_INCREMENT,
nome_completo varchar(255),
username VARCHAR(50) unique not null,
senha VARCHAR(30) not null,
tipo_utilizador integer not null,
hospital integer not null,
FOREIGN KEY (tipo_utilizador) REFERENCES tipo_utilizador (id),
FOREIGN KEY (hospital) REFERENCES hospital (id)
);


create table doente (
    nid varchar(5),
    distrito_nascimento varchar(75),
    provincia_nascimento varchar(75),
    data_nascimento date,
    categoria varchar(75),
    carreira varchar(75),
    nome varchar(175),
    nivel_carreira varchar(25),
    sexo varchar(15),
    provincia_residencia varchar(75),
    distrito_residencia varchar(75),
    morada varchar(175),
    sector_trabalho varchar(175)
);

create table caso (
    id BIGINT not NULL primary key AUTO_INCREMENT,
    nid varchar(5) not null,
    data_registo_caso datetime not null,
    local_da_us varchar(75) not null,
    us_de_assistencia varchar(75) not null,
    estabelecimento_saude varchar(75) not null,
    consulta_medica varchar(75) not null,
    enfermidade varchar(75) not null,
    rastreio varchar(75) not null,
    diagnostico varchar(75) not null,
    aon varchar(75) not null,
    apss varchar(75) not null,
    esp_anterior varchar(75) not null,
    data_consulta_anterior datetime not null,
    esp_actual varchar(75) not null,
    data_consulta_actual datetime not null,
    data_proxima datetime not null,
    esp_proximo varchar(75) not null,
    situacao_actual_paciente varchar(75) not null,
    data_facelimento datetime not null,
    observacao VARCHAR(120) not null,
    foreign key (nid) references doente (nid)
);