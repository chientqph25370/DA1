/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ViewModel.QLNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Utility.DBConnect;
import java.sql.*;

/**
 *
 * @author admin
 */
public class QLNVRepository {

    public List<QLNhanVien> getAll() {
        String query = "SELECT [MANV]\n"
                + "      ,[TENNV]\n"
                + "      ,[DIACHI]\n"
                + "	  ,[NGAYSINH]\n"
                + "	  ,[SDT]\n"
                + "      ,[SOGIOLAM]\n"
                + "	  ,[GIOITINH]\n"
                + "	  ,[VAITRO]\n"
                + "      ,[SONGAYLAM]\n"
                + "  FROM [dbo].[NHANVIEN]";
        try (Connection con =DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<QLNhanVien> list = new ArrayList<>();
            while (rs.next()) {
                QLNhanVien qlnv = new QLNhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getFloat(6), rs.getBoolean(7), rs.getString(8), rs.getInt(9));
                list.add(qlnv);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(QLNhanVien q) {
        String query = "INSERT INTO [dbo].[NHANVIEN]\n"
                + "           ([TENNV]\n"
                + "           ,[DIACHI]\n"
                + "	      ,[NGAYSINH]\n"
                + "	      ,[SDT]\n"
                + "           ,[SOGIOLAM]\n"
                + "           ,[GIOITINH]\n"
                + "           ,[VAITRO]\n"
                + "           ,[SONGAYLAM]\n"
                + "           )\n"
                + "     VALUES\n"
                + "           (?, ?, ?, ?, ?, ?, ?, ?)";
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, q.getTenNV());
            ps.setObject(2, q.getDiaChi());
            ps.setObject(3, q.getNgaySinh());
            ps.setObject(4, q.getSdt());
            ps.setObject(5, q.getSoGioLam());
            ps.setObject(6, q.isGioiTinh());
            ps.setObject(7, q.getVaiTro());
            ps.setObject(8, q.getSoNgayLam());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[NHANVIEN]\n"
                + "      WHERE MANV = ?";
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(QLNhanVien q, String ma) {
        String query = "UPDATE [dbo].[NHANVIEN]\n"
                + "   SET [TENNV] = ?\n"
                + "      ,[DIACHI] = ?\n"
                + "	        ,[NGAYSINH] = ?\n"
                + "      ,[SDT] = ?\n"
                + "      ,[SOGIOLAM] = ?\n"
                + "	        ,[GIOITINH] = ?\n"
                + "      ,[VAITRO] = ?\n"
                + "      ,[SONGAYLAM] = ?\n"
                + "\n"
                + " WHERE MANV = ?";
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, q.getTenNV());
            ps.setObject(2, q.getDiaChi());
            ps.setObject(3, q.getNgaySinh());
            ps.setObject(4, q.getSdt());
            ps.setObject(5, q.getSoGioLam());
            ps.setObject(6, q.isGioiTinh());
            ps.setObject(7, q.getVaiTro());
            ps.setObject(8, q.getSoNgayLam());
            ps.setObject(9, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

}
