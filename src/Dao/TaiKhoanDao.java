/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.KetNoiSQL;
import Model.DatBan;
import Model.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author TRUYEN
 */
public class TaiKhoanDao {

    public TaiKhoan checkLogin(String tenTk, String matKhau) throws Exception {
        String sql = "Select * from TaiKhoan where TenTk = ? and MatKhau = ? ";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, tenTk);
            pstmt.setString(2, matKhau);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setTenTk(tenTk);
                    tk.setVaiTro(rs.getString("VaiTro"));
                    return tk;
                }
            }
            return null;
        }
    }

    public TaiKhoan findByKiemtra(String tenTk, String vaitro) throws Exception {
        String sql = "Select * from TaiKhoan where TenTk = ? and VaiTro = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, tenTk);
            pstmt.setString(2, vaitro);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    TaiKhoan tk = new TaiKhoan();
                    tk.setTenTk(rs.getString("TenTk"));
                    tk.setMatKhau(rs.getString("MatKhau"));
                    tk.setVaiTro(rs.getString("VaiTro"));
                    return tk;
                }
            }
            return null;
        }
    }

    public boolean update(TaiKhoan tk, TaiKhoan mk) throws Exception {
        String sql = "UPDATE [dbo].[TaiKhoan] SET [MatKhau] = ? WHERE [TenTk] = ? and [MatKhau] = ?";
        try (
                Connection connection = KetNoiSQL.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, mk.getMatKhau());
            pstmt.setString(2, tk.getTenTk());
            pstmt.setString(3, tk.getMatKhau());
            return pstmt.executeUpdate() > 0; //lớn hơn 0 có bản ghi được chèn vào cơ sở dữ liệu, nghĩa là có thành công
        }
    }
}
