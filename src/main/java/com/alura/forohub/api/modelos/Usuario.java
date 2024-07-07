package com.alura.forohub.api.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "usuarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo_electronico")
    private String correo_electronico;
    @Column(name = "password")
    private String password;
    @Column(name = "autenticacion")
    private String autenticacion;
    @Column(name = "perfiles")
    private Integer perfiles;

    public Usuario(DatosRegistroUsuario datosRegistroUsuario) {
        this.nombre = datosRegistroUsuario.nombre();
        this.correo_electronico = datosRegistroUsuario.correo_electronico();
        this.password = datosRegistroUsuario.password();
        this.autenticacion = datosRegistroUsuario.autenticacion();
        this.perfiles = datosRegistroUsuario.perfiles();
    }
}
