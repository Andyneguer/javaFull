package com.colsubsidio.controller;

import com.colsubsidio.entities.Admin;
import com.colsubsidio.services.AdminService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/admin")
    public @ResponseBody
    Iterable<Admin> finddAll() {
        return adminService.findAll1();
    }

    @PostMapping("/admin")
    public void save(@RequestBody Admin admin) {
        adminService.save(admin);
    }
 @RequestMapping("/personas/{id_Admin}")
    public Optional<Admin> findById(@PathVariable Integer id_Admin){
        System.out.println(id_Admin);
        return adminService.findById(id_Admin);
    }
    
}
