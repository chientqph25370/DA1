/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utility.DBConnect;
import ViewModel.QLNguyenLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLNLRepository {

    public List<QLNguyenLieu> getAll() {
        String query = "SELECT [MANL]\n"
                + "      ,[TENNL]\n"
                + "      ,[SOLUONG]\n"
                + "      ,[GIATIEN]\n"
                + "      ,[MOTA]\n"
                + "  FROM [dbo].[NGUYENLIEU]";
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<QLNguyenLieu> list = new ArrayList<>();
            while (rs.next()) {
                QLNguyenLieu qlnv = new QLNguyenLieu(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
                list.add(qlnv);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(QLNguyenLieu q) {
        String query = "INSERT INTO [dbo].[NGUYENLIEU]\n"
                + "           ([TENNL]\n"
                + "           ,[SOLUONG]\n"
                + "           ,[GIATIEN]\n"
                + "           ,[MOTA])\n"
                + "     VALUES\n"
                + "           (?, ?, ?, ?)";
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, q.getTenNL());
            ps.setObject(2, q.getSoLuong());
            ps.setObject(3, q.getGiaTien());
            ps.setObject(4, q.getMoTa());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[NGUYENLIEU]\n"
                + "      WHERE MANL = ?";
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

    public boolean update(QLNguyenLieu q, String ma) {
        String query = "UPDATE [dbo].[NGUYENLIEU]\n"
                + "   SET [TENNL] = ?\n"
                + "      ,[SOLUONG] = ?\n"
                + "      ,[GIATIEN] = ?\n"
                + "      ,[MOTA] = ?\n"
                + " WHERE MANL = ?";
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, q.getTenNL());
            ps.setObject(2, q.getSoLuong());
            ps.setObject(3, q.getGiaTien());
            ps.setObject(4, q.getMoTa());
            ps.setObject(5, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
