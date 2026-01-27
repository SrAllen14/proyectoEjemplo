package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@SpringBootApplication
@Controller
public class ProyectoEjemploApplication {
    public static void main(String[] args) {
            SpringApplication.run(ProyectoEjemploApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "world")String name, Model model){
        // El model sirve para pasar información a la vista.
        model.addAttribute("nombre", name);
        
        return "bienvenida";
    }
}