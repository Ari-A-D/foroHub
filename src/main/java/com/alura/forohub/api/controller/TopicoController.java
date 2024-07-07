package com.alura.forohub.api.controller;


import com.alura.forohub.api.modelos.DatosTopico;
import com.alura.forohub.api.modelos.Topico;
import com.alura.forohub.api.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void registroTopico(@RequestBody DatosTopico parametros){
        topicoRepository.save(new Topico(parametros));
    }
    @GetMapping
    public List<Topico> listadoTopicos(){
        return topicoRepository.findAll();
    }
}
