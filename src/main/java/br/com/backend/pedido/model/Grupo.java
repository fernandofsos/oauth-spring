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
@Table(name = "t_grupo", schema = "pedido")
@SequenceGenerator(name = "S_GRUPO", sequenceName = "S_GRUPO", allocationSize = 1, schema = "pedido")
public class Grupo {

	@Id
	@Getter	@Setter
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_GRUPO")
	@Column(name = "id_grupo")   
	private Long idGrupo;

	@Getter	@Setter
	@Column(name = "nome")
	private String nome;

	@Getter	@Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro")
	private Date dataCadastro;

	@Getter	@Setter
	@Column(name = "id_usuario_cad")
	private Long idUsuarioCad;

	@Getter	@Setter
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_desativacao")
	private Date dataDesativacao;
	
	@Getter	@Setter
	@Column(name = "id_usuario_desativa")
	private Long idUsuarioDesativa;

}
