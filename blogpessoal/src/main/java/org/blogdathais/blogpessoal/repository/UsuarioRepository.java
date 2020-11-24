package org.blogdathais.blogpessoal.repository;

import java.util.Optional;

import org.blogdathais.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	public Optional<Usuario> findByUsuario(String usuario);
}
