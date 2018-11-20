INSERT INTO LOCATION(CITY) VALUES
('Lome'),
('Lyon'),
('Toulouse'),
('Belfort'),
('Cotonou'),
('Accra'),
('Nice');


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



INSERT INTO COURSE_SESSION (START_DATE,END_DATE,MAX_CLIENTS,COURSE_CODE,LOCATION_ID)VALUES 
('2018-10-01','2019-02-05',30,'MI41',12),
('2018-10-02','2018-12-28',40,'BD50',13 ),
('2018-06-10','2019-05-05',35,'MI41',14 ),
('2018-05-03','2019-01-15',30,'MI41',14),
('2018-02-05','2019-01-28',30,'MI41',14),
('2018-10-01','2019-01-05',30,'BD50',12),
('2018-01-09','2019-01-04',30,'PH04',13),
('2018-08-02','2018-12-28',30,'GL52',14),
('2018-10-03','2019-02-28',30,'LO54',15),
('2018-10-01','2019-01-28',30,'LO54',15),
('2018-08-03','2019-01-28',30,'TO52',15),
('2018-09-05','2018-12-12',30,'SO07',17),
('2018-10-06','2019-01-28',30,'SO09',17),
('2018-04-03','2019-05-28',30,'MI44',14),
('2018-10-05','2018-12-05',30,'LS00',14),
('2018-10-04','2018-12-05',30,'BD40',13);





INSERT INTO CLIENT(LASTNAME,FIRSTNAME,ADRESSE,PHONE,MAIL,COURSE_SESSION_ID) VALUES
('Krifa','khaled','6a fake adresse 90000','0614458964','kaled@mail.fr',4),
('Pit','Brad','45c fake adresse 81000','0756486523','brad@mail.com',6), 
('Rifflart','Florian','90 fake adresse 90000','0544668899','florian@mail.fr',9),
('Rifflart','Florian','90 fake adresse 90000','0544668899','florian@mail.fr',10),
('Krifa','khaled','6a fake adresse 90000','0614458964','kaled@mail.fr',11);



INSERT INTO USER_AUTH (USERNAME,PASSWORD,ADMIN) VALUES
('khaled','0000',0),
('florian','0000',0),
('brad','0000',0),
('john','0000',0),
('antoine','0000',1),
('giovani','0000',0),
('martin','0000',1);

