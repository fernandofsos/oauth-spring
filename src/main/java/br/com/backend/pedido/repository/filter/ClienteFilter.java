package br.com.backend.pedido.repository.filter;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class ClienteFilter {
		
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String cpf;
		
	@Getter @Setter
	private String cnpj;
	
	@Getter @Setter
	private Date dataCadastro;
	

}
