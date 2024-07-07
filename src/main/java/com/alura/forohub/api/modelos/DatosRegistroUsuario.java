package com.alura.forohub.api.modelos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String correo_electronico,
        String password,
        String autenticacion,
        Integer perfiles) {
}
