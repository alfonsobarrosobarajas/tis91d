package com.tis91d.services;

import com.tis91d.models.Servidor;
import com.tis91d.repository.CRUD;
import com.tis91d.repository.ServidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorService extends CRUD<Servidor, ServidorRepository> {

    public ServidorService(ServidorRepository repostory) {
        super(repostory);
    }

    @Override
    public List<Servidor> list() {
        return repository.findAll();
    }

    @Override
    public Servidor get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Servidor o) {
        repository.save(o);
    }

    @Override
    public void update(Servidor o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
