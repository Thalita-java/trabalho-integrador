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

import com.senai.infob.treino.enums.Idioma;
import com.senai.infob.treino.services.IdiomaService;



@RestControllerAdvice
@RequestMapping("/idioma")
public class IdiomaController {

    @Autowired
    private IdiomaService idiomaService;

   
    @PostMapping ("/salvar")
    public Idioma salvar(@RequestBody Idioma idioma){
        return idiomaService.salvar(idioma);
    }
    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = idiomaService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }
    @GetMapping ("/listar")
    public List<Idioma>listarIdioma(){
        return idiomaService.listarIdioma();
    }
 

}