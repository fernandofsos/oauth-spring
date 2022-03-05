package br.com.backend.pedido.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

public class PedidoDto {
	
	
	@Getter @Setter
	private Integer idPedido;
	
	@Getter @Setter
	private Integer idCliente;
	
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	  
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataProntoPronto;
	
	@Getter @Setter
	private Integer idUsuarioPronto;
		
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCancelada;
	  
	@Getter @Setter
	private Integer idsuarioCancelada;
	 	 

}
