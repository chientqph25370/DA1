/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repository.DangNhapRepository;
import Service.DangNhapService;
import ViewModel.DangNhapResponse;

/**
 *
 * @author hp
 */
public class DangNhapImpl implements DangNhapService{
      DangNhapRepository dnn = new DangNhapRepository();
    @Override
    public DangNhapResponse login(String user, String pass) {
        return dnn.login(user, pass);
    }
    
}
