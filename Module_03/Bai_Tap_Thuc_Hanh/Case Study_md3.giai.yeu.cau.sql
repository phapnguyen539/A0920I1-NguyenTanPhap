
-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
-- một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select IDNhanVien,HoTen from nhanvien where 
   (HoTen like 'H%' or 'T%' or 'K%') and length(hoten)<15;
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
	select IDKhachHang,HoTen,(Year(now())-Year(NgaySinh)) as 'Tuoi' from Khachhang 
    where Tuoi>18 and Tuoi<50;  
    
	select IDKhachHang,HoTen,(Year(now())-Year(NgaySinh)),diachi  from Khachhang 
    where ((Year(now())-Year(NgaySinh))>18 and (Year(now())-Year(NgaySinh))<50)and diachi = 'DaNang' or 'QuangTri' ;
    
    select IDKhachhang,Hoten as ht from khachhang;  
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu
-- lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là
-- “Diamond”.
	select hd.IDKhachHang,HoTen,IDLoaiKhach, count(hd.IDKhachHang) as solan from hopdong as hd
    join khachhang as kh on kh.IdKhachhang =hd.IDKhachHang
    where idLoaikhach = 1
    group by IDKhachhang;
-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong,
-- TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với
-- TongTien được tính theo công thức như sau: ChiPhiThue +
-- SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả
-- các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng
-- đặt phòng cũng phải hiển thị ra).
	select kh.idkhachhang,hoten,tenloaikhach,hd.idhopdong,tendichvu,ngaylamhopdong,ngayketthuc,(chiphithue+soluong*gia) as tongtien from khachhang as kh
    left join Hopdong as hd on kh.idkhachhang = hd.idkhachhang 
    left join loaikhach as lk on lk.IDLoaiKhach = kh.IDLoaiKhach
    left join dichvu    as dv on dv.IDDichVu = hd.IDDichVu
    left join hopdongchitiet as hdct on hdct.IDHopDong = hd.IDHopDong
    left join dichvudikem as dvdk on dvdk.IDDichVuDiKem = hdct.IDDichVuDiKem;
    
    
   
   
   
    select kh.idKhachhang,hoten,idhopdong from hopdong as hd
    right join khachhang as kh on hd.idkhachhang = kh.idkhachhang;
    
-- 6.Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ 
-- chưa từng được Khách hàng thực hiện đặt 
-- từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

	select dv.IDDichvu,TenDichVu,DienTich,ChiPhiThue,TenLoaidichvu
    from DichVu as dv join HopDong as hd
    on dv.Iddichvu = hd.idhopdong
    join LoaiDichvu as ldv on ldv.Idloaidichvu = dv.idloaidichvu
    where ldv.IDLoaidichvu not in
    (select IdLoaidichvu from Hopdong as hd1 
    join Dichvu as dv1 on dv1.IDDichvu = hd1.IDDichvu
	where month(ngaylamhopdong) in (1,2,3));
-- 7.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
-- C1:
	select distinct hoten from Khachhang ;
-- C2:
	select hoten from khachhang
    group by hoten;
-- C3:
	select hoten from khachhang 
    union
    select hoten from khachhang;


-- 8.	Thực hiện thống kê doanh thu theo tháng,
--   nghĩa là tương ứng với mỗi tháng trong năm 2019 thì
--  có bao nhiêu khách hàng thực hiện đặt phòng.
	 select month(ngaylamhopdong) as thang ,count(month(ngaylamhopdong)) as soKHdat from hopdong
     where year(ngaylamhopdong) = 2021
     group by month(ngaylamhopdong)
	;
-- 9.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm.
--  Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).
	select hd.IDhopdong, ngaylamhopdong,ngayketthuc,tiendatcoc,soluong,count(idhopdongchitiet) from hopdong as hd
    join hopdongchitiet as hdct on hd.IDHopDong = hdct.IDHopDong
    group by idhopdong;
   
-- 10.	Hiển thị thông tin các Dịch vụ đi kèm đã
-- được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và
--  có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
	select dvdk.iddichvudikem, tendichvudikem,gia from dichvudikem as dvdk
    join hopdongchitiet as hdct on dvdk.IDDichVuDiKem = hdct.IDDichVuDiKem
    join hopdong as hd on hd.IDHopDong = hdct.IDHopDong
    join khachhang as kh on kh.IDKhachHang = hd.IDHopDong
    join loaikhach as lk on lk.IDLoaiKhach = kh.IDLoaiKhach
    where Diachi='Danang';
-- 11.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc 
-- của tất cả các dịch vụ 
-- đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.

	select hd.IDHopdong,kh.hoten,nv.hoten,kh.sdt,tendichvu,soluong,ngaylamhopdong from dichvu as dv
    join hopdong as hd on hd.IDDichVu = dv.IDDichVu
    join Nhanvien as nv on nv.IdNhanvien = hd.idNhanvien
    join khachhang as kh on kh.idkhachhang = hd.idkhachhang
    join hopdongchitiet as hdct on hdct.IDHopDong = hd.IDHopDong
    where Month(NgayLamHopDong) in (3,10,11,12)
    and NgayLamHopDong not in
    (select Ngaylamhopdong from hopdongchitiet where ngaylamhopdong in (1,2,4,5,6));
-- 12.	Hiển thị thông tin các Dịch vụ đi kèm 
-- được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

	select dvdk.idDichvudikem,tendichvudikem,count(dvdk.iddichvudikem)as solansudung from dichvudikem as dvdk 
    join hopdongchitiet as hdct on dvdk.iddichvudikem = hdct.iddichvudikem
    group by TenDichVuDiKem
    having solansudung =
    (select  max(solansudung) from 
    (select dvdk.idDichvudikem,tendichvudikem,count(dvdk.iddichvudikem)as solansudung from dichvudikem as dvdk 
    join hopdongchitiet as hdct on dvdk.iddichvudikem = hdct.iddichvudikem
    group by TenDichVuDiKem) as tomtat);
-- 13.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
	select idhopdong,tendichvudikem,tendichvudikem,count(dvdk.tendichvudikem)as solansudung from Dichvudikem as dvdk
    join Hopdongchitiet as hdct on dvdk.iddichvudikem = hdct.iddichvudikem
    group by dvdk.tendichvudikem
    having solansudung =1;
    
	 -- Vi sao phai hien thi  idhopdong no se chon id hopdong nao?? 
	--  select idhopdong,tendichvudikem,tendichvudikem from Dichvudikem as dvdk
	--     join Hopdongchitiet as hdct on dvdk.iddichvudikem = hdct.iddichvudikem;
    
-- 14.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
		select nv.Idnhanvien,hoten,trinhdo,tenbophan,sdt,diachi,count(nv.idNhanvien) as solanlaphopdong from Nhanvien as nv
        join hopdong as hd on nv.idNhanvien = hd.idNhanvien
        join trinhdo as td on td.IDTrinhDo = nv.IDTrinhDo
        join bophan as bp on bp.IDBoPhan =nv.IDBoPhan
        group by nv.IDNhanVien
        having solanlaphopdong<3;
-- 15.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.



	select * from Nhanvien nv where nv.idnhanvien  in 
    (
    select hd.idNhanvien from  hopdong hd where hd.IdNhanvien = nv.IdNhanvien
    and year(ngaylamhopdong) in (20200,2021) );
    

-- 16.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với 
--  tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
	 update Khachhang kh set
     kh.idloaikhach =1
     where kh.idkhachhang in
    ( select idloaikhach from (select lk.idloaikhach,sum(tongtien)as tongtien from LoaiKhach lk 
	join Khachhang kh on kh.idloaiKhach = lk.idLoaikhach
    join Hopdong hd on hd.idKhachhang = kh.idKhachhang
    where     tenloaikhach = 'Platinum' 
    group by kh.idKhachhang
    having sum(TongTien)>5000)as b2);
    
	(select lk.idloaikhach,sum(tongtien)as tongtien from LoaiKhach lk 
	join Khachhang kh on kh.idloaiKhach = lk.idLoaikhach
    join Hopdong hd on hd.idKhachhang = kh.idKhachhang
    where     tenloaikhach = 'Platinum' 
    group by kh.idKhachhang
    having sum(TongTien)>5000);
    
-- 17.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràngbuộc giữa các bảng).
	-- config cho phép xóa bảng phụ nếu xóa bảng chính
	alter table hopdong
		drop foreign key hopdong_ibfk_2,
        add constraint fk_HD_KH foreign key (idKhachhang) references khachhang(idkhachhang) on delete cascade;
	alter table hopdongchitiet
		drop foreign key hopdongchitiet_ibfk_1,
        add constraint hdct_HDCT_HD foreign key (idhopdong) references hopdong(idhopdong) on delete cascade;
        
	delete from khachhang kh where
    kh.IDKhachHang in
    (select idkhachhang from hopdong where year(ngaylamhopdong)<=2019);	
-- 18.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 2 lần trong năm 2021 lên gấp đôi. 

	update dichvudikem set gia = gia*gia
    where iddichvudikem in
   ( select iddichvudikem from (select hdct.iddichvudikem,tendichvudikem from dichvudikem dvdk 
	join hopdongchitiet hdct on dvdk.IDDichVuDiKem = hdct.IDDichVuDiKem
    group by (dvdk.iddichvudikem)
    having count(dvdk.iddichvudikem)>2
    
    ) as abc);
    
-- 19.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống,
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
	select IDNhanVien,HoTen,Email,sdt,ngaysinh,diachi from Nhanvien
    union
    select IDKhachHang,HoTen,Email,sdt,ngaysinh,diachi from Khachhang; 
-- 20.	Tạo khung nhìn có tên là V_NHANVIEN để lấy được 
-- thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và 
-- dã từng lập hợp đồng cho 1 hoặc nhiều Khách hàng bất kỳ
--  với ngày lập hợp đồng là “12/12/2019”
	create view V_NHANVIEN as
	select nv.Idnhanvien,hoten from nhanvien nv 
    join hopdong hd on nv.IDNhanVien = hd.IDNhanVien
    where diachi='codegym' and ngaylamhopdong = '12/12/2019' ;
-- 21	Thông qua khung nhìn V_NHANVIEN thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các Nhân viên được nhìn thấy bởi khung nhìn này.
	-- update v_nhanvien 
--     set diachi ='LienChieu';
-- 22.	Tạo Store procedure Sp_1 Dùng để xóa thông tin của một Khách hàng nào đó với Id Khách hàng được truyền vào như là 1 tham số của Sp_1

DELIMITER //
CREATE PROCEDURE SP_1(
    IN  id int
)
BEGIN
    delete from Khachhang 
    where idKhachhang = id;
END //

DELIMITER ;
call SP_1(8);
-- 23.	Tạo Store procedure Sp_2 Dùng để thêm mới vào bảng HopDong với yêu cầu 
-- Sp_2 phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, 
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
DROP Procedure SP_2;
DELIMITER //
CREATE PROCEDURE SP_2(
    IN  id_hd int,
    In 	id_nv int,
    in  id_kh int,
    in  id_dv int
)
BEGIN
	declare Have_id_hd int;
    declare Have_id_nv int;
    declare Have_id_kh int;
    declare Have_id_dv int;
		set Have_id_hd = (select count(idHopdong) from Hopdong where idHopdong = id_hd);
        set Have_id_nv = (select count(idNhanvien) from Nhanvien where idNhanvien = id_nv);
        set Have_id_kh =(select count(idKhachhang) from Khachhang where idKhachhang = id_kh);
        set have_id_dv = (select count(idDichvu) from dichvu where iddichvu = id_dv);
        select Have_id_kh;
		if Have_id_hd>0 then 
			select 'Id Hopdong da ton tai';
		elseif Have_id_kh=0 then 
			select 'Id_Khachhang khong ton tai';
		elseif Have_id_nv = 0 then
			select 'Id Nhanvien khong ton tai';
		elseif Have_id_dv = 0 then
			select 'id Dichvu khong ton tai';
		else
		    insert into hopdong(idhopdong,idnhanvien,idkhachhang,iddichvu) values(id_hd,id_nv,id_kh,id_dv);
		end if;
END //
DELIMITER ;
call sp_2(10,3,4,2);
select * from hopdong;
-- 24.	Tạo triggers có tên Tr_1 Xóa bản ghi trong bảng HopDong
-- thì hiển thị tổng số lượng bản ghi còn lại có trong bảng HopDong ra giao diện console của database
drop trigger if exists tr_del_Hopdong;
delimiter //
create trigger tr_del_Hopdong
before delete on hopdong
for each row
begin
	set @dem = (select count(idhopdong) as count from hopdong);
end;
 delimiter ;
 
 set @dem =0;
 delete from hopdong where idhopdong = 10;
 select @dem as "so hop dong con lai";
-- before insert on hopdong
-- for each row
-- set New.tiendatcoc = tiendatcoc+2000;
delete from Hopdong 
where idHopdong = 10; 
-- 25.	Tạo triggers có tên Tr_2 Khi cập nhật Ngày kết thúc hợp đồng,
--  cần kiểm tra xem thời gian cập nhật có phù hợp hay không,
--  với quy tắc sau: Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày. 
-- Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu dữ liệu không hợp lệ thì
--  in ra thông báo “Ngày kết thúc hợp đồng phải lớn hơn ngày làm hợp đồng ít nhất là 2 ngày” trên console của database

drop trigger if exists tr_up_Hopdong;
delimiter //
create trigger tr_up_Hopdong
before update on hopdong
for each row
begin
	set @dem = (select count(idhopdong) as count from hopdong);
end;