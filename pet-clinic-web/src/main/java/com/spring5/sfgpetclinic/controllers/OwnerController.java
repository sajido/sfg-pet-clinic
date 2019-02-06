package com.spring5.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @RequestMapping({"", "/","/index","/index.html"})
    public String owner(){

        return "owners/index";
    }

}
