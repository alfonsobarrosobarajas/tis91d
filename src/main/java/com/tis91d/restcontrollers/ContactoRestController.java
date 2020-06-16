package com.tis91d.restcontrollers;

import com.tis91d.models.Contacto;
import com.tis91d.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoRestController {

    @Autowired
    ContactoService servicio;

    // Anotación para permitir acceso a "orígenes cruzados"
    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/list")
    public List<Contacto> list(){
        return servicio.list();
    }


    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/add")
    public void add(@RequestBody Contacto contacto){
        servicio.add(contacto);
    }



}
