package com.alura.forohub.api.modelos;

import java.util.Date;

public record DatosTopico(Integer idtopico,
                          String mensaje,
                          String nombreCurso,
                          String titulo,
                          Date fechaCreacion,
                          String status,
                          Integer curso,
                          String respuesta,
                          Integer autor
                          ) {
}
