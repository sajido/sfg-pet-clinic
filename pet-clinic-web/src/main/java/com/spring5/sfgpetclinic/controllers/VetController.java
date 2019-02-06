package com.spring5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {

    @RequestMapping({"", "/","/index","/index.html"})
    public String vet(){

        return "vets/index";
    }
}
