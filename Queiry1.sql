CREATE DATABASE eveningbatch;
CREATE DATABASE jan7th;
CREATE DATABASE olympic;

show databases;

use eveningbatch;

CREATE TABLE river(id int, name varchar(30),location varchar(20),size bigint);
 SELECT * FROM  river;
 
 INSERT INTO river VALUES(1,'kaveri','manda',400);
 INSERT INTO river VALUES(2,'hemavathi' , 'hassan' , 7990);
 show databases;
 use olympic;
CREATE TABLE olymic_games(id int , game_type  varchar(20), player_name varchar(23) , country varchar(20), no_of_players int , no_of_teams int ,  no_of_medals bigint , medal_type varchar(30) , wining_price_amount bigint );
 
 SELECT * FROM olymic_games;
 INSERT INTO olymic_games VALUES(1 , 'cycling' , 'Richard Carapaz Ecuador' , 'UCI' , 5 , 1 , 1 , 'gold' , 673527  );
 INSERT INTO olymic_games VALUES(2 , 'swimming' , 'antony' , 'Uk' , 7 , 2, 3 , 'bronze' , 763883);
 INSERT INTO olymic_games VALUES(3 , 'RUNNING', 'JAMES' , 'PARIS' , 10 , 7 , 8 , 'GOLD' , 83938);
 INSERT INTO olymic_games VALUES(4 , 'GYMNASTIC' , 'GANGRON' , 'CHINA' , 7 , 9 , 7 , 'SILVER',73883);
 INSERT INTO olymic_games VALUES(5 , 'MARATHON SWMMING ' , 'CRONENE' , 'BANGLADESH' ,6 , 7 , 8 , 'GOLD' , 899888);
 INSERT INTO olymic_games VALUES(6 , 'DIVING ' , 'CARANON' , 'AUSTRALIA' , 8 , 0 , 6 , 'SILVER' , 899393); 
 INSERT INTO olymic_games VALUES(7 , 'WATER POLO' , 'DANZPO' , 'CARGO' , 68 , 7 , 556 , 'GOLD' , 678933);
 INSERT INTO olymic_games VALUES(8 , 'ARTISTIC' , 'TUKO' , 'NEWZELAND' , 78 , 6 , 636 , 'BRONZE' , 78833);
 INSERT INTO olymic_games VALUES(9 , 'ARCHERY' , 'NETYRI' , 'SCOTLAND' , 56 , 9 , 637 , 'GOLD' , 78393);
 INSERT INTO olymic_games VALUES(10 , 'ATHLETICS' , 'NAYANTRKZA' , 'HZWAI' , 89 , 10 , 77 , 'GOLD' , 83939);
 INSERT INTO olymic_games VALUES(11 , 'BADMITON' , 'SAYNA NEHAWAL' , 'INDIA' , 67 , 5 , 88 , 'GOLD' , 67373);
 INSERT INTO olymic_games VALUES(12 , 'TABEL TENNIS' , 'ABDUL' , 'PAKISTAN' , 8 , 9 , 6 , 'BRONZE' , 2);
 INSERT INTO olymic_games VALUES(13 , 'BASKET BALL' , 'HOODA' , 'BANKOK' , 78 , 8, 53 , 'GOLD' , 88838);
 INSERT INTO olymic_games VALUES(14 , 'HAND BALL' , 'HUMPA' , 'THAILAND' , 77 , 93 ,9 , 'SILVER' , 63728);
INSERT INTO olymic_games VALUES(15 ,'TENNIS' , 'KRISHNA' , 'INDIA' , 89 , 738 , 88 , 'GOLD' , 73883);
INSERT INTO olymic_games VALUES(16 , 'BASE BALL' , 'SAMANAS' , 'WEST INDIA' , 784 , 89 , 89 , 'GOLD', 89967);
INSERT INTO olymic_games VALUES(17 , 'BOXING' , 'KANNADIGA' , 'INDIA' , 728 , 89 , 7 , 'GOLD' , 567282);
INSERT INTO olymic_games VALUES(18 , 'BREAKING' , 'CHANGSUNG' , 'CHINA' , 63 , 7 , 8 , 'BRONZE' , 78383);
INSERT INTO olymic_games VALUES(19 , 'CANOE' , 'BARK' , 'UAE' , 7 , 8 , 9 , 'GOLD' , 7899);
INSERT INTO olymic_games VALUES(20 , 'CROSPER' , 'CHRISTOPHER' , 'ENGLAND' , 7 , 8 , 9 , 'SILVER' , 878833);
INSERT INTO olymic_games VALUES(21 , 'BMX FRESHLIGHT' , 'CHARNG' , 'SCOTLAND' , 6, 8 , 4556 , 'GOLD' , 78383);
INSERT INTO olymic_games VALUES(22 , 'BMX FRESHLIGHT' , 'ZOOFA' , 'COTLAND' , 6, 8 , 4556 , 'SILVER' , 68383);
INSERT INTO olymic_games VALUES(23 , 'BMX FRESHLIGHT' , 'CHANG' , 'CHINA' , 6, 8 , 4556 , 'BRONZE' , 58383);
INSERT INTO olymic_games VALUES(24 , 'BMX RACING' , 'CHILSS' , 'TOKYO' , 7 , 9 , 7 , 'GOLD' , 457783);
INSERT INTO olymic_games VALUES(25 , 'BMX RACING' , 'CHALS' , 'USA' , 7 , 9 , 7 , 'SILVER' , 357783);
INSERT INTO olymic_games VALUES(26 , 'BMX RACING' , 'BOKAKO' , 'THANZANIA' , 7 , 9 , 7 , 'BRONZE' , 257783);
INSERT INTO olymic_games VALUES(27 , 'ROAD RACING' , 'BUKAKOA' , 'THANZANIA' , 8 , 9 , 7 , 'GOLD' , 637833);
INSERT INTO olymic_games VALUES(29 , 'ROAD RACING' , 'FANIA' , 'COSOZANIA' , 8 , 9 , 7 , 'SILVER' , 537833);
INSERT INTO olymic_games VALUES(30 , 'ROAD RACING' , 'BHAKW' , 'PAKISTAN' , 8 , 9 , 7 , 'BRONZE' , 437833);
 INSERT INTO olymic_games VALUES(31 , 'cycling' , 'Ecuador' , 'UCA' , 5 , 1 , 1 , 'SILVER' , 673527  );
 INSERT INTO olymic_games VALUES(32 , 'swimming' ,'RICHARD' , 'Uk' , 7 , 2, 3 , 'bronze' , 63883);
 INSERT INTO olymic_games VALUES(33 , 'RUNNING', 'JAMES GOSLING' , 'PARIS' , 10 , 7 , 8 , 'SILVER' , 83938);
 INSERT INTO olymic_games VALUES(34 , 'GYMNASTIC' , 'GANGRON HOOD' , 'CHINA' , 7 , 9 , 7 , 'BRONZE',73883);
 INSERT INTO olymic_games VALUES(35 , 'MARATHON SWMMING ' , 'CRONENE' , 'BANGLADESH' ,6 , 7 , 8 , 'GOLD' , 899888);
 INSERT INTO olymic_games VALUES(38 , 'DIVING ' , 'CARANON' , 'AUSTRALIA' , 8 , 0 , 6 , 'GOLD' , 899393); 
 INSERT INTO olymic_games VALUES(39 , 'WATER POLO' , 'DANZPO' , 'CARGO' , 68 , 7 , 556 , 'BRONZE' , 678933);
  INSERT INTO olymic_games VALUES(40 , 'DIVING ' , 'CARANON' , 'AUSTRALIA' , 8 , 0 , 6 , 'SILVER' , 899393); 

SELECT * from olymic_games;

CREATE TABLE festival(id int , fest_name varchar(10) , fest_date varchar(20) , fest_region varchar(20));
SELECT * FROM festival;

INSERT INTO festival VALUES(1 , 'AYUDHA POOJA' , '2022-10-20' , 'SOUTH');
INSERT INTO festival VALUES(2 , 'DEEPAVALI' , '2022 - 11-2' , 'ALL INDIA');
INSERT INTO festival(id , fest_date ) VALUES (3 , '2022-9-4');

commit;
ALTER:
1) ADD COLUMN TO Exsisting table.
2) DROP the column from existing table.
3) Rename the column name
4) Change the datatype.


1)ADD new column to the existing Table
syntax - ALTER TABLE table_name ADD COLUMN column_name datatypes; -- to add column 
ALTER TABLE festival ADD COLUMN fest_religion varchar(30) ;
ALTER TABLE festival ADD COLUMN fest_country varchar(20) default 'india';
2 )syntax - ALTER TABEL Tabel name Drop column coumn name -- to drop the column
ALTER TABLE festival DROP COLUMN fest_region;
3) to rename the column name 

syntaax -- ALTER TABEL table_name RENAME COLUMN existing_name TO new_column_name;
RENAME TABLE COL_NAME TO COL_NAME;
4) to re size the datatype 
ALTER TABLE tble_nam MODIFY colu_name varchar(size); 

CREATE TABLE festival(id int , fest_name varchar(20) , fest_religion varchar(30) , fest_country varchar(30) , fest_village varchar(20) , relatives_no int , fest_food varchar(20) , fest_sweet varchar(20) 
  , fest_flower varchar(20) , fest_houseName varchar(30) , fest_time bigint , fest_date varchar(40) , fest_satate varchar(20) , fest_foodName varchar(20) , fest_god varchar(30) , fest_temple varchar(20) , fest_godName varchar(20) 
   , fest_colthes varchar(20));

SELECT*FROM festival;
ALTER TABLE festival RENAME COLUMN  fest_village TO fest_villlaage;
ALTER TABLE festival ADD column fest_region varchar(20) default 'SOUTH';
ALTER TABLE festival ADD column fest_xyz varchar(19) default 'hhh';
ALTER TABLE festival DROP column fest_xyz;
ALTER TABLE festival RENAME COLUMN fest_religion TO fest_reli;
ALTER TABLE festival MODIFY COLUMN id varchar(10);
ALTER TABLE festival MODIFY COLUMN fest_villlaage varchar(10);
DROP TABLE festival;
DESC festival;
INSERT INTO festival VALUES(1 , 'SANKRANTHI' , 'HINDU' , 'INDIA' , 'NAGASANDRA' , 5 , 'VEG' , 'HOLIGE' , 'MALLIGE' , 
'KALPARUKSHA' , 12 , '2023-14-01' , 'KARNATAKA' , 'HOLIGE OOTA' , 'djbd' , 'dshds' , 'aad' ,'PANCHE SHIRT');
commit;















CREATE TABLE highway( id int , h_name varchar(20) , length varchar(20) , tea_shop int , garage int , bikesonhighway bigint , cars int , trucks int , lori bigint , veghotels int , 
non_veg_hotels int , bars int  ,busin_highway int , bikesentry_on_highway bigint , bike_living int , carsentry int , carliving int , busentry int , jaguars int  , benz int ,
advertives_boards int , caution_boards int , no_villages_passing int , no_stops int , no_temples int , no_petrolbunks bigint , no_signals int , high_type  varchar(20) , dairy int , banks int , railways int   );

SELECT * FROM highway;

ALTER TABLE highway ADD COLUMN road_type varchar(20) default 'damber';
ALTER TABLE highway ADD COLUMN speed_brakers int default 70;
ALTER TABLE highway rename column h_name TO high_name;
ALTER table highway modify column length varchar(50);

desc highway;

INSERT INTO highway values(1 , 'NH-1' , '1000KM' , 50 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
INSERT INTO highway values(2 , 'SH-1' , '100KM' , 50 , 40 , 200 , 300 , 400 , 200 , 10 , 10 , 90 , 30 , 200 , 500 , 200 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'STATE' ,  10 , 20 ,30);
INSERT INTO highway values(3 , 'NH-2' , '10000KM' , 500 , 40 , 200 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 3 , 100 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
INSERT INTO highway values(4 , 'SH-2' , '2000KM' , 500 , 40 , 200 , 300 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'STATE' ,  10 , 20 ,30);
  INSERT INTO highway values(5 , 'NH-3' , '1098E0KM' , 50 , 450 , 26000 , 30300 , 4000 , 20000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(6 , 'SH-1' , '4700KM' , 330 , 40 , 2000 , 3000 , 40500 , 20060 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'SATATE' ,  10 , 20 ,30);
  INSERT INTO highway values(7 , 'NH-5' , '4573KM' , 60 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  140 , 20 ,30);
  INSERT INTO highway values(8 , 'NH-7' , '3849KM' , 50 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,304);
  INSERT INTO highway values(9 , 'SH-3' , '1538KM' , 50 , 40 , 2733 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'STATE' ,  10 , 20 ,30);
  INSERT INTO highway values(10 , 'NH-7' , '105874KM' , 50 , 40 , 29000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(11 , 'SH-3' , '1000KM' , 50 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(12 , 'NH-10' , '10473KM' , 50 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(13 , 'SH-11' , '1267KM' , 50 , 40 , 20030 , 30300 , 4020 , 2000 , 1200 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'SATAE' ,  10 , 20 ,30);
  INSERT INTO highway values(14 , 'NH-16' , '12526KM' , 509 , 40 , 20030 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(15 , 'NH-18' , '1000KM' , 58 , 40 , 2000 , 30080 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(16 , 'SH-20' , '1788KM' , 650 , 340 , 200 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'SATTAE' ,  10 , 204 ,30);
  INSERT INTO highway values(17 , 'NH-50' , '3536KM' , 80 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(18 , 'SH-34' , '15600KM' , 550 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'SATATE' ,  10 , 20 ,30);
  INSERT INTO highway values(19 , 'NH-15' , '1000KM' , 50 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 5567, 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'NATIONAL' ,  10 , 20 ,30);
  INSERT INTO highway values(20 , 'SH-1' , '2847KM' , 50 , 40 , 2000 , 3000 , 4000 , 2000 , 100 , 100 , 90 , 300 , 2000 , 500 , 2000 , 300 , 100 , 10 , 5 , 
  10 , 30 , 1000 , 700 , 500 , 400 , 0 , 'STATE' ,  10 , 20 ,30);
  
  CREATE TABLE movies(id int , movie_name varchar(20) , movie_relese_date varchar(30) , total_no_screens bigint , pvr int , normal int , mall int , 
       type varchar(50) , no_languages int , hero_name varchar(30) , heroien_name varchar(50));
  
  SELECT*FROM movies;
  
  
  ALTER TABLE movies rename column movie_relese_date to releasedate;
  ALTER TABLE movies ADD COLUMN language varchar(40) default 'kannada';
  ALTER TABLE movies modify column releasedate varchar(70);
  
  DESC movies;
  
  
  
  INSERT INTO movies values(1 , 'KRANTHI' , '2023-01-26' , 1000 , 400 , 500 , 100 , 
     'MASS' , 5 , 'D BOSS' , 'RACHITHA');
     INSERT INTO movies values(2 , 'KD' , '2023-09-21' , 800 , 400 , 100 , 300 , 
     'MASS' , 5 , 'DRUVA SARJA' , 'GOTHILA');
     INSERT INTO movies values(3 , 'KHABZA' , '2023-10-13' , 1500 , 400 , 700 , 400 , 
     'MASS' , 5 , 'UPPI' , 'LEELA');
     INSERT INTO movies values(4 , 'PHATAN' , '2023-02-15' , 1000 , 400 , 500 , 100 , 
     'MASS' , 5 , 'SHARUK' , 'PADUKONE');
     INSERT INTO movies values(5 , 'THANIVU' , '2023-01-11' , 100 , 10 , 50 , 40 , 
     'MASS' , 1 , 'AJITH' , 'GOTHILA');
     INSERT INTO movies values(6 , 'VARISU' , '2023-01-11' , 1000 , 400 , 500 , 100 , 
     'MASS' , 1 , 'THALAPATHY' , 'RASHMIKA');
     INSERT INTO movies values(7 , 'THIRUCHITHAMBALAM' , '2022-11-26' , 100 , 30 , 50 , 30 , 
     'MASS' , 5 , 'D BOSS' , 'RACHITHA');
     INSERT INTO movies values(8 , 'KANTARA' , '2022-10-02' , 700 , 400 , 200 , 100 , 
     'A DIVINE' , 5 , 'RISHAB' , 'SAPTHAMI GOWDA');
     INSERT INTO movies values(9 , '777CHARLIE' , '2022-08-26' , 1000 , 400 , 500 , 100 , 
     'EMOTIONAL' , 5 , 'RAKSHITH' , 'SANGEETHA');
     INSERT INTO movies values(10 , 'DAYAVITTU GAMANISI' , '2022-03-26' , 1000 , 400 , 500 , 100 , 
     'COMMERCIAL' , 2 , 'VASISTA' , 'GOTHILA');
     INSERT INTO movies values(11 , 'VEDHA' , '2022-12-26' , 1000 , 400 , 500 , 100 , 
     'MASS' , 1 , 'SHIVANNA' , 'GOTHILS');
     INSERT INTO movies values(12 , 'KGF' , '2018-04-26' , 1000 , 400 , 500 , 100 , 
     'MASS' , 5 , 'YASH' , 'SRINIDHI');
     INSERT INTO movies values(13 , 'KGF' , '2021-06-16' , 1000 , 400 , 500 , 100 , 
     'MASS' , 5 , 'YASH' , 'SRINIDHI');
     INSERT INTO movies values(14 , 'YAJAMANA' , '2020-03-11' , 1000 , 400 , 500 , 100 , 
     'MASS' , 1 , 'D BOSS' , 'RUSHMIKA');
     INSERT INTO movies values(15 , 'ODEYA' , '2019-06-26' , 400 , 400 , 0 , 0 , 
     'MASS' , 1 , 'D BOSS' , 'GOTHILA');
     INSERT INTO movies values(16 , 'BULBUL' , '2017-03-7' , 600 , 400 , 100 , 100 , 
     'MASS' , 1 , 'D BOSS' , 'RACHITHA');
     INSERT INTO movies values(17 , 'AMBARISH' , '2015-04-15' , 800 , 400 , 200 , 200 , 
     'MASS' , 1 , 'D BOSS' , 'RACHITHA');
     INSERT INTO movies values(18 , 'KARIYA' , '2004-09-1' , 100 , 100 , 0 , 0 , 
     'MASS' , 1 , 'D BOSS' , 'GOTHILA');
     INSERT INTO movies values(19 , 'BHARJARI' , '2017-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 1 , 'DRUVA' , 'RADHIKA');
    INSERT INTO movies values(20 , 'ADHURI' , '2015-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 1 , 'DRUVA' , 'RADHIKA');
     INSERT INTO movies values(21 , 'BHADHUR' , '2017-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 1 , 'DRUVA' , 'RADHIKA');
     INSERT INTO movies values(22 , 'VR' , '2022-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'KICHA' , 'NIDHIMA');
    INSERT INTO movies values(23 , 'K-3' , '2020-08-21' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'KICHA' , 'GOTHILA');
     INSERT INTO movies values(24 , 'K-2' , '2017-04-11' , 600 , 400 , 200 , 0 , 
     'MASS' , 2 , 'KICHA' , 'DUMMY');
     INSERT INTO movies values(25 , 'YYD' , '2022-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'KICHA' , 'GOTHILA');
     INSERT INTO movies values(26 , 'BHAJARANGI' , '2022-05-08' , 800 , 400 , 200 , 0 , 
     'MASS' , 5 , 'SHIVANNA' , 'BHAVANA');
    
     INSERT INTO movies values(27 , 'BOSS' , '2021-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 1 , 'DHARSHAN' , 'GOTHILA');
      INSERT INTO movies values(28 , 'BHAJARANGI-2' , '2022-05-08' , 800 , 400 , 200 , 0 , 
     'MASS' , 5 , 'SHIVANNA' , 'GOTHILA');
      INSERT INTO movies values(29 , 'GARUDA GAMANA' , '2021-05-08' , 800 , 400 , 200 , 0 , 
     'MASS' , 1 , 'RISHAB' , 'NILL');
      INSERT INTO movies values(30 , 'YYY' , '2022-05-08' , 800 , 400 , 200 , 0 , 
     'MASS' , 5 , 'SHIVANNA' , 'BHAVANA');
     INSERT INTO movies values(31 , 'K-3' , '2020-08-21' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'KICHA' , 'GOTHILA');
     INSERT INTO movies values(32 , 'K-2' , '2017-04-11' , 600 , 400 , 200 , 0 , 
     'MASS' , 2 , 'KICHA' , 'DUMMY');
     INSERT INTO movies values(33 , 'CHAMAK' , '2020-08-21' , 600 , 400 , 200 , 0 , 
     'COMMERCIAL' , 5 , 'GANESH' , 'RASHMIKA');
     INSERT INTO movies values(34 , 'RRR' , '2022-04-11' , 600 , 400 , 200 , 0 , 
     'MASS' , 2 , 'RAMCHARAN' , 'ALIA');  
     INSERT INTO movies values(35 , 'K-3' , '2020-08-21' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'KICHA' , 'GOTHILA');
     INSERT INTO movies values(36 , 'K-2' , '2017-04-11' , 600 , 400 , 200 , 0 , 
     'MASS' , 2 , 'KICHA' , 'DUMMY');
     INSERT INTO movies values(37 , 'VR' , '2022-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'KICHA' , 'NIDHIMA');
    INSERT INTO movies values(38 , 'KOKO' , '2014-08-21' , 600 , 400 , 200 , 0 , 
     'MASS' , 1 , 'KITTY' , 'PRIYAMANI');
     INSERT INTO movies values(39 , 'KALPANA' , '2015-05-31' , 600 , 400 , 200 , 0 , 
     'MASS' , 1 , 'UPPI' , 'GOTHILA');
    INSERT INTO movies values(40 , 'UI' , 'GOTHILA' , 600 , 400 , 200 , 0 , 
     'MASS' , 5 , 'UPPI' , 'GOTHILA');
  
  commit

