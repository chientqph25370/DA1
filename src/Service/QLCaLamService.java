/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import ViewModel.QLCaLamReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public interface QLCaLamService {
    List<QLCaLamReponse> getall();
    
    public String add(QLCaLamReponse ql);
    public String update(QLCaLamReponse ql);   
     public String delete(QLCaLamReponse ql); 
    
}
