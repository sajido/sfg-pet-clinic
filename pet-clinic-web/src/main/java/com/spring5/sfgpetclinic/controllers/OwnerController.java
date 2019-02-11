package com.spring5.sfgpetclinic.controllers;

import com.spring5.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/","/index","/index.html"})
    public String owner(Model model){

        model.addAttribute("owners", ownerService.findById(1L));

        return "owners/index";
    }

}
