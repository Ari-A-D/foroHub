package com.alura.forohub.api.modelos;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record DatosTopico(
        @NotBlank
        Integer idtopico,
        String mensaje,
        String titulo,
        Date fecha_creacion,
        String status,
        @NotBlank
        Integer curso,
        String respuestas,
        @NotBlank
        Integer autor
) {
}
