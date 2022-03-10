package Dao;

import Helper.KetNoiSQL;
import Model.DatBan;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatBanDao {

    public boolean insert(DatBan db) throws Exception {
        String sql = "INSERT INTO [dbo].[DatBan]([MaBan],[TrangThai])" + " VALUES(?,?)";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, db.getMaBan());
            pstmt.setInt(2, db.getTrangThai());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean update(DatBan db) throws Exception {
        String sql = "UPDATE [dbo].[DatBan] SET [TrangThai] = ? WHERE [MaBan] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(2, db.getMaBan());
            pstmt.setInt(1, db.getTrangThai());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public boolean delete(String maBan) throws Exception {
        String sql = "delete from DatBan where [MaBan] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maBan);
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }

    public DatBan findByKiemtra(int trangthai, String maBan) throws Exception {
        String sql = "select * from DatBan where TrangThai = ? and MaBan = ?";
//        String sql = "select * from DatBan where [TrangThai] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setInt(1, trangthai);
            pstmt.setString(2, maBan);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    DatBan db = new DatBan();
                    db.setMaBan(rs.getString("maBan"));
                    db.setTrangThai(rs.getInt("trangThai"));
                    return db;
                }
            }
            return null;
        }
    }
}
