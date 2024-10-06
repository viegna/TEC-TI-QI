CREATE TABLE Carro (
placa CHAR(7) NOT NULL,
cor VARCHAR(15) ,
observacoes VARCHAR(255) NOT NULL,
cod_renavam INTEGER NOT NULL,
cod_veiculo INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
modelo VARCHAR(30),
cod_cliente INTEGER
)

CREATE TABLE Cliente_fisico (
cli_fisico INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
cpf CHAR(11) NOT NULL,
cod_cliente INTEGER
)

CREATE TABLE Cliente_juridico (
cli_juridico INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
cnpj CHAR(14) NOT NULL ,
cod_cliente INTEGER
)

CREATE TABLE Motoristas (
cnh CHAR(11) NOT NULL,
rg CHAR(9) NOT NULL,
cpf CHAR(11) NOT NULL,
data_nasc DATETIME NOT NULL,
endereco VARCHAR(60) NOT NULL,
telefone CHAR(12) NOT NULL,
nome VARCHAR(40) NOT NULL,
idade NUMERIC(3) NOT NULL ZEROFILL,
cad_motorista INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
cod_veiculo INTEGER,
FOREIGN KEY(cod_veiculo) REFERENCES Carro (cod_veiculo)
)

CREATE TABLE aci_mo (
cad_motorista INTEGER,
id_acidente INTEGER,
FOREIGN KEY(cad_motorista) REFERENCES Motoristas (cad_motorista)
)

CREATE TABLE Acidentes (
descricao VARCHAR(255) NOT NULL,
data DATETIME NOT NULL,
hora DATETIME NOT NULL,
local VARCHAR(25) NOT NULL,
id_acidente INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT
)

CREATE TABLE Funcionario (
rg CHAR(10) NOT NULL,
data_admissao DATETIME NOT NULL,
endereco VARCHAR(60) NOT NULL,
cod_funcionario INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
inscricao_est INTEGER NOT NULL,
endereco1 VARCHAR(10) NOT NULL,
gerente VARCHAR(30) NOT NULL,
cnpj CHAR(14) NOT NULL,
numero_filial INTEGER NOT NULL,
telefone CHAR(12) NOT NULL,
data_inauguracao DATETIME NOT NULL,
nome VARCHAR(35) NOT NULL,
funcao VARCHAR(25) NOT NULL,
cpf CHAR(11) NOT NULL,
telefones CHAR(12) NOT NULL
)

CREATE TABLE endereco (
endereco_PK INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
cep CHAR(8) NOT NULL,
numero INTEGER NOT NULL,
rua VARCHAR(15) NOT NULL,
cod_cliente_FK INTEGER
)

CREATE TABLE car_aci (
cod_veiculo INTEGER,
id_acidente INTEGER,
FOREIGN KEY(cod_veiculo) REFERENCES Carro (cod_veiculo),
FOREIGN KEY(id_acidente) REFERENCES Acidentes (id_acidente)
)

CREATE TABLE Cliente (
data_nas DATETIME NOT NULL,
rg CHAR(8) NOT NULL,
cod_cliente INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
telefone CHAR(12) NOT NULL,
nome_cliente VARCHAR(30) NOT NULL,
inscricao NUMERIC(5) NOT NULL
)

CREATE TABLE Contrato+endereco (
certificado VARCHAR(8) NOT NULL,
ano DATETIME NOT NULL,
apolice NUMERIC(5) NOT NULL,
segurado VARCHAR(40) NOT NULL,
seguradora VARCHAR(40) NOT NULL,
placa VARCHAR(7) NOT NULL,
chassi CHAR(17) NOT NULL,
modelo VARCHAR(25) NOT NULL,
marca VARCHAR(25) NOT NULL,
premio_liquido DECIMAL(10) NOT NULL,
iof DECIMAL(10) NOT NULL,
premio_total DECIMAL(10) NOT NULL,
forma_pagamento VARCHAR(15) NOT NULL,
vencimento DATETIME NOT NULL,
cidade VARCHAR(25) NOT NULL,
cobertura_pais VARCHAR(30) NOT NULL,
processo_susep VARCHAR(15) NOT NULL,
data DATETIME NOT NULL,
cod_contrato INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
vigencia DATETIME NOT NULL,
pais VARCHAR(25) NOT NULL,
cod_cliente INTEGER,
cod_funcionario INTEGER,
numero VARCHAR(7) NOT NULL,
rua VARCHAR(25) NOT NULL,
bairro VARCHAR(15) NOT NULL,
cod_endereco NUMERIC(10),
estado CHAR(5) NOT NULL,
FOREIGN KEY(cod_cliente) REFERENCES Cliente (cod_cliente),
FOREIGN KEY(cod_funcionario) REFERENCES Funcionario (cod_funcionario)
)

ALTER TABLE Carro ADD FOREIGN KEY(cod_cliente) REFERENCES Cliente (cod_cliente)
ALTER TABLE Cliente_fisico ADD FOREIGN KEY(cod_cliente) REFERENCES Cliente (cod_cliente)
ALTER TABLE Cliente_juridico ADD FOREIGN KEY(cod_cliente) REFERENCES Cliente (cod_cliente)
ALTER TABLE aci_mo ADD FOREIGN KEY(id_acidente) REFERENCES Acidentes (id_acidente)
ALTER TABLE endereco ADD FOREIGN KEY(cod_cliente_FK) REFERENCES Cliente (cod_cliente)
