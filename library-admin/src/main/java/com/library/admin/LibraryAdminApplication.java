package com.library.admin;

//import cn.xuyanwu.spring.file.storage.spring.EnableFileStorage;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.library.*"})
//@MapperScan("com.library.**.mapper")
//@EnableFileStorage
public class LibraryAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryAdminApplication.class, args);
    }

}
