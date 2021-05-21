package com.dosage.skyvault05.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RactTestController {
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/react/test")
    public String test(){
        return "testestsetsetsetsteststes";
    }
    @GetMapping("/react/test2")
    public String test2(){
        return "testestestse222";
    }
}
