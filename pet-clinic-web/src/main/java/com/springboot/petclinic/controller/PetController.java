package com.springboot.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pet")
public class PetController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String petHome(){

        return "/pet/index";
    }
}
