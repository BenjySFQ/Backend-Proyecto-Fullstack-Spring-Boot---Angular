package com.benjy.portalexamenesbackend.controller;

import com.benjy.portalexamenesbackend.model.Rol;
import com.benjy.portalexamenesbackend.model.Usuario;
import com.benjy.portalexamenesbackend.model.UsuarioRol;
import com.benjy.portalexamenesbackend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{

//        usuario.setPerfil("default.png");
        Set<UsuarioRol> roles= new HashSet<>();

        Rol rol =new Rol();
        rol.setId(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol=new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
        return usuarioService.guardarUsuario(usuario,roles);
    }
    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable ("username" )String username) throws Exception{

        return usuarioService.obtenerUsuario(username);

    }
    @DeleteMapping("/{id}")
    public  void  eliminarUsuarios(@PathVariable("id") Long id) throws Exception{
        usuarioService.eliminarUsuario(id);

    }

    @GetMapping
    public List<Usuario>  listarUsuarios() throws Exception{
        return usuarioService.listarUsuarios();

    }

}
