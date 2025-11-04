package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")

@RestController
public class SaludarControlador {

    Saludador persona;

    @GetMapping("/")
    public String home() {
        return "Bienvenido a la app de mi pequeño Sarmiento 🌟";
    }

    @GetMapping("/saludar")
    public String saludarDefault() {
        return "Hola desconocido";
    }

    @GetMapping("/saludar/{nombre}")
    public String saludarConNombre(@PathVariable String nombre) {
        return "Hola " + nombre;
    }

    @GetMapping("/saludar2")
    public Saludador mostrar() {
        return new Saludador("xxx");
    }

    @GetMapping("/saludarget")
    public Saludador saludarGet() {
        return this.persona;
    }

    @PostMapping("/saludarpost")
    public void saludarPost(@RequestBody Saludador s) {
        System.out.println(s);
        this.persona = s;
    }

    @GetMapping("/query")
    public void metodo(@RequestParam String nombre) {
        System.out.println(nombre);
    }

    @GetMapping("/backend")
    public String backend(@RequestParam String nombre, @RequestParam String password) {
        System.out.println("resultado---- nombre: " + nombre + " password: " + password);
        return "Éxito";
    }
}
