package com.alura.forohub.api.modelos;

public record DatosRegistroUsuario(String nombre,
                                   String correoElectronico,
                                   String password,
                                   String autenticacion,
                                   Integer perfiles) {
}
