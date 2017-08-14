
/*create database crimefile;*/
drop table  login;
drop table  registration;
drop table  complaintreg;
drop table  crimereport;
drop table  complaintstatus;
drop table  adminregistration;
drop table  prisonerregister;
drop table  takecrimeaction;
drop table  takecomplaintaction;
drop table  postmortem;
drop table   hotnews;
drop table  feedback;
drop table  contactus;
drop table  mostwanted1;
drop table  mostwanted;
drop table  mail;
drop table  missingperson;
drop table  chargesheet;
drop table  premortem;
drop table  history;
drop table  FIR;
drop table  deleteuser;
drop table  addelete;
drop table  criminalregister;


create table login(username varchar2(20) primary key ,password varchar2(25),status varchar2(10));

insert into login values('vidya','vidya123','u');
insert into login values('athira','athira123','a');

insert into login values('nikita','xxxxxx','u');
insert into login values('sssss','vvvvvvvv','a');



create table registration(name varchar2(20),username varchar2(20) primary key,secretquestion varchar2(50),answer varchar2(50),address varchar2(50),pincode int(9),phone int(9),email varchar2(30),village varchar2(15),taluk varchar2(15),district varchar2(15),state varchar2(15));

insert into registration values('vidya','paru','Where is your house','aaaaaa','akalkssfopoftrlklhgk','695010','2431735','vidi@gmail.com','village','taluk','tvm','kerala');





create table complaintreg(userid varchar2(15) primary key,detailssuspect varchar2(20),Description varchar2(25),Datc date,typeofcrime varchar2(10));


insert into complaintreg values('u321','aaaaaaaaaaa','ccccc','1992-02-10','murder');




create table crimereport(userid varchar2(15) primary key,ninformant varchar2(15),addressinf varchar2(30),detailssuspect varchar2(15),description varchar2(15),datec date);

insert into crimereport values('u321','gowri','aaaaaaaaaa','jajdggffsgdh','eeeeeeeeeeee','1987-11-10');



create table complaintstatus(complaintno varchar2(10),viewstatus varchar2(20));
insert into complaintstatus values('e122','cust');



create table admnregistration(username varchar2(20) ,question varchar2(20),answer varchar2(20),name varchar2(15),designation varchar2(20),officialaddress varchar2(25),phonen int(11),residentialaddress varchar2(25),pincode int(9),phone int(11),email varchar2(30));

insert into admnregistration values('paru','dwwrttyuy','asff','vidya','IG','akalkssfopoftrlklhgk',2462248,'retryuuyiioopplkj','695010','2431735','vidi@gmail.com');


create table prisonerregister(prisonerno varchar2(10),chargesheetno varchar2(15) primary key,nickname varchar2(15),typeofcrime varchar2(15),familymembers varchar2(20),identificationmarks varchar2(25),height varchar2(15),weight varchar2(15),colour varchar2(10));

insert into prisonerregister values('p10','c1','paru','murder','asdfdghjkll','qwertyuiop','169','55','white');


create table criminalregister(criminalno varchar2(10) primary key,name varchar2(15),nickname varchar2(15),age varchar2(10),occupation varchar2(15),crimetype varchar2(15),address varchar2(15),mostyesorno varchar2(12));

insert into criminalregister values('c10','vasu','gundukadu','35','gunda','murder','aaaaaaa');


create table addelete(adminname varchar2(20),securityanswer varchar2(20));
insert into addelete values('john','cat'); 



create table deleteuser(username varchar2(15) primary key,password varchar2(10),securityanswer varchar2(15));
insert into deleteuser values('sabu','123456','car');


create table FIR(district varchar2(10),Datc date,time varchar2(10),typeofinformation varchar2(15),placeofoccurence varchar2(10),foreignlocal varchar2(15),act varchar2(10),firno varchar2(10),section varchar2(10),diaryrefno varchar2(15),informantadd varchar2(15),passportno varchar2(10),complaintno varchar2(10),police varchar2(10),receivedtime varchar2(10),informationrec varchar2(10),distancefrmpolst varchar2(10));
insert into FIR values('TVM','1987-12-12','9.30am','mail','asddft','local','niuih','f90','ipc12','d123','hgxsgxkhs','p56','c234','asdfg','3.25pm','hfhf','56');



create table history(prisoner varchar2(15) primary key,typecrime varchar2(15),dateofoccu varchar2(10),placeofocc varchar2(15),briefdisofcase varchar2(10));

insert into history values('p12','c123','murder','1990-10-25','gfhg');

create table premortem(premortemno varchar2(10),postmortemno varchar2(10),Doctorsname varchar2(10),policestation varchar2(10),pdatec date);
insert into premortem values('p145','po2435','smith','safsd','1977-09-04');

create table chargesheet(chargesheetno varchar2(10), nameofpolicesta varchar2(10), Datc date, FIRno varchar2(10), district varchar2(10),infname varchar2(15),infaddress varchar2(20),infoccupation varchar2(12),infparticulars varchar2(12),accname varchar2(10),accaddress varchar2(20),male varchar2(15),female varchar2(15),accage int(5),accoccupation varchar2(13),accstatus varchar2(15),accaction varchar2(10),wtsname varchar2(12),wtsaddress varchar2(20),wtsoccupation varchar2(20));

insert into chargesheet values('c234','fzsgf','1987-11-10','f10','TVM','vidhya','aaaaa','occupation','dsagf','atsk','gfdcxgdg','55','gxshgx',55 ,'babu','gsfxx','hjsdh','ssddefffe','dfffefe','dfee');


create table missingperson(firno varchar2(10),district varchar2(10),nameofpol varchar2(10),datem date,dater date,sex varchar2(4), age varchar2(6),complex varchar2(10),height varchar2(5),fat varchar2(10),idmark varchar2(10),apparels varchar2(15),namaddr varchar2(15),bc varchar2(14));

insert into missingperson values('f123','tvm','vanchiyoor','1985-06-22','1985-06-30','M','20','fair','169','fat','blackscar','stud and chain','asggfdffghggggg','ffg');

create table mostwanted(name varchar2(10),age varchar2(10),address varchar2(15),typeofcrime varchar2(10),complexion varchar2(10),hair varchar2(10),built varchar2(10),passportno varchar2(10),casedescription varchar2(10));
insert into mostwanted values('aaaa','12','aaaaaaa','ssss','fair','sssshj','ffff','pppp','hhhhh');

create table mostwanted1(user varchar2(10),name varchar2(10),age varchar2(10),address varchar2(15),typeofcrime varchar2(10),complexion varchar2(10),hair varchar2(10),built varchar2(10),passportno varchar2(10),casedescription varchar2(10));
insert into mostwanted values('aaaa','12','aaaaaaa','ssss','fair','sssshj','ffff','pppp','hhhhh');


create table contactus(name varchar2(15),email varchar2(17),fax varchar2(13),address varchar2(14),message varchar2(16));
insert into contactus values('sds','vvasb@gmail.com','45667','ddds','gghjjj');

create table feedback(name varchar2(15),email varchar2(17),message varchar2(45));
insert into feedback values('sds','vvasb@gmail.com','gghjjj');


create table hotnews(matter varchar2(40),time varchar2(10),place varchar2(15));
insert into hotnews values('aasasasasasasasasasasasa','12:10','hjsh');

create table mail(to1 varchar2(30),from1 varchar2(30),cc varchar2(25),bcc varchar2(25),subject varchar2(30),msg varchar2(70));
insert into mail values('cfms@.com','user@.com','ccc','bccc','sub','mess');

create table postmortem(postno varchar2(12),dname varchar2(12),postno2 varchar2(12),post1 varchar2(13));

create table takecomplaintaction(user varchar2(19),complaintid varchar2(12) primary key,takeaction varchar2(35));


create table takecrimeaction(user varchar2(19),crimeid varchar2(12) primary key,takeaction varchar2(35));















