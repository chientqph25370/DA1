/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author FPT Shop
 */
public class QLBanHangReponse {

    private String TenKhachhanng;
    private int soluongkhach;
    private String giovaoban;
    private int soluongmonOrder;
    private String Tenmon;
    private float GiaTien;
    private String Thongtin;
    private int SoLuongHienTai;

    public QLBanHangReponse(String TenKhachhanng, int soluongkhach, String giovaoban, int soluongmonOrder, String Tenmon, float GiaTien, String Thongtin, int SoLuongHienTai) {
        this.TenKhachhanng = TenKhachhanng;
        this.soluongkhach = soluongkhach;
        this.giovaoban = giovaoban;
        this.soluongmonOrder = soluongmonOrder;
        this.Tenmon = Tenmon;
        this.GiaTien = GiaTien;
        this.Thongtin = Thongtin;
        this.SoLuongHienTai = SoLuongHienTai;
    }

    public QLBanHangReponse() {
    }

    public String getTenKhachhanng() {
        return TenKhachhanng;
    }

    public void setTenKhachhanng(String TenKhachhanng) {
        this.TenKhachhanng = TenKhachhanng;
    }

    public int getSoluongkhach() {
        return soluongkhach;
    }

    public void setSoluongkhach(int soluongkhach) {
        this.soluongkhach = soluongkhach;
    }

    public String getGiovaoban() {
        return giovaoban;
    }

    public void setGiovaoban(String giovaoban) {
        this.giovaoban = giovaoban;
    }

    public int getSoluongmonOrder() {
        return soluongmonOrder;
    }

    public void setSoluongmonOrder(int soluongmonOrder) {
        this.soluongmonOrder = soluongmonOrder;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String Tenmon) {
        this.Tenmon = Tenmon;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getThongtin() {
        return Thongtin;
    }

    public void setThongtin(String Thongtin) {
        this.Thongtin = Thongtin;
    }

    public int getSoLuongHienTai() {
        return SoLuongHienTai;
    }

    public void setSoLuongHienTai(int SoLuongHienTai) {
        this.SoLuongHienTai = SoLuongHienTai;
    }

}
