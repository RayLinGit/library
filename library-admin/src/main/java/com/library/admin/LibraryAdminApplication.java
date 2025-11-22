package com.library.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.library.*"})
public class LibraryAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryAdminApplication.class, args);
    }

}
