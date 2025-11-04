package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Página principal
    @RequestMapping("/")
    public String home() {
        System.out.println("Hola");
        return "Hola Gael";
    }

    // Métodos NO RESTful
    @RequestMapping("/altas")
    public String altas() {
        return "altas";
    }

    @RequestMapping("/bajas")
    public String bajas() {
        return "bajas";
    }

    @RequestMapping("/cambios")
    public String cambios() {
        return "cambios";
    }

    @RequestMapping("/consultas")
    public String consultas() {
        return "consultas";
    }

    // Métodos RESTful correctos
    @RequestMapping(value = "/sistema", method = RequestMethod.POST)
    public String altasREST() {
        return "alta REST";
    }

    @RequestMapping(value = "/sistema", method = RequestMethod.DELETE)
    public String bajasREST() {
        return "baja REST";
    }

    @RequestMapping(value = "/sistema", method = RequestMethod.PUT)
    public String cambiosREST() {
        return "cambio REST";
    }

    @RequestMapping(value = "/sistema", method = RequestMethod.GET)
    public String consultasREST() {
        return "consulta REST";
    }
}
