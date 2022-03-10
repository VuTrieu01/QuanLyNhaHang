/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.KetNoiSQL;
import Model.DatMon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRUYEN
 */
public class DatMonDao {

    public boolean insertmon(DatMon dt) throws Exception {
        String sql = "INSERT INTO [dbo].[DatMon]([MaMon],[MaBan],[SoLuong],[ThanhTien]) VALUES (?,?,?,?)";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, dt.getMaMon());
            pstmt.setString(2, dt.getMaBan());
            pstmt.setInt(3, dt.getSoLuong());
            pstmt.setInt(4, dt.getThanhTien());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public List<DatMon> findAllmon(String maBan) throws Exception {
        String sql = "select td.MaMon, TenMon, DonGia, SoLuong, ThanhTien from ThucDon td join DatMon dt on td.MaMon = dt.MaMon where [MaBan] = ?";
        try (
                java.sql.Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maBan);
            try (ResultSet rs = pstmt.executeQuery();) {
                List<DatMon> list = new ArrayList<>();
                while (rs.next()) {
                    DatMon dt = new DatMon();
                    dt.setMaMon(rs.getString("MaMon"));
                    dt.setTenMon(rs.getString("TenMon"));
                    dt.setDonGia(rs.getString("DonGia"));
                    dt.setSoLuong(rs.getInt("SoLuong"));
                    dt.setThanhTien(rs.getInt("ThanhTien"));
                    list.add(dt);
                }
                return list;
            }
        }
    }

    public boolean delete(String maBan) throws Exception {
        String sql = "delete from DatMon where [MaBan] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maBan);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }
}
