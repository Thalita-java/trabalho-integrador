package com.senai.infob.treino.models;

import java.util.List;


import com.senai.infob.treino.enums.Idioma;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private String idade;

    @Column(name = "email_responsavel")
    private String emailResponsavel;

    @Column(name = "senha")
    private String senha;

    @OneToMany
    @JoinTable(
        name = "usuario_responsavel",
        joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "responsavel_id", referencedColumnName = "id")
        )
        private List<Responsavel> responsavel;


    @ManyToMany
    @JoinTable(
        name = "usuario_nivel",
        joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "nivel_id", referencedColumnName = "id")

    )
    private List<Nivel>nivel;

    @OneToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private Agenda agenda;

    @Enumerated(EnumType.STRING)
    @Column(name="idioma")
    private Idioma idioma;

    public Usuario() {
    }


    public Usuario(Integer id, String nome, String idade, String emailResponsavel, String senha,
            List<Responsavel> responsavel, List<Nivel> nivel, Agenda agenda, Idioma idioma) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.emailResponsavel = emailResponsavel;
        this.senha = senha;
        this.responsavel = responsavel;
        this.nivel = nivel;
        this.agenda = agenda;
        this.idioma = idioma;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdade() {
        return idade;
    }


    public void setIdade(String idade) {
        this.idade = idade;
    }


    public String getEmailResponsavel() {
        return emailResponsavel;
    }


    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public List<Responsavel> getResponsavel() {
        return responsavel;
    }


    public void setResponsavel(List<Responsavel> responsavel) {
        this.responsavel = responsavel;
    }


    public List<Nivel> getNivel() {
        return nivel;
    }


    public void setNivel(List<Nivel> nivel) {
        this.nivel = nivel;
    }


    public Agenda getAgenda() {
        return agenda;
    }


    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }


    public Idioma getIdioma() {
        return idioma;
    }


    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    
    
    
    }


    

