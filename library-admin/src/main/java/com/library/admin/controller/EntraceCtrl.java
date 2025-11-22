package com.library.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class EntraceCtrl {
    private static final Logger log = LogManager.getLogger(EntraceCtrl.class);

    @RequestMapping("/admin/entrace")
    public String test() {
        System.out.println("Library Admin !!");
        log.info("Library Admin !!");
        log.error("TEST Error - Library Admin !!");
        return "Library Admin !!";
    }

}
