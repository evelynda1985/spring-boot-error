package com.eveideascode.springboot.error.app.models.domain;

import lombok.Getter;
import lombok.Setter;

public class Usuario {

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellido;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
