package com.senai.infob.treino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.treino.enums.Idioma;
import com.senai.infob.treino.repositories.IdiomaRepository;



@Service
public class IdiomaService {
    @Autowired
    private IdiomaRepository idiomaRepository;

    public Idioma salvar(Idioma idioma) {
        return idiomaRepository.save(idioma);
    }

    public boolean delete(Integer id) {
    Idioma idioma = idiomaRepository.findById(id).get();
    if(idioma != null) {
        idiomaRepository.deleteById(id);
        return true;
    }
    return false;
    }

    public List <Idioma> listarIdioma (){
    return idiomaRepository.findAll();
    }

}