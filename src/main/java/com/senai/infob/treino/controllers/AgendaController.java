package com.senai.infob.treino.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infob.treino.models.Agenda;
import com.senai.infob.treino.services.AgendaService;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping ("/salvar")
    public Agenda salvar(@RequestBody Agenda agenda){
        return agendaService.salvar(agenda);
    }
    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Integer id) {
        boolean deletou = agendaService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }
    @GetMapping ("/listar")
    public List<Agenda>listarAgenda(){
        return agendaService.listarAgenda();
    }
}