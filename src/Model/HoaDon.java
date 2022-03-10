/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author TRUYEN
 */
public class HoaDon {

    int SoHoaDon;
    String NgayHD;
    int TongTien;

    public HoaDon() {
    }

    public HoaDon(int SoHoaDon, String NgayHD, int TongTien) {
        this.SoHoaDon = SoHoaDon;
        this.NgayHD = NgayHD;
        this.TongTien = TongTien;
    }

    public int getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(int SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String NgayHD) {
        this.NgayHD = NgayHD;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

}
