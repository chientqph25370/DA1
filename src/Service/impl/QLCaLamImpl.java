/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLCaLamRepository;
import Service.QLBanService;
import Service.QLCaLamService;
import ViewModel.QLBanReponse;
import ViewModel.QLCaLamReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class QLCaLamImpl implements QLCaLamService {
    QLCaLamRepository getall = new QLCaLamRepository();

    @Override
    public List<QLCaLamReponse> getall() {
    return getall.getall();
    }

    @Override
    public String add(QLCaLamReponse ql) {
    if(getall.add(ql)){
        return "them thanh cong";
    }
    return " them ko thanh cong";
    }

    @Override
    public String update(QLCaLamReponse ql) {
           if(getall.update(ql)){
        return "sua thanh cong";
    }
    return " sua ko thanh cong";
    }

    @Override
    public String delete(QLCaLamReponse ql) {
        if(getall.delete(ql)){
        return "xoa thanh cong";
    }
    return " xoa ko thanh cong";
    
    }

     
   
    
    
    
    
    
    
    
}
