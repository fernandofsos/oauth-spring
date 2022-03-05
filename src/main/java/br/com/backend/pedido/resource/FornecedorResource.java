package br.com.backend.pedido.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.pedido.dto.FornecedorDto;
import br.com.backend.pedido.repository.filter.FornecedorFilter;
import br.com.backend.pedido.service.FornecedorService;


@RestController
@RequestMapping("/fornecedor")
public class FornecedorResource {
	
	@Autowired
	FornecedorService fornecedorService;
	
	@GetMapping
	public Page<FornecedorDto> doGetFornecedor(FornecedorFilter fornecedorFilter, Pageable pageable) {
		return fornecedorService.getFornecedor(fornecedorFilter, pageable);
	}
	
	@GetMapping("/{idFornecedor}")
	public FornecedorDto doGetIdFornecedor(@PathVariable Long idFornecedor) {
		return fornecedorService.getIdFornecedor(idFornecedor);
	    
	}
	
	@PostMapping
	public FornecedorDto doPostFornecedor(@RequestBody FornecedorDto fornecedorDto) {
		return fornecedorService.postFornecedor(fornecedorDto);
	}
	
	@PutMapping
	public FornecedorDto doPutFornecedor(@RequestBody FornecedorDto fornecedorDto) {
		return fornecedorService.putFornecedor(fornecedorDto);
		
	}

}
