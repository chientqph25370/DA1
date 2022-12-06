/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.QLMenuRepository;
import Service.QLMenuService;
import ViewModel.QLMenuReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public class QLMenuImpl implements QLMenuService{
    private QLMenuRepository menu = new QLMenuRepository();
    @Override
    public List<QLMenuReponse> getall() {
        return menu.getAll();
    }

    @Override
    public String update(QLMenuReponse qlmenu, String maSP) {
        boolean update = menu.update(qlmenu, maSP);
        if(update){
            return "Sucessfully";
        } else{
            return "Failed!";
        }
    }
    
    }
    
    

