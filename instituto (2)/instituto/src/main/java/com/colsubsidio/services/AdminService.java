/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.colsubsidio.services;

import com.colsubsidio.entities.Admin;
import com.colsubsidio.repositories.AdminRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Arboleda
 */
@Service
public class AdminService {
   @Autowired
    AdminRepository adminRepository;
    
   public  Iterable<Admin> findAll() {
        return adminRepository.findAll();
    }

     public List<Admin> findAll1() {
        Iterable<Admin> it = adminRepository.findAll();
        ArrayList<Admin> admin = new ArrayList<Admin>();
        it.forEach(e -> admin.add(e));
        return admin;
    }
    public Optional<Admin>  findById(Integer id_Admin) {
        return adminRepository.findById(id_Admin);
    }
    public void save(Admin admin) {
        adminRepository.save(admin);
    }
    
     public void borrarPorId(Integer id_Admin){
        adminRepository.deleteById(id_Admin);
     }
}


