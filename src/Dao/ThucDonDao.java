/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.KetNoiSQL;
import Model.ThucDon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRUYEN
 */
public class ThucDonDao {

    public boolean insert(ThucDon td) throws Exception {
        String sql = "INSERT [dbo].[ThucDon]([TenMon],[Loai],[DonGia]) VALUES(?,?,?)";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, td.getTenMon());
            pstmt.setString(2, td.getLoai());
            pstmt.setString(3, td.getDonGia());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean update(ThucDon td) throws Exception {
        String sql = "UPDATE [dbo].[ThucDon] SET [TenMon] = ?,[Loai] = ?,[DonGia] = ? WHERE [MaMon] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, td.getTenMon());
            pstmt.setString(2, td.getLoai());
            pstmt.setString(3, td.getDonGia());
            pstmt.setString(4, td.getMaMon());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean delete(String maMon) throws Exception {
        String sql = "delete from ThucDon where [MaMon] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maMon);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public List<ThucDon> findtableMamon(String maMon) throws Exception {
        String sql = "SELECT * FROM ThucDon where MaMon like '%" + maMon + "%'";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<ThucDon> list = new ArrayList<>();
                while (rs.next()) {
                    ThucDon td = new ThucDon();
                    td.setMaMon(rs.getString("MaMon"));
                    td.setTenMon(rs.getString("TenMon"));
                    td.setLoai(rs.getString("Loai"));
                    td.setDonGia(rs.getString("DonGia"));
                    list.add(td);
                }
                return list;
            }
        }
    }

//    public List<ThucDon> findtabletenMon(String tenMon) throws Exception {
//        String sql = "SELECT * FROM ThucDon where TenMon like '%" + tenMon + "%'";
//        try (
//                Connection connection = KetNoiSQL.getConnection();
//                PreparedStatement pstmt = connection.prepareStatement(sql);) {
//            try (ResultSet rs = pstmt.executeQuery();) {
//                List<ThucDon> list = new ArrayList<>();
//                while (rs.next()) {
//                    ThucDon td = new ThucDon();
//                    td.setMaMon(rs.getString("MaMon"));
//                    td.setTenMon(rs.getString("TenMon"));
//                    td.setLoai(rs.getString("Loai"));
//                    td.setDonGia(rs.getString("DonGia"));
//                    list.add(td);
//                }
//                return list;
//            }
//        }
//    }
    public ThucDon findByMaMon(String maMon) throws Exception {
        String sql = "select * from ThucDon where [MaMon] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maMon);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    ThucDon td = new ThucDon();
                    td.setMaMon(rs.getString("MaMon"));
                    td.setTenMon(rs.getString("TenMon"));
                    td.setLoai(rs.getString("Loai"));
                    td.setDonGia(rs.getString("DonGia"));
                    return td;
                }
            }
            return null;
        }
    }

    public List<ThucDon> findByLoai(String loai) throws Exception {
        String sql = "select * from ThucDon where [Loai] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, loai);
            try (ResultSet rs = pstmt.executeQuery();) {
                List<ThucDon> list = new ArrayList<>();
                while (rs.next()) {
                    ThucDon td = new ThucDon();
                    td.setMaMon(rs.getString("MaMon"));
                    td.setTenMon(rs.getString("TenMon"));
                    td.setLoai(rs.getString("Loai"));
                    td.setDonGia(rs.getString("DonGia"));
                    list.add(td);
                }
                return list;
            }
        }
    }

    public List<ThucDon> findAll() throws Exception {
        String sql = "select * from ThucDon";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<ThucDon> list = new ArrayList<>();
                while (rs.next()) {
                    ThucDon td = new ThucDon();
                    td.setMaMon(rs.getString("MaMon"));
                    td.setTenMon(rs.getString("TenMon"));
                    td.setLoai(rs.getString("Loai"));
                    td.setDonGia(rs.getString("DonGia"));
                    list.add(td);
                }
                return list;
            }
        }
    }
}
