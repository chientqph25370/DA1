/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Utility.DBConnect;
import ViewModel.QLHoaDonReponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author FPT Shop
 */
public class QLHoaDonRepository {
    private String select_hoadon = " ";
    public List<QLHoaDonReponse> getall() {
        List<QLHoaDonReponse> listhoadon  = new ArrayList<>();
        try (Connection conn = DBConnect.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(select_hoadon);
            while (rs.next()) {
               listhoadon.add(new QLHoaDonReponse(select_hoadon, select_hoadon, select_hoadon, select_hoadon, 0, select_hoadon, select_hoadon, 0));

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi ko the ket noi");
        }
        return listhoadon;

    }
}
