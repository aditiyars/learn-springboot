package com.aditiya_corp.pong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aditiya_corp.pong.*;

@RestController
public class Controller {
    @GetMapping("/ping")
    public ObjekPong method(){
        ObjekPong t = new ObjekPong("pong");
        return t; 
    }

    @GetMapping("/helloworld")
    public String a(){
        return "Hello World";
    }

    @GetMapping("/brumm")
    public Car toyota(){
        Car innova = new Car("innova");
        innova.setWarna("hitam");
        innova.setTipe("minibus");
        innova.setJmlhBan(4);
        innova.setPanjang(4.7f);
        innova.setLebar(1.8f);
        return innova;
    }
}
