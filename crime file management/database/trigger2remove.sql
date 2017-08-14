set serveroutput on

create or replace trigger deleteAdminComplaint
after insert 
on takecomplaintaction
for each row

declare

begin
delete from admincomplaint where :new.complaintid = admincomplaint.complaintid;

end;
/
