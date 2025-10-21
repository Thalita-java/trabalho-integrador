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

import com.senai.infob.treino.models.Responsavel;
import com.senai.infob.treino.services.ResponsavelService;


@RestControllerAdvice
@RequestMapping("/responsavel")
public class ResponsavelController {    
    @Autowired
    private ResponsavelService responsavelService;


    @PostMapping ("/salvar")
    public Responsavel salvar(@RequestBody Responsavel responsavel){
        return responsavelService.salvar(responsavel);
    }
    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = responsavelService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }
    @GetMapping ("/listar")
    public List<Responsavel>listarResponsavel(){
        return responsavelService.listarResponsavel();
    }
 
}