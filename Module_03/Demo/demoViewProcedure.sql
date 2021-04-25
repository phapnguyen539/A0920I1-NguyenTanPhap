Drop procedure getTotalRecord;

DELIMITER //
Create procedure getTotalRecord()
Begin
	declare number_record int;
    
    select count(1) 
    into number_record
    from invoices;
    
    select number_record as 'So luong record trong bang';
End//

call getTotalRecord();

Drop procedure findByVendorId;
DELIMITER //
Create procedure findByVendorId(
	in vendorId int
)
Begin
	declare record int;
    select count(1) 
    into record
    from invoices where vendor_id = vendorId;
    call getTotalRecord();
    IF record > 0 then
		select record as 'So luong';
	else 
		select 'Khong co record phu hop' AS result;
	end if;
End//

call findByVendorId(123);

select count(1) from invoices where vendor_id = 123;
call getTotalRecord();

DELIMITER //
create procedure increase()
begin
	Set @count = @count + 1;
end//

call increase();
set @count = 0;
select @count;

DELIMITER //
create procedure demoOut(
	out count int
)
begin
	Set count = 2;
end//

call demoOut(@cout);
select @cout;
