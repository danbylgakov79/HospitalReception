package com.JavaSite.JavaSite.controller;

import com.JavaSite.JavaSite.entity.User;
import com.JavaSite.JavaSite.service.AppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;

@Controller
public class UserController {
    private EntityManager em;
    @Autowired
    private  AppointmentsService appointmentsService;
    @GetMapping("/userAppoint")
    public String userList( Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer patientID1 = user.getPatientID();
        model.addAttribute("findAllByPatientID", appointmentsService.findAllByPatientID(patientID1));


        return "userAppoint";
    }
}
