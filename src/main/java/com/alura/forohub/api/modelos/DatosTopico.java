package com.alura.forohub.api.modelos;

import java.util.Date;

public record DatosTopico(Integer idtopico,
                          String mensaje,
                          String titulo,
                          Date fecha_creacion,
                          String status,
                          Integer curso,
                          String respuestas,
                          Integer autor
                          ) {
}
