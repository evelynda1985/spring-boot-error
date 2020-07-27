package com.eveideascode.springboot.error.app.errors;


public class UsuarioNoEncontrarioException extends RuntimeException{

    public UsuarioNoEncontrarioException(String id) {
        super("Usuario con id: ".concat(id).concat(" No existe en el sistema"));
    }
}
