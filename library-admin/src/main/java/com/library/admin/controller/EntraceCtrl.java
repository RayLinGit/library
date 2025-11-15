package com.library.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntraceCtrl {

    @RequestMapping("/admin/entrace")
    public String test() {
        System.out.println("Library Admin !!");
        return "Library Admin !!";
    }

}
