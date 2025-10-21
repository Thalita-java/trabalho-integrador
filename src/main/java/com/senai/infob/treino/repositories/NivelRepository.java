package com.senai.infob.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.treino.models.Nivel;



@Repository
public interface NivelRepository extends JpaRepository<Nivel, Integer>{
    
}