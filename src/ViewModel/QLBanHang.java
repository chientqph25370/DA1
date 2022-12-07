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
    
    
    private String maMonOrder;
    private String tenMonOrder;
    private float giaTienOrder;
    private String thongTinOrder;
    private int soLuongMonOrder;
    
    public QLBanHang() {
    }

    public QLBanHang(String maMonOrder, String tenMonOrder, float giaTienOrder, String thongTinOrder, int soLuongMonOrder) {
        this.maMonOrder = maMonOrder;
        this.tenMonOrder = tenMonOrder;
        this.giaTienOrder = giaTienOrder;
        this.thongTinOrder = thongTinOrder;
        this.soLuongMonOrder = soLuongMonOrder;
    }

    

    public QLBanHang(String maMonMenu, String tenMonMenu, int soLuongHienTaiMenu, float giaTienMenu, String thongtinMenu) {
        this.maMonMenu = maMonMenu;
        this.tenMonMenu = tenMonMenu;
        this.soLuongHienTaiMenu = soLuongHienTaiMenu;
        this.giaTienMenu = giaTienMenu;
        this.thongtinMenu = thongtinMenu;
    }

    public QLBanHang(String tenKhachhanng, String sdt, int soLuongKhach, String gioVaoBan, String chonBan, String maMonMenu, String tenMonMenu, int soLuongHienTaiMenu, float giaTienMenu, String thongtinMenu, String maMonOrder, String tenMonOrder, float giaTienOrder, String thongTinOrder, int soLuongMonOrder) {
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
        this.maMonOrder = maMonOrder;
        this.tenMonOrder = tenMonOrder;
        this.giaTienOrder = giaTienOrder;
        this.thongTinOrder = thongTinOrder;
        this.soLuongMonOrder = soLuongMonOrder;
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

    public String getMaMonOrder() {
        return maMonOrder;
    }

    public void setMaMonOrder(String maMonOrder) {
        this.maMonOrder = maMonOrder;
    }

    public String getTenMonOrder() {
        return tenMonOrder;
    }

    public void setTenMonOrder(String tenMonOrder) {
        this.tenMonOrder = tenMonOrder;
    }

    public float getGiaTienOrder() {
        return giaTienOrder;
    }

    public void setGiaTienOrder(float giaTienOrder) {
        this.giaTienOrder = giaTienOrder;
    }

    public String getThongTinOrder() {
        return thongTinOrder;
    }

    public void setThongTinOrder(String thongTinOrder) {
        this.thongTinOrder = thongTinOrder;
    }

    public int getSoLuongMonOrder() {
        return soLuongMonOrder;
    }

    public void setSoLuongMonOrder(int soLuongMonOrder) {
        this.soLuongMonOrder = soLuongMonOrder;
    }

    @Override
    public String toString() {
        return "QLBanHang{" + "tenKhachhanng=" + tenKhachhanng + ", sdt=" + sdt + ", soLuongKhach=" + soLuongKhach + ", gioVaoBan=" + gioVaoBan + ", chonBan=" + chonBan + ", maMonMenu=" + maMonMenu + ", tenMonMenu=" + tenMonMenu + ", soLuongHienTaiMenu=" + soLuongHienTaiMenu + ", giaTienMenu=" + giaTienMenu + ", thongtinMenu=" + thongtinMenu + ", maMonOrder=" + maMonOrder + ", tenMonOrder=" + tenMonOrder + ", giaTienOrder=" + giaTienOrder + ", thongTinOrder=" + thongTinOrder + ", soLuongMonOrder=" + soLuongMonOrder + '}';
    }

    
    public Object[] toDataRow(){
        return new Object[]{maMonMenu, tenMonMenu, soLuongHienTaiMenu, giaTienMenu, thongtinMenu};
    }
    
}
