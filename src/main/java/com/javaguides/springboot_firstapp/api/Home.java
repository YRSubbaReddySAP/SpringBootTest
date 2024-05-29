package com.javaguides.springboot_firstapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
public class Home {

    //Default message will be printed when no path is specified... localhost:8080... below is called.
    @GetMapping
    public String home(){
        return "Application Works" + new Date();
    }
}
