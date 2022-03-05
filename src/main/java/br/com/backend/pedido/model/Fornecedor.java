package br.com.backend.pedido.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="t_fornecedor", schema = "pedido")
@SequenceGenerator(name = "s_fornecedor", sequenceName = "s_fornecedor", allocationSize = 1, schema = "pedido")
public class Fornecedor {

	@Id
	@Getter @Setter
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_fornecedor")
	@Column(name = "id_fornecedor")                               
	private Long idFornecedor;
	
	@Getter @Setter
	@Column(name = "nome")
	private String nome;
	
	@Getter @Setter
	@Column(name = "cnpj")
	private String cnpj;
	
	@Getter @Setter
	@Column(name = "cpf")
	private String cpf;
	
	@Getter @Setter
	@Column(name = "endereco")
	private String endereco;
	
	@Getter @Setter
	@Column(name = "numero")
	private String numero;
	
	@Getter @Setter
	@Column(name = "complemento")
	private String complemento;
	
	@Getter @Setter
	@Column(name = "email")
	private String email;

	@Getter @Setter
	@Column(name = "celular")
	private String celular;
	 
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;
 	
}
