/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.KetNoiSQL;
import Model.HoaDon;
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
public class HoaDonDao {

    public boolean inserthd(HoaDon hd) throws Exception {

        String sql = "set dateformat DMY INSERT INTO [dbo].[HoaDon]([NgayHD],[TongTien]) VALUES(?,?)";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, hd.getNgayHD());
            pstmt.setInt(2, hd.getTongTien());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean deletea(String ngayHD) throws Exception {
        String sql = "delete from HoaDon where [NgayHD] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, ngayHD);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean delete(String soHoaDon) throws Exception {
        String sql = "delete from HoaDon where [SoHoaDon] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, soHoaDon);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public List<HoaDon> findAllhd() throws Exception {
        String sql = "select * from HoaDon";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<HoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setSoHoaDon(rs.getInt("SoHoaDon"));
                    hd.setNgayHD(rs.getString("NgayHD"));
                    hd.setTongTien(rs.getInt("TongTien"));
                    list.add(hd);
                }
                return list;
            }
        }
    }

    public List<HoaDon> findtableNgayHD(String ngayHD) throws Exception {
        String sql = "set dateformat DMY SELECT * FROM HoaDon where NgayHD like '%" + ngayHD + "%'";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<HoaDon> list = new ArrayList<>();
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setSoHoaDon(rs.getInt("SoHoaDon"));
                    hd.setNgayHD(rs.getString("NgayHD"));
                    hd.setTongTien(rs.getInt("TongTien"));
                    list.add(hd);
                }
                return list;
            }
        }
    }
}
