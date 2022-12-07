/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLBanHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface QLBanHangService {
    List<QLBanHang> getAll();
    
    List<QLBanHang> getAllOrder();
    
    String add(QLBanHang q);
}
