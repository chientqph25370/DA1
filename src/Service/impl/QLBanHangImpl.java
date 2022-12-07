/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLBanHangRepository;
import ViewModel.QLBanHang;
import java.util.List;
import Service.QLBanHangService;

/**
 *
 * @author admin
 */
public class QLBanHangImpl implements QLBanHangService{
    
    QLBanHangRepository ql = new QLBanHangRepository();
    
    @Override
    public List<QLBanHang> getAll() {
        return ql.getAllMenu();
    }

    @Override
    public List<QLBanHang> getAllOrder() {
        return ql.getAllOrder();
    }

    
    
    @Override
    public String add(QLBanHang q) {
        boolean add = ql.add(q);
        if(add){
            return "Add thành công";
        }else{
            return "Add thất bại";
        }
    }
    
}
