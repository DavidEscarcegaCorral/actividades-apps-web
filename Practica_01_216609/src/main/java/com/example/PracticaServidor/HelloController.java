package com.example.PracticaServidor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hola")
    public String hello() {
        return "hola desde el controlador springboot";
    }

    // Saludo de la api
    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre) {
        return "Hola " + nombre + " este es mi nuevo servidor bro";
    }

    // Metodo post
    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje) {
        return "Recibir tu mensaje" + mensaje;
    }

}
