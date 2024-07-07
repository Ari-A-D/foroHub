package com.alura.forohub.api.controller;

import com.alura.forohub.api.modelos.DatosRegistroUsuario;
import com.alura.forohub.api.modelos.Usuario;
import com.alura.forohub.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @PostMapping
    public void registraUsuario(@RequestBody DatosRegistroUsuario parametros){
        usuarioRepository.save(new Usuario(parametros));
    }
}
