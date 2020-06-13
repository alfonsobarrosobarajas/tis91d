package com.tis91d.restcontrollers;

import com.tis91d.models.Contacto;
import com.tis91d.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoRestController {

    @Autowired
    ContactoService servicio;

    @CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/list")
    public List<Contacto> list(){
        return servicio.list();
    }


}
