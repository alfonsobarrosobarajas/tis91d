package com.tis91d.services;

import com.tis91d.models.Contacto;
import com.tis91d.repository.CRUD;
import com.tis91d.repository.ContactoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService extends CRUD<Contacto, ContactoRepository> {


    public ContactoService(ContactoRepository repostory) {
        super(repostory);
    }

    @Override
    public List<Contacto> list() {
        return repository.findAll();
    }

    @Override
    public Contacto get(int id) {
        return null;
    }

    @Override
    public void add(Contacto o) {

    }

    @Override
    public void update(Contacto o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
