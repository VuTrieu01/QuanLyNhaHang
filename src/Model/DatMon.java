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
public class DatMon {

    private int STT;
    private String MaMon;
    private String MaBan;
    private String TenMon;
    private String DonGia;
    private int SoLuong;
    private int ThanhTien;

    public DatMon() {
    }

    public DatMon(int STT, String MaMon, String MaBan, String TenMon, String DonGia, int SoLuong, int ThanhTien) {
        this.STT = STT;
        this.MaMon = MaMon;
        this.MaBan = MaBan;
        this.TenMon = TenMon;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
}
