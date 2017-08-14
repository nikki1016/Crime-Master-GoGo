set serveroutput on

create or replace trigger deleteAdminCrime
after insert 
on takecrimeaction
for each row

declare

begin
delete from admincrime where :new.crimeid = admincrime.criminalno;

end;
/
