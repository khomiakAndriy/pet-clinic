package com.springboot.petclinic.controller;

import com.springboot.petclinic.service.VetDoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vetDoctor")
public class VetDoctorController {

    private VetDoctorService vetDoctorService;

    public VetDoctorController(VetDoctorService vetDoctorService) {
        this.vetDoctorService = vetDoctorService;
    }

    @RequestMapping({"/", "", "index", "index.html"})
    public String petHome(Model model){

        model.addAttribute("vetDoctors", vetDoctorService.findAll());

        return "/vetDoctor/index";
    }
}
