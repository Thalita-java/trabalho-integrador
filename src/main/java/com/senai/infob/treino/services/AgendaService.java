package com.senai.infob.treino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infob.treino.models.Agenda;
import com.senai.infob.treino.repositories.AgendaRepository;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository agendaRepository;

 

    public Agenda salvar(Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    public boolean delete(Integer id) {
    Agenda agenda = agendaRepository.findById(id).get();
    if(agenda != null) {
        agendaRepository.deleteById(id);
        return true;
    }
    return false;
    }


    public List <Agenda> listarAgenda (){
    return agendaRepository.findAll();
    }

  
}
