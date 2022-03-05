package br.com.backend.pedido.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.backend.pedido.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	@Query("SELECT p FROM Produto p JOIN p.grupo g")
	public List<Produto> findByProdutoInnerGrupo();		
}
