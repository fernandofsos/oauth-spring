package br.com.backend.pedido.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="t_usuario", schema = "seguranca")
@SequenceGenerator(name = "s_usuario", sequenceName = "s_usuario", allocationSize = 1, schema = "seguranca")
public class Usuario {
	
	
	@Id
	@Getter @Setter
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_usuario")
	@Column(name = "id")                               
	private Long id;
	
	@Getter @Setter
	@Column( unique=true,name = "usuario")
	private String usuario;
	
	@Getter @Setter
	@Column(name = "senha")
	private String senha;

}
