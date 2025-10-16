package com.senai.infob.treino.models;

import java.util.List;
import java.util.Set;

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
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinTable(
        name = "usuario_responsavel",
        joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "responsavel_id", referencedColumnName = "id")
        )
        private Set<Responsavel> responsavel;


    @ManyToMany
    @JoinTable(
        name = "usuario_nivel",
        joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "nivel_id", referencedColumnName = "id")

    )
    private List<Nivel>nivel;

    @OneToOne
    @JoinColumn(name = "agenda_id", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name="idioma")
    private Idioma idioma;

    public Usuario() {
    }


    public Usuario(Integer id, String nome, String idade, String emailResponsavel, String senha,
            Set<Responsavel> responsavel, List<Nivel> nivel, Usuario usuario, Idioma idioma) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.emailResponsavel = emailResponsavel;
        this.senha = senha;
        this.responsavel = responsavel;
        this.nivel = nivel;
        this.usuario = usuario;
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


    public Set<Responsavel> getResponsavel() {
        return responsavel;
    }


    public void setResponsavel(Set<Responsavel> responsavel) {
        this.responsavel = responsavel;
    }


    public List<Nivel> getNivel() {
        return nivel;
    }


    public void setNivel(List<Nivel> nivel) {
        this.nivel = nivel;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Idioma getIdioma() {
        return idioma;
    }


    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    
    
    
    }


    

