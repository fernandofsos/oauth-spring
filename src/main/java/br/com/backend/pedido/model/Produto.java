package br.com.backend.pedido.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "t_produto",  schema = "pedido")
@SequenceGenerator(name = "S_PRODUTO", sequenceName = "S_PRODUTO", allocationSize = 1,schema = "pedido")
public class Produto {
		
	@Id
	@Getter @Setter
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_PRODUTO" )
	@Column(name = "id_produto")
	private Long idProduto;
	
	@Getter @Setter
	@Column(name = "cod_produto")
	private Long codProduto;

	@Getter @Setter
	@Column(name = "nome")
	private String nome;
	
	@Getter @Setter
	@Column(name = "nome_apresentacao")
	private String nomeApresentacao;
	
	@Getter @Setter
	@Column(name = "unidade_medida")
	private String unidadeMedida;
	
	@Getter @Setter
	@Column(name = "id_grupo")
	private Long idGrupo;
	
	@Getter @Setter
	@ManyToOne
	@JoinColumn(name = "id_grupo", referencedColumnName = "id_grupo",  insertable=false, updatable=false)
	private Grupo grupo = new Grupo();
	
	@Getter @Setter
	@Column(name = "valor")
	private BigDecimal valor;
	  
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;
	
	@Getter @Setter
	@Column(name = "id_usuario_cad")
	private Long idUsuarioCad; 
	
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_desativacao")
	private Date dataDesativacao;
	
	@Getter @Setter
	@Column(name = "id_usuario_desativacao")
	private Long idUsuarioDesativacao; 
	

}
