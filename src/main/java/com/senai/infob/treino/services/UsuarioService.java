package com.senai.infob.treino.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.infob.treino.models.Usuario;
import com.senai.infob.treino.repositories.UsuarioRepository;

    @Service
    public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

        public String login(String email, String senha){
        Usuario usuario = usuarioRepository.findByemail(email);
        if(usuario != null && senha.equals(usuario.getSenha())) {
            return "Login efetuado com sucesso";

        }
        return "Falha ao realizar login";

    }
    
}
