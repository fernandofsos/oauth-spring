package br.com.backend.pedido.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.pedido.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long >{
	
	public Optional<Usuario> findByUsuario(String usuario);
	
	public boolean existsByUsuario(String usuario);

}
