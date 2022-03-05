package br.com.backend.pedido.error;

public class UsuarioJaCadastradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioJaCadastradoException(String usuario) {
		super("Usuário já cadastrado para esse login" + " " + usuario);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
