package br.com.backend.pedido.repository.filter;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class FornecedorFilter {
		
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String cpf;
		
	@Getter @Setter
	private String cnpj;
	
	@Getter @Setter
	private String email;
	
	@Getter @Setter
	//@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dataCadastro;
	

}
