package com.senai.infob.treino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.treino.models.Responsavel;
import com.senai.infob.treino.repositories.ResponsavelRepository;



@Service
public class ResponsavelService {
    @Autowired
    private ResponsavelRepository responsavelRepository;


    public Responsavel salvar(Responsavel responsavel) {
        return responsavelRepository.save(responsavel);
    }

    public boolean delete(Integer id) {
    Responsavel responsavel = responsavelRepository.findById(id).get();
    if(responsavel != null) {
        responsavelRepository.deleteById(id);
        return true;
    }
    return false;
    }

    public List <Responsavel> listarResponsavel (){
    return responsavelRepository.findAll();
    }

}