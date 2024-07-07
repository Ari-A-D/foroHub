package com.alura.forohub.api.controller;


import com.alura.forohub.api.modelos.DatosTopico;
import com.alura.forohub.api.modelos.Topico;
import com.alura.forohub.api.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void registroTopico(@RequestBody DatosTopico parametros){
        topicoRepository.save(new Topico(parametros));
    }
    
}
