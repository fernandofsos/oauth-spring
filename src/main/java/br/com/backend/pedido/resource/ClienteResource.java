package br.com.backend.pedido.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.pedido.dto.ClienteDto;
import br.com.backend.pedido.repository.filter.ClienteFilter;
import br.com.backend.pedido.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<ClienteDto> doGetCliente(ClienteFilter clienteFilter) {
		return clienteService.getCliente();
	}
	
	@PostMapping
	public ClienteDto doPostCliente(@RequestBody ClienteDto clienteDto) {
		return clienteService.postCliente(clienteDto);
	}
	
	@PutMapping
	public ClienteDto doPutCliente(ClienteDto clienteDto) {
		return clienteService.putCliente(clienteDto);
		
	}
	

}
