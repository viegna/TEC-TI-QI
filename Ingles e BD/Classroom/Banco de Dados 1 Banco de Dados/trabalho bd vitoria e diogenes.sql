/* 1- Criar um novo BD */

CREATE DATABASE loja;
USE loja;

	/* 2- Criar as tableas e ralcionamentos  */

CREATE TABLE fabricante(
	codfab int AUTO_INCREMENT PRIMARY KEY,
    fabricante varchar(35) not null
);

CREATE TABLE drones(
	coddrone int AUTO_INCREMENT PRIMARY KEY,
	nome_drone varchar(30) not null,
        preco float not null,
	fkcodfab int not null,
    FOREIGN KEY (fkcodfab) REFERENCES fabricante(codfab)
);

	/* 3- Altere os dados do fabricante, adicione o atributo pais  */

ALTER TABLE fabricante ADD pais varchar(35) not null;

	/* 4- Exclua o atributo pais */

ALTER TABLE fabricante DROP pais;

	/* 5- Cadastre 3 fabricantes de drone */

INSERT INTO fabricante(codfab, fabricante) VALUES(null,"DJI"),(null,"Intel"),(null,"Zero Zero Robotics");

	/* 6- Cadastre 1 Drone para cada fabricante com todos os dados */

INSERT INTO drones(coddrone, nome_drone, preco, fkcodfab) VALUES(null,"Drone Mavic Pro", 4454, 1);

INSERT INTO drones(coddrone, nome_drone, preco, fkcodfab) VALUES(null,"Phalcom 8+", 29999, 2);

INSERT INTO drones(coddrone, nome_drone, preco, fkcodfab) VALUES(null,"Hoover Camera Passport", 1576, 3);

	/* 7- Edite o preço de 1 drone para 2999 */

UPDATE drones SET preco = 2.999 WHERE fkcodfab=2;

	/* 8- Cadastre mais de um drone sem usar cabeçalho */

INSERT INTO drones VALUES (NULL, "Spark", 2200, 3); 

	/* 9- Exclua o ultimo drone cadastrado */


DELETE from drones WHERE coddrone=4;

	/* 10- Mostrar drones e fabricantes cadastrados */

SELECT *FROM drones;
SELECT *FROM fabricante;
SHOW TABLES;