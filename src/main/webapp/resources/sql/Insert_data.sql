INSERT INTO COURSE VALUES
('MI41','Architecture & Maintenance'),
('LO54','Programmation JEE'),
('BD50','Conception de Bases de donnees'),
('GL52','Genie Logiciel'),
('TO52','Projet de developpement'),
('BD40','Analyse base de donnees'),
('MI44','Cryptographie'),
('SQ40','Statistique & probabilite'),
('GL40','Interface Homme Machine'),
('GL41','Gestion de projet'),
('MT45','Analyse numerique'),
('SO09','Sante & Securite au travail'),
('SO07','Sociologie du Travail'),
('PH04','Philosophie & Informatique'),
('LE03','Anglais niveau 3'),
('LS00','Espagnol');

INSERT INTO LOCATION VALUES
(1,'Lome'),
(2,'Lyon'),
(3,'Toulouse'),
(4,'Belfort'),
(5,'Cotonou'),
(6,'Accra'),
(7,'Nice');

INSERT INTO CLIENT VALUES
(1,'Krifa','khaled','6a fake adresse 90000','0614458964','kaled@mail.fr',1),
(2,'Pit','Brad','45c fake adresse 81000','0756486523','brad@mail.com',10), 
(3,'Rifflart','Florian','90 fake adresse 90000','0544668899','florian@mail.fr',13),
(4,'Rifflart','Florian','90 fake adresse 90000','0544668899','florian@mail.fr',9),
(5,'Krifa','khaled','6a fake adresse 90000','0614458964','kaled@mail.fr',20);

INSERT INTO COURSE_SESSION VALUES 
(1,2018-10-01,2019-02-05,30,'MI41',1),
(8,2018-10-02,2018-12-28,40,'BD50',7 ),
(9,2018-06-10,2019-05-05,35,'MI41', 2),
(10,2018-05-03,2019-01-15,30,'MI41',2),
(11,2018-02-05,2019-01-28,30,'MI41',2),
(12,2018-10-01,2019-01-05,30,'BD50',5),
(13,2018-01-09,2019-01-04,30,'PH04',4),
(14,2018-08-02,2018-12-28,30,'GL52',3),
(15,2018-10-03,2019-02-28,30,'LO54',6),
(16,2018-10-01,2019-01-28,30,'LO54',6),
(17,2018-08-03,2019-01-28,30,'TO52',6),
(18,2018-09-05,2018-12-12,30,'SO07',2),
(19,2018-10-06,2019-01-28,30,'SO09',2),
(20,2018-04-03,2019-05-28,30,'MI44',1),
(21,2018-10-05,2018-12-05,30,'LS00',1),
(22,2018-10-04,2018-12-05,30,'BD40',1);



INSERT INTO USER_AUTH VALUES
('khaled','Lome',0),
('florian','Lyon',0),
('brad','Toulouse',0),
('john','Belfort',0),
('antoine','Cotonou',1),
('giovani','Accra',0),
('martin','Nice',1);

