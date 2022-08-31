package com.benjy.portalexamenesbackend;

import com.benjy.portalexamenesbackend.model.Rol;
import com.benjy.portalexamenesbackend.model.Usuario;
import com.benjy.portalexamenesbackend.model.UsuarioRol;
import com.benjy.portalexamenesbackend.repository.RolRepository;
import com.benjy.portalexamenesbackend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PortalExamenesBackendApplication implements CommandLineRunner {
	@Autowired
	private IUsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(PortalExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		/*Usuario u= new Usuario();
		u.setNombre("Benjy");
		u.setApellido("Fernandez");
		u.setEmail("b1@gmail.com");

		Rol r = new Rol();
		r.setId(1L);
		r.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles=new HashSet<>();

		UsuarioRol u1= new UsuarioRol();
		u1.setUsuario(u);
		u1.setRol(r);

		usuarioRoles.add(u1);

		Usuario uActualizado= usuarioService.guardarUsuario(u,usuarioRoles);
		System.out.println(uActualizado.getUsername());*/




	}
}
