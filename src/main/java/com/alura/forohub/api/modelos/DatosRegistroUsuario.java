package com.alura.forohub.api.modelos;

public record DatosRegistroUsuario(String nombre,
                                   String correo_electronico,
                                   String password,
                                   String autenticacion,
                                   Integer perfiles) {
}
