/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author FPT Shop
 */
public class QLBanHang {

     private String tenKhachhanng;
    private String sdt;
    private int soLuongKhach;
    private String gioVaoBan;
    private String chonBan;
    
    private String maMonMenu;
    private String tenMonMenu;
    private int soLuongHienTaiMenu;
    private float giaTienMenu;
    private String thongtinMenu;

    public QLBanHang(String tenKhachhanng, String sdt, int soLuongKhach, String gioVaoBan, String chonBan, String maMonMenu, String tenMonMenu, int soLuongHienTaiMenu, float giaTienMenu, String thongtinMenu) {
        this.tenKhachhanng = tenKhachhanng;
        this.sdt = sdt;
        this.soLuongKhach = soLuongKhach;
        this.gioVaoBan = gioVaoBan;
        this.chonBan = chonBan;
        this.maMonMenu = maMonMenu;
        this.tenMonMenu = tenMonMenu;
        this.soLuongHienTaiMenu = soLuongHienTaiMenu;
        this.giaTienMenu = giaTienMenu;
        this.thongtinMenu = thongtinMenu;
    }

   

    public QLBanHang() {
    }

    public String getTenKhachhanng() {
        return tenKhachhanng;
    }

    public void setTenKhachhanng(String tenKhachhanng) {
        this.tenKhachhanng = tenKhachhanng;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public String getGioVaoBan() {
        return gioVaoBan;
    }

    public void setGioVaoBan(String gioVaoBan) {
        this.gioVaoBan = gioVaoBan;
    }

    public String getChonBan() {
        return chonBan;
    }

    public void setChonBan(String chonBan) {
        this.chonBan = chonBan;
    }

    public String getMaMonMenu() {
        return maMonMenu;
    }

    public void setMaMonMenu(String maMonMenu) {
        this.maMonMenu = maMonMenu;
    }

    public String getTenMonMenu() {
        return tenMonMenu;
    }

    public void setTenMonMenu(String tenMonMenu) {
        this.tenMonMenu = tenMonMenu;
    }

    public int getSoLuongHienTaiMenu() {
        return soLuongHienTaiMenu;
    }

    public void setSoLuongHienTaiMenu(int soLuongHienTaiMenu) {
        this.soLuongHienTaiMenu = soLuongHienTaiMenu;
    }

    public float getGiaTienMenu() {
        return giaTienMenu;
    }

    public void setGiaTienMenu(float giaTienMenu) {
        this.giaTienMenu = giaTienMenu;
    }

    public String getThongtinMenu() {
        return thongtinMenu;
    }

    public void setThongtinMenu(String thongtinMenu) {
        this.thongtinMenu = thongtinMenu;
    }

    
}
