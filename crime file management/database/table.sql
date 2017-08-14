create table login(username varchar2(20) primary key ,password varchar2(25),status varchar2(10));

insert into login values('vidya','vidya123','u');
insert into login values('athira','athira123','a');




create table registration(name varchar2(20), username varchar2(20) primary key, secretquestion varchar2(50),answer varchar2(50),address varchar2(100),pincode number(9),phone number(10),email varchar2(30),village varchar2(15),taluk varchar2(15),district varchar2(15),state varchar2(15));

insert into registration values('vidya','paru','Where is your house','aaaaaa','akalkssfopoftrlklhgk','695010','2431735','vidi@gmail.com','village','taluk','tvm','kerala');





create table criminalregister (criminalno varchar2(10) primary key, name varchar2(50), nickname varchar2(50), age number(3), occupation varchar2(30), crimetype varchar2(20), address varchar2(100), mostyesorno varchar2(3));

create table crimereport (userid varchar2(10) primary key, ninformant varchar2(50), addressinf varchar2(100), detailssuspect varchar2(100), description varchar2(100), datec date);

create table chargesheet (chargesheetno varchar2(20) , nameofpolicesta varchar2(20), Datc date, FIRno varchar2(15) primary key, district varchar2(20), infname varchar2(50), infaddress varchar2(100), infoccupation varchar2(30), infparticulars varchar2(20), accname varchar2(50), accaddress varchar2(100), male varchar2(15), female varchar2(15), accage number(3), accoccupation varchar2(30), accstatus varchar2(15), accaction varchar2(10), wtsname varchar2(50), wtsaddress varchar2(100), wtsoccupation varchar2(30));

create table complaintreg (userid varchar2(10), complaintid varchar2(10) primary key, detailssuspect varchar2(100), Description varchar2(100), Datc date, typeofcrime varchar2(10));

create table admincomplaint (userid varchar2(10), complaintid varchar2(10) primary key, detailssuspect varchar2(100), Description varchar2(100), Datc date, typeofcrime varchar2(10));

create table admincrime (criminalno varchar2(10) primary key, name varchar2(50), nickname varchar2(50), age number(3), occupation varchar2(30), crimetype varchar2(20), address varchar2(100), mostyesorno varchar2(3));

create table FIR(district varchar2(10),Datc date,time varchar2(10),typeofinformation varchar2(15),placeofoccurence varchar2(10),foreignlocal varchar2(15),act varchar2(10),firno varchar2(10) primary key,section varchar2(10),diaryrefno varchar2(15),informantadd varchar2(15),passportno varchar2(10),complaintno varchar2(10),police varchar2(10),receivedtime varchar2(10),informationrec varchar2(10),distancefrmpolst varchar2(10));

create table feedback(name varchar2(15),email varchar2(17),message varchar2(45));

create table hotnews(matter varchar2(100),time varchar2(10),place varchar2(15));



insert into complaintreg values ('vidya',0000,'shuchi','murder',Date '2013-04-06','others');


create table history(prisoner varchar2(15) primary key,typecrime varchar2(15),dateofoccu varchar2(10),placeofocc varchar2(15),briefdisofcase varchar2(10));

create table mail(to1 varchar2(30),from1 varchar2(30),cc varchar2(25),bcc varchar2(25),subject varchar2(30),msg varchar2(70));

create table mostwanted(name varchar2(10),age number(3),address varchar2(15),typeofcrime varchar2(10),complexion varchar2(10),hair varchar2(10),built varchar2(10),passportno varchar2(10) primary key,casedescription varchar2(10));


create table missingperson(firno varchar2(10) primary key,district varchar2(10),nameofpol varchar2(10),datem date,dater date,sex varchar2(4), age number(3),complex varchar2(10),height varchar2(5),fat varchar2(10),idmark varchar2(10),apparels varchar2(15),namaddr varchar2(15),bc varchar2(14));


create table prisonerregister(prisonerno varchar2(10) primary key,chargesheetno varchar2(15) foreign key,nickname varchar2(15),typeofcrime varchar2(15),familymembers varchar2(20),identificationmarks varchar2(25),height varchar2(15),weight varchar2(15),colour varchar2(10));

create table takecomplaintaction(user1 varchar2(19),complaintid varchar2(12) primary key,takeaction varchar2(35));

create table takecrimeaction(user1 varchar2(19),crimeid varchar2(12) primary key,takeaction varchar2(35));

create table mostwanted1(user1 varchar2(10),name varchar2(10),age varchar2(10),address varchar2(15),typeofcrime varchar2(10),complexion varchar2(10),hair varchar2(10),built varchar2(10),passportno varchar2(10),casedescription varchar2(10));
