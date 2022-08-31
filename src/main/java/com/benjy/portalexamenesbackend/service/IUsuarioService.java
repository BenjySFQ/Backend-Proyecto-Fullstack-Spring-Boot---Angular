package com.benjy.portalexamenesbackend.service;

import com.benjy.portalexamenesbackend.model.Rol;
import com.benjy.portalexamenesbackend.model.Usuario;
import com.benjy.portalexamenesbackend.model.UsuarioRol;

import java.util.List;
import java.util.Set;

public interface IUsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuariosRoles) throws Exception;

    public Usuario obtenerUsuario(String username) throws Exception;

    public void eliminarUsuario(Long id)throws Exception;
    public List<Usuario> listarUsuarios() throws Exception;


}
