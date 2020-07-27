package com.eveideascode.springboot.error.app.controllers;

import com.eveideascode.springboot.error.app.errors.UsuarioNoEncontrarioException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

//Anotacion para el manejo de errores
@ControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler(ArithmeticException.class)
    public String aritmeticaError(ArithmeticException e, Model model){
        model.addAttribute("error", "Error de aritmetica");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
//        return "error/aritmetica";
        return "error/generica";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatError(NumberFormatException e, Model model){
        model.addAttribute("error", "Error: Formato del numero invalido!");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
//        return "error/number-format";
        return "error/generica";
    }

    @ExceptionHandler(UsuarioNoEncontrarioException.class)
    public String usuarioNoEncontrarioException(UsuarioNoEncontrarioException e, Model model){
        model.addAttribute("error", "Error: Usuario no encontrado!");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/usuario";
    }

}
