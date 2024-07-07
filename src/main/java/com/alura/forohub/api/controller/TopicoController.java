package com.alura.forohub.api.controller;


import com.alura.forohub.api.modelos.DatosListadoTopicos;
import com.alura.forohub.api.modelos.DatosTopico;
import com.alura.forohub.api.modelos.Topico;
import com.alura.forohub.api.repository.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    //REGISTRAR TOPICO
    @PostMapping
    public void registroTopico(@RequestBody DatosTopico parametros){
        topicoRepository.save(new Topico(parametros));
    }

    //MOSTRAR LISTA DE TOPICOS
    @GetMapping
    public Page<DatosListadoTopicos> listadoTopicos(Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListadoTopicos::new);
    }
    
    //ACTUALIZAR DATOS DEL TOPICO
    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosListadoTopicos datosActualizarTopico){
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.idtopico());
        topico.actualizarDatos(datosActualizarTopico);
    }

    //BORRAR TOPICO
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);
    }

}
