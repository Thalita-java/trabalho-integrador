package com.senai.infob.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.treino.models.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer>{
    
}
    

