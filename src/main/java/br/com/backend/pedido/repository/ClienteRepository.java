package br.com.backend.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.pedido.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Cliente findByEmail(String email);
		

}
