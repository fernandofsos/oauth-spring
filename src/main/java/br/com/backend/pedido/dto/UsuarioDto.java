package br.com.backend.pedido.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

public class UsuarioDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter @Setter
	@NotEmpty(message="{campo.usuario.obrigatorio}")
	private String usuario;
	
	@Getter @Setter
	@NotBlank(message="{campo.senha.obrigatorio}")
    private String senha;

}
