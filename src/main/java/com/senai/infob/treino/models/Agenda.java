package com.senai.infob.treino.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tempo_diario")
    private LocalDate tempoDiario;

    @Column(name = "meta")
    private String meta;

    @Column(name = "prazo_entrega")
    private LocalDate prazoEntrega;

    public Agenda() {
    }

    public Agenda(Integer id, LocalDate tempoDiario, String meta, LocalDate prazoEntrega) {
        this.id = id;
        this.tempoDiario = tempoDiario;
        this.meta = meta;
        this.prazoEntrega = prazoEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getTempoDiario() {
        return tempoDiario;
    }

    public void setTempoDiario(LocalDate tempoDiario) {
        this.tempoDiario = tempoDiario;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public LocalDate getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(LocalDate prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    
    
}
