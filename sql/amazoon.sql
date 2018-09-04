set names utf8;
set foreign_key_checks = 0;
drop database if exists animal_ecsite;

create database if not exists animal_ecsite;
use animal_ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists animal_info_transaction;

create table animal_info_transaction(
id int not null primary key auto_increment,
animal_name varchar(30),
animal_price int,
animal_strong int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_animal_transaction;

create table user_buy_animal_transaction(
id int not null primary key auto_increment,
animal_transaction_id int,
animal_name varchar(16),
animal_price int,
animal_strong int,
insert_date datetime
);

insert into animal_info_transaction(animal_name,animal_price,animal_strong)values
("ライオン",1000000,5),
("ワニ",3000,2),
("ヒクイドリ",7000,3),
("野獣",810,12);



insert into login_user_transaction(login_id,login_pass,user_name)values("internous","internous01","test");