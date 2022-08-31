package com.benjy.portalexamenesbackend.service.impl;

import com.benjy.portalexamenesbackend.model.Usuario;
import com.benjy.portalexamenesbackend.model.UsuarioRol;
import com.benjy.portalexamenesbackend.repository.RolRepository;
import com.benjy.portalexamenesbackend.repository.UsuarioRepository;
import com.benjy.portalexamenesbackend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;


    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuariosRoles) throws Exception {

        Usuario usuarioLocal= usuarioRepository.findByUsername(usuario.getUsername());
         if (usuarioLocal!=null){
             System.out.println("El usuario ya existe");
             throw new Exception("El usuario ya esta presente");
         }
         else{
             for (UsuarioRol usuarioRol: usuariosRoles){
                 rolRepository.save(usuarioRol.getRol());
             }

             usuario.getUsuarioRoles().addAll(usuariosRoles);
             usuarioLocal=usuarioRepository.save(usuario);
         }

        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username)throws Exception {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long id)throws Exception {

        usuarioRepository.deleteById(id);

    }

    @Override
    public List<Usuario> listarUsuarios() throws Exception {
        return usuarioRepository.findAll();
    }
}
