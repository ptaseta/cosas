

CREATE TABLE IF NOT EXISTS voto (
  id int NOT NULL,
  id_votante varchar(30) NOT NULL,
  id_equipo int NOT NULL
);

CREATE TABLE IF NOT EXISTS votante(
	id int NOT NULL,
	nombre varchar(20)
);

CREATE TABLE IF NOT EXISTS equipo (
  id int NOT NULL PRIMARY KEY,
  nombre_equipo varchar(30) NOT NULL,
  voto_equipo int NOT NULL,
  numero_participantes int
);

CREATE TABLE IF NOT EXISTS integrante (
  id int,
  nombre varchar(30) NOT NULL,
  id_equipo int NOT NULL
);
 
MERGE INTO equipo (id, nombre_equipo, voto_equipo) KEY (id) VALUES
(1,'prueba',1);
MERGE INTO equipo (id, nombre_equipo, voto_equipo) KEY (id) VALUES
(2,'prueba2',2);