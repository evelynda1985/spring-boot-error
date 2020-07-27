package com.eveideascode.springboot.error.app.services;

import com.eveideascode.springboot.error.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private List<Usuario> lista;

    public UsuarioServiceImpl() {
        this.lista = new ArrayList<>();
        lista.add(new Usuario(1, "Eve", "Arzuela"));
        lista.add(new Usuario(2, "Sebastian", "Rodriguez"));
        lista.add(new Usuario(3, "Lucy", "Padilla"));
        lista.add(new Usuario(4, "Diana", "Delgado"));
        lista.add(new Usuario(5, "Ana", "Restrepo"));
        lista.add(new Usuario(6, "Maria", "Rosas"));
        lista.add(new Usuario(7, "Aleja", "Gamboa"));

    }

    @Override
    public List<Usuario> listar() {
        return lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        Usuario resultado = null;
        for(Usuario usuario: lista){
            //se usa equals porque se esta comparando objectos
            if(usuario.getId().equals(id)){
                resultado = usuario;
                break;
            }
        }
        return resultado;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        Usuario usuario = this.obtenerPorId(id);
        return Optional.ofNullable(usuario);
    }


}
