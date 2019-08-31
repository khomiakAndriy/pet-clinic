package com.springboot.petclinic.controller;

import com.springboot.petclinic.service.PetOwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/petOwner")
public class PetOwnerController {

    private PetOwnerService petOwnerService;

    public PetOwnerController(PetOwnerService petOwnerService) {
        this.petOwnerService = petOwnerService;
    }

    @RequestMapping({"/", "", "index", "index.html"})
    public String petHome(Model model){

        model.addAttribute("owners", petOwnerService.findAll());
        return "/petOwner/index";
    }
}
