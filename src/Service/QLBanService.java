/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLBanReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public interface QLBanService {
    List<QLBanReponse> getall();
        
     public String add(QLBanReponse br);   
     public String update(QLBanReponse br);   
     public String delete(QLBanReponse br);   
    
}
