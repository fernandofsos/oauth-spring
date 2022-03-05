package br.com.backend.pedido.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import lombok.Getter;
import lombok.Setter;

public class GrupoDto {
	
	
	@Getter @Setter
	private Long idGrupo;
	

	@Getter @Setter
	@NotNull
	@NotEmpty
	private String nome;
	
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Getter @Setter
	@NotNull
	private Long idUsuarioCad;
	 
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDesativacao;
	
	@Getter @Setter
	private Long idUsuarioDesativa;
	

}
