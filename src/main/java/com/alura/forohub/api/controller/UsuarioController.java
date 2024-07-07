package com.alura.forohub.api.controller;

import com.alura.forohub.api.modelos.DatosRegistroUsuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UsuarioController {
    @PostMapping
    public void registraUsuario(@RequestBody DatosRegistroUsuario parametros){
        System.out.println(parametros);
    }
}
