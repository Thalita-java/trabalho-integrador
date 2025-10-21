package com.senai.infob.treino.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.senai.infob.treino.models.Nivel;
import com.senai.infob.treino.services.NivelService;


@RestControllerAdvice
@RequestMapping("/nivel")
public class NivelController {
    
    @Autowired
    private NivelService nivelService;

    @PostMapping ("/salvar")
    public Nivel salvar(@RequestBody Nivel nivel){
        return nivelService.salvar(nivel);
    }
    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = nivelService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }
    
    @GetMapping ("/listar")
    public List<Nivel>listarNivel(){
        return nivelService.listarNivel();
    }
 
  
}