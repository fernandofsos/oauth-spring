package br.com.backend.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.pedido.model.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Long>  {

	public Grupo findByNome(String nome);

}
