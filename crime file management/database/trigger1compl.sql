set serveroutput on

create or replace trigger updateAdminComplaint
after insert 
on complaintreg
for each row

declare

begin
insert into admincomplaint values (:new.userid, :new.complaintid, :new.detailssuspect, :new.Description, :new.Datc, :new.typeofcrime);

end;
/
