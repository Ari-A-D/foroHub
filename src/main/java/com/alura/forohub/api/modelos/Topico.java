package com.alura.forohub.api.modelos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "topico")
@Entity(name = "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idtopico;
    @Column(name = "mensaje")
    private String mensaje;
    @Column(name = "titulo")
    private String titulo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;
    @Column(name = "status")
    private String status;
    @Column(name = "curso")
    private Integer curso;
    @Column(name = "respuestas")
    private String respuestas;
    @Column(name = "autor")
    private Integer autor;


    public Topico(DatosTopico datosTopico) {
        this.mensaje = datosTopico.mensaje();
        this.titulo = datosTopico.titulo();
        this.fecha_creacion = datosTopico.fecha_creacion();
        this.status = datosTopico.status();
        this.curso = datosTopico.curso();
        this.respuestas = datosTopico.respuestas();
        this.autor = datosTopico.autor();
    }
}
