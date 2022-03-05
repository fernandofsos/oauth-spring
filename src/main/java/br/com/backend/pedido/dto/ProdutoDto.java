package br.com.backend.pedido.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.backend.pedido.model.Grupo;
import lombok.Getter;
import lombok.Setter;

public class ProdutoDto {
	
	
	@Getter @Setter
	private Long idProduto;
	
	@Getter @Setter
	private Long codProduto;
	
	@Getter @Setter
	private String nome;
	 
	@Getter @Setter
	private String nomeApresentacao;

	@Getter @Setter
	private String unidadeMedida;

	@Getter @Setter
	private Long idGrupo;
	
	@Getter @Setter
	private Grupo grupo;
	
	@Getter @Setter
	private BigDecimal valor;

	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	@Getter @Setter
	private Long idUsuarioCad; 

	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDesativacao;
	
	@Getter @Setter
	private Long idUsuarioDesativacao; 


}
