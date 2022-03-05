//package br.com.backend.pedido.model;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "t_pedido",  schema = "pedido")
//@SequenceGenerator(name = "S_PEDIDO", sequenceName = "S_PEDIDO", allocationSize = 1)
//public class Pedido {
//	
//	
//	@Id
//	@Getter @Setter
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PEDIDO")
//	@Column(name = "id_pedido")
//	private Integer idPedido;
//	
//	@Getter @Setter
//	@Column(name = "id_cliente")
//	private Integer idCliente;
//
//	@Getter @Setter
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "data_cadastro")
//	private Date dataCadastro;
//	 
//	@Getter @Setter
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "data_pronto")
//	private Date dataPronto; 
//		
//	@Getter @Setter
//	@Column(name = "id_usuario_pronto")
//	private Integer idUsuarioPronto;
//	
//	@Getter @Setter
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "data_cancelada")
//	private Date dataCancelada; 
//
//	@Getter @Setter
//	@Column(name = "id_usuario_cancelada")
//	private Integer idUsuarioCancelada;
//	  
//	 
//}
