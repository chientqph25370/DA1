/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import ViewModel.QLKhuyenMaiReponse;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Utility.DBConnect;

/**
 *
 * @author FPT Shop
 */
public class QLKhuyenMaiRepository {

    public List<QLKhuyenMaiReponse> getAll() {
        List<QLKhuyenMaiReponse> kmresponse = new ArrayList<>();
        String sql = "select * from KHUYENMAI";
        Connection con = DBConnect.getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                kmresponse.add(new QLKhuyenMaiReponse(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(6), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kmresponse;
    }

    public String insert(QLKhuyenMaiReponse km) {
        String sql = "INSERT INTO [dbo].[KHUYENMAI]\n"
                + "           ([MAKM]\n"
                + "           ,[TENKM]\n"
                + "           ,[TRANGTHAI]\n"
                + "           ,[NOIDUNG]\n"
                + "           ,[NGAYBATDAU]\n"
                + "           ,[NGAYKETTHUC])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        Connection con = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = con.prepareStatement(sql);
            ptsm.setString(1, km.getMaKm());
            ptsm.setString(2, km.getTenKm());
            ptsm.setString(3, km.getTrangthai());
            ptsm.setString(4, km.getNoiDung());
            ptsm.setString(5, km.getNgayBatDau());
            ptsm.setString(6, km.getNgayKetThuc());
            ptsm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String delete(QLKhuyenMaiReponse km) {
        String sql = "delete KHUYENMAI where MAKM =?";
        Connection con = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = con.prepareStatement(sql);
            ptsm.setString(1, km.getMaKm());
            ptsm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String update(QLKhuyenMaiReponse km) {
        String sql = "UPDATE [dbo].[KHUYENMAI]\n"
                + "   SET [TENKM] = ?\n"
                + "      ,[TRANGTHAI] = ?\n"
                + "      ,[NOIDUNG] = ?\n"
                + "      ,[NGAYBATDAU] = ?\n"
                + "      ,[NGAYKETTHUC] = ?\n"
                + " WHERE [MAKM] = ?";
        Connection con = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = con.prepareStatement(sql);
           
            ptsm.setString(1, km.getTenKm());
            ptsm.setString(4, km.getNgayBatDau());
            ptsm.setString(5, km.getNgayKetThuc());
            ptsm.setString(2, km.getTrangthai());
            ptsm.setString(3, km.getNoiDung());
             ptsm.setString(6, km.getMaKm());
            ptsm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QLKhuyenMaiRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
