package br.com.backend.pedido.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.backend.pedido.dto.UsuarioDto;
import br.com.backend.pedido.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	UsuarioService usuarioService;

//	@Value("${aplication.name}")
//	private String msg;
	
	@PostMapping
	public UsuarioDto salvar(@RequestBody @Valid UsuarioDto usuarioDto) {
		UsuarioDto obj = new UsuarioDto();
	//	try {
			obj = usuarioService.salvar(usuarioDto);

//		} catch (UsuarioJaCadastradoException e) {
//			// TODO: handle exception
//			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		return obj;
	}
	
	@GetMapping
	public String message() {
		throw new ResponseStatusException(HttpStatus.OK,"" );
	}




	
	

}
