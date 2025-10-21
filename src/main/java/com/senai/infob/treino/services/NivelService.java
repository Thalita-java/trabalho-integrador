package com.senai.infob.treino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.treino.models.Nivel;
import com.senai.infob.treino.repositories.NivelRepository;

@Service
public class NivelService {
    @Autowired
    private NivelRepository nivelRepository;



    public Nivel salvar(Nivel nivel) {
        return nivelRepository.save(nivel);
    }

    public boolean delete(Integer id) {
    Nivel nivel = nivelRepository.findById(id).get();
    if(nivel != null) {
        nivelRepository.deleteById(id);
        return true;
    }
    return false;
    }


    public List <Nivel> listarNivel (){
    return nivelRepository.findAll();
    }

  
}