package br.com.backend.pedido.dto;

import lombok.Getter;
import lombok.Setter;

public class PedidoItemDto {
	
	@Getter @Setter
	private Integer idPedidoItem;
	
	@Getter @Setter
	private Integer idProduto;
	
	@Getter @Setter
	private Integer idPedido;
	   

}
