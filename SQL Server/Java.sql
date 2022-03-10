--0/Tạo Bảng Quan Ly Nha Hang 

create database QuanLyNhaHang
GO
use QuanLyNhaHang
go

--1/Tạo bảng thực đơn
create table ThucDon
(
	MaMon int identity(1,1),
	TenMon nvarchar(100),
	Loai nvarchar(20),
	DonGia int,
	primary key(MaMon)
)
go

--2/Tạo bảng hóa đơn
create table HoaDon
(
	SoHoaDon int identity(1,1),	
	NgayHD date not null,
	TongTien int not null,
	primary key(SoHoaDon),
)
go

--3/Tạo bảng đặt bàn 
create table DatBan
(
	MaBan char(4),
	TrangThai bit,
	primary key (MaBan),
)
go


--4/Tạo bảng đặt món
create table DatMon
(
	STT int identity(1,1),
	MaMon int not null,
	MaBan char(4) not null,
	SoLuong int not null,
	ThanhTien int,
	Primary key (STT, MaMon, MaBan)
)
go

--5/Tạo bảng tài khoản
create table TaiKhoan
(
	TenTk char(10),
	MatKhau char(10),
	VaiTro char(5),
	primary key (TenTk)
)
go

--8/Tạo bảng đăng ký
create table DangKy
(
	TenTk char(10),
	SoDT char(10),
	NgayDangKy date,
	primary key(TenTK, SoDT)
)
go

--7/Tạo khóa ngoại cho đặt món
alter table DatMon add foreign key (MaMon) references ThucDon
go

alter table DatMon add foreign key (MaBan) references DatBan
go