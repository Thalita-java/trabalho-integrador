package com.senai.infob.treino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infob.treino.enums.Idioma;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Integer>{
    
}