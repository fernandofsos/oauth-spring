package br.com.backend.pedido.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

public class ClienteDto {
	
	@Getter @Setter
	private Long idCliente;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String cnpj;
		
	@Getter @Setter
	private String cpf;
	
	@Getter @Setter
	private String endereco;
	
	@Getter @Setter
	private String numero;
	
	@Getter @Setter
	private String complemento;
	
	@Getter @Setter
	private String email;

	@Getter @Setter
	private String celular;

	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

}
