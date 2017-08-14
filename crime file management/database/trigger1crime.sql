set serveroutput on

create or replace trigger updateAdminCrime
after insert 
on criminalregister
for each row

declare

begin
insert into admincrime values (:new.criminalno , :new.name , :new.nickname,:new.age, :new.occupation, :new.crimetype , :new.address ,:new.mostyesorno );


end;
/
