package com.senai.infob.treino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.treino.models.Endereco;
import com.senai.infob.treino.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;


    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public boolean delete(Integer id) {
    Endereco endereco = enderecoRepository.findById(id).get();
    if(endereco != null) {
        enderecoRepository.deleteById(id);
        return true;
    }
    return false;
    }

    public List <Endereco> listarEndereco (){
    return enderecoRepository.findAll();
    }


}
