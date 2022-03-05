package br.com.backend.pedido.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.pedido.dto.ClienteDto;
import br.com.backend.pedido.model.Cliente;
import br.com.backend.pedido.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	public List<ClienteDto> getCliente() {

		List<Cliente> lstCliente = clienteRepository.findAll();
		List<ClienteDto> lstClienteDto = new ArrayList<>();

		lstCliente.stream().forEach(e -> {
			ClienteDto clienteDto = new ClienteDto();
			BeanUtils.copyProperties(e, clienteDto);

			lstClienteDto.add(clienteDto);
			System.out.println(clienteDto.getNome());
		});

		return lstClienteDto;
	}

	public ClienteDto postCliente(ClienteDto clienteDto) {
		Cliente cli = new Cliente();
		BeanUtils.copyProperties(clienteDto,cli);
		Cliente cliente = clienteRepository.save(cli);
		BeanUtils.copyProperties(cliente, clienteDto);

		return clienteDto;

	}

	public ClienteDto putCliente(ClienteDto clienteDto) {

		Cliente cli = new Cliente();
		BeanUtils.copyProperties(cli, clienteDto);
		Cliente cliente = clienteRepository.save(cli);
		BeanUtils.copyProperties(clienteDto, cliente);

		return clienteDto;

	}

	public ClienteDto getClienteEmail(String email) {

		Cliente cli = clienteRepository.findByEmail(email);
		ClienteDto cliDto = new ClienteDto();
		BeanUtils.copyProperties(cliDto, cli);
		return cliDto;

	}

}
