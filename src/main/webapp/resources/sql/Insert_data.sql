DELETE FROM CLIENT;
DELETE FROM COURSE_SESSION;
DELETE FROM COURSE;
DELETE FROM LOCATION;

INSERT INTO LOCATION(ID, CITY) VALUES
(1,'Lome'),
(2,'Lyon'),
(3,'Toulouse'),
(4,'Belfort'),
(5,'Cotonou'),
(6,'Accra'),
(7,'Nice');

INSERT INTO COURSE(CODE, TITLE) VALUES
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

INSERT INTO COURSE_SESSION (ID,START_DATE,END_DATE,MAX_CLIENTS,COURSE_CODE,LOCATION_ID) VALUES
(1,'2019-10-01','2020-02-05',30,'MI41',1),
(2,'2019-10-02','2019-12-28',40,'BD50',3),
(3,'2019-06-10','2020-05-05',35,'MI41',5),
(4,'2019-05-03','2020-01-15',30,'MI41',2),
(5,'2019-02-05','2020-01-28',30,'MI41',6),
(6,'2019-10-01','2020-01-05',30,'BD50',7),
(7,'2019-01-09','2020-01-04',30,'PH04',4),
(8,'2019-08-02','2019-12-28',30,'GL52',5),
(9,'2019-10-03','2020-02-28',30,'LO54',3),
(10,'2019-10-01','2020-01-28',30,'LO54',2),
(11,'2019-08-03','2020-01-28',30,'TO52',1),
(12,'2019-09-05','2019-12-12',30,'SO07',7),
(13,'2019-10-06','2020-01-28',30,'SO09',5),
(14,'2019-04-03','2020-05-28',30,'MI44',6),
(15,'2019-10-05','2019-12-05',30,'LS00',4),
(16,'2019-10-04','2019-12-05',30,'BD40',2);

INSERT INTO CLIENT(LASTNAME,FIRSTNAME,ADDRESS,PHONE,MAIL,COURSE_SESSION_ID) VALUES
('Krifa','khaled','6a fake adresse 90000','0614458964','kaled@mail.fr',5),
('Pit','Brad','45c fake adresse 81000','0756486523','brad@mail.com',6),
('Rifflart','Florian','90 fake adresse 90000','0544668899','florian@mail.fr',9),
('Rifflart','Florian','90 fake adresse 90000','0544668899','florian@mail.fr',10),
('Krifa','khaled','6a fake adresse 90000','0614458964','kaled@mail.fr',11);

DELETE FROM USER_AUTH;
INSERT INTO USER_AUTH (USERNAME,PASSWORD,ADMIN) VALUES
('khaled','0000',true),
('florian','test',true),
('brad','0000',false),
('john','0000',false),
('antoine','0000',false),
('giovani','0000',true),
('martin','0000',true);