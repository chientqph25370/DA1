/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

/**
 *
 * @author admin
 */
public class QLNhanVien {
    private String maNV;
    private String tenNV;
    private String diaChi;
    private String ngaySinh;
    private String sdt;
    private float soGioLam;
    private boolean gioiTinh;
    private String vaiTro;
    private int soNgayLam;
    
    public QLNhanVien() {
    }

    public QLNhanVien(String maNV, String tenNV, String diaChi, String ngaySinh, String sdt, float soGioLam, boolean gioiTinh, String vaiTro, int soNgayLam) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.soGioLam = soGioLam;
        this.gioiTinh = gioiTinh;
        this.vaiTro = vaiTro;
        this.soNgayLam = soNgayLam;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(float soGioLam) {
        this.soGioLam = soGioLam;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }
    
    public float luongPhaiTra(){
        return (float) (soGioLam * 20000 * soNgayLam);
    }

    @Override
    public String toString() {
        return "QLNhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", diaChi=" + diaChi + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", soGioLam=" + soGioLam + ", gioiTinh=" + gioiTinh + ", vaiTro=" + vaiTro + ", soNgayLam=" + soNgayLam + '}';
    }
    
    public Object[] toDataRowQLNV(){
        return new Object[]{maNV, tenNV, gioiTinh == true ? "Nam" : "Nữ", ngaySinh, diaChi, sdt, vaiTro, luongPhaiTra()};
    }  
}
