package br.com.backend.pedido.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.backend.pedido.model.Fornecedor;

public interface FornecedorRepository extends PagingAndSortingRepository<Fornecedor, Long>  {

	public Fornecedor findByEmail(String email);
}
