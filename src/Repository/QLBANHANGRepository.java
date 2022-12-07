/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utility.DBConnect;
import ViewModel.QLBanHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class QLBANHANGRepository {
       public List<QLBanHang> getAllMenu() {
        String query = "SELECT [MAMON]\n"
                + "      ,[TENMON]\n"
                + "      ,[SOLUONG]\n"
                + "      ,[GIATIEN]\n"
                + "      ,[MOTA]\n"
                + "  FROM [dbo].[MENU]";
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<QLBanHang> list = new ArrayList<>();
            while (rs.next()) {
                QLBanHang qlnv = new QLBanHang(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
                list.add(qlnv);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(QLBanHang q) {
        String query = "INSERT INTO [dbo].[MonDaOrder]\n"
                + "           ([MaMon]\n"
                + "           ,[TenMon]\n"
                + "           ,[SoLuong]\n"
                + "           ,[GiaTien]\n"
                + "           ,[Mota])\n"
                + "     VALUES\n"
                + "           (?, ?, ?, ?, ?)";
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, q.getMaMonMenu());
            ps.setObject(2, q.getTenMonMenu());
            ps.setObject(3, q.getSoLuongHienTaiMenu());
            ps.setObject(4, q.getGiaTienMenu());
            ps.setObject(5, q.getThongtinMenu());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<QLBanHang> getAllOrder() {
        String query = "SELECT [MaMon]\n"
                + "      ,[TenMon]\n"
                + "      ,[SoLuong]\n"
                + "      ,[GiaTien]\n"
                + "      ,[Mota]\n"
                + "  FROM [dbo].[MonDaOrder]";
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<QLBanHang> list = new ArrayList<>();
            while (rs.next()) {
                QLBanHang qlnv = new QLBanHang(rs.getString(1),rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5));
                list.add(qlnv);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        new QLBanHangRepository().getAllOrder().forEach(n -> System.out.println(n.toString()));
    }
}
