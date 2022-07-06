CREATE DATABASE Db_Personne;
USE Db_Personne;


CREATE TABLE Personne(
       id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
       cin  Varchar(25),
       nom varchar(25),
       prenom varchar(25)
)
