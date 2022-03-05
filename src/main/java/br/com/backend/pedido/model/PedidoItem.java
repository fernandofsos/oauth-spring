//package br.com.backend.pedido.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "t_pedido_item",  schema = "pedido")
//@SequenceGenerator(name = "S_PEDIDO_ITEM", sequenceName = "S_PEDIDO_ITEM", allocationSize = 1)
//public class PedidoItem {
//
//	
//	@Id
//	@Getter @Setter
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PEDIDO_ITEM")
//	@Column(name = "id_pedido_item")
//	private Integer idPedidoItem;
//	
//	@Getter @Setter
//	@Column(name = "id_produto")
//	private Integer idProduto;
//	
//	@Getter @Setter
//	@Column(name = "id_pedido")
//	private Integer idPedido;
//	
//}
