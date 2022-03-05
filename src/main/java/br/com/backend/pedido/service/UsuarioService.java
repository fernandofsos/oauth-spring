package br.com.backend.pedido.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.backend.pedido.dto.UsuarioDto;
import br.com.backend.pedido.error.UsuarioJaCadastradoException;
import br.com.backend.pedido.model.Usuario;
import br.com.backend.pedido.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	public UsuarioDto salvar(UsuarioDto usuarioDto) {
		Usuario usuario = new Usuario();
		BeanUtils.copyProperties(usuarioDto, usuario);
				
		System.out.println(usuario);
		
		boolean exists = usuarioRepository.existsByUsuario(usuario.getUsuario());
//		int x = 0;
//		int y = 10;
//		
//		int h = y/x;
	
		if(exists) {
			throw new UsuarioJaCadastradoException(usuario.getUsuario());
		}
		
		usuario = usuarioRepository.save(usuario);
		
		BeanUtils.copyProperties(usuario, usuarioDto);
		
		return usuarioDto;
	}


	@Override
	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
		Usuario objUsuario = usuarioRepository
				.findByUsuario(usuario)
				.orElseThrow( () -> new  UsernameNotFoundException("Login não encontrado") );
		return User.builder()
				   .username(objUsuario.getUsuario())
				   .password(objUsuario.getSenha())
				   .roles("USER")
				   .build();
	}

}
