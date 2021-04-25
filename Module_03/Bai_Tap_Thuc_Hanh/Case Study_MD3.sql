drop database caseStudy_md3;
create database caseStudy_md3;
use caseStudy_md3;
create table viTri(
idViTri int primary key,
tenViTri varchar(50)
);
create table trinhDo(
idTrinhDo int  primary key,
trinhDo varchar(50)
);

create table boPhan(
idBoPhan int primary key,
tenBoPhan varchar(50)
);
create table nhanVien(
idNhanVien int  primary key,
hoTen varchar(50),
idViTri int,
idTrinhDo int,
idBoPhan int,
ngaySinh date,
soCMND int,
luong double,
sdt int,
email varchar(50),
diaChi varchar(50),
 foreign key (idViTri) references viTri (idViTri),
 foreign key (idTrinhDo) references trinhDo(idTrinhDo),
foreign key (idBoPhan) references boPhan(idBoPhan)
);

create table loaiKhach(
idLoaiKhach int primary key,
tenLoaiKhach varchar(50)
);

create table khachHang(
idKhachHang int primary key,
idLoaiKhach int,
hoTen varchar(50),
ngaySinh date,
soCMND int,
sdt int,
email varchar(50),
diaChi varchar(50),
foreign key (idLoaiKhach) references loaiKhach(idLoaiKhach)
);

create table kieuThue(
idKieuThue int primary key,
tenKieuThue varchar(50),
gia int
);

create table loaiDichVu(
idLoaiDichVu int primary key,
tenLoaiDichVu varchar(50)
);

create table dichVu(
idDichVu int primary key,
tenDichVu varchar(50),
dienTich double,
soTang int,
soNguoiToiDa int,
chiPhiThue double,
idKieuThue int,
idLoaiDichVu int,
trangThai varchar(50),
foreign key (idKieuThue) references kieuThue(idKieuThue),
foreign key (idLoaiDichVu) references loaiDichVu(idLoaiDichVu)
);

create table hopDong(
idHopDong int primary key,
idNhanVien int,
idKhachHang int,
idDichVu int,
ngayLamHopDong date,
ngayKetThuc date,
tienDatCoc double,
tongTien double,
foreign key(idNhanVien) references nhanVien(idNhanVien),
foreign key(idKhachHang) references khachHang(idKhachHang),
foreign key(idDichVu) references dichVu(idDichVu)
);

create table dichVuDiKem(
idDichVuDiKem int primary key,
tenDichVuDikem varchar(50),
gia double,
donVi double,
trangThaiKhaDung varchar(50)
);

create table hopDongChiTiet(
idHopDongChiTiet int  primary key,
idHopDong int,
idDichVuDiKem int,
soLuong int,
foreign key (idHopDong) references hopDong(idHopDong),
foreign key (idDichVuDiKem) references dichVuDiKem(idDichVuDiKem)
);


