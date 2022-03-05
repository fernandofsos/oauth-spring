package br.com.backend.pedido.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.backend.pedido.dto.FornecedorDto;
import br.com.backend.pedido.model.Fornecedor;
import br.com.backend.pedido.repository.FornecedorRepository;
import br.com.backend.pedido.repository.filter.FornecedorFilter;

@Service
public class FornecedorService {

	@Autowired
	FornecedorRepository fornecedorRepository;

	public Page<FornecedorDto> getFornecedor(FornecedorFilter fornecedorFilter, Pageable pageable) {

		Page<Fornecedor> lstFornecedor = fornecedorRepository.findAll(pageable);
		List<Fornecedor> lst = lstFornecedor.getContent();

		List<FornecedorDto> lstDto = lst.stream().map(obj -> new FornecedorDto(obj)).collect(Collectors.toList());
		Page<FornecedorDto> pageDto = new PageImpl<>(lstDto);

		return pageDto;
		//return lstDto;
	}
	
	public FornecedorDto getIdFornecedor(Long idFornecedor) {
	 
		//FornecedorDto fornecedorDto = new FornecedorDto();
		Fornecedor fornecedor = new Fornecedor();
		fornecedor = fornecedorRepository.findById(idFornecedor).orElse(null);
		FornecedorDto fornecedorDto = new FornecedorDto(fornecedor);
		return fornecedorDto;
	}
	

	public FornecedorDto postFornecedor(FornecedorDto fornecedorDto) {
		Fornecedor fornecedor = new Fornecedor();
		BeanUtils.copyProperties(fornecedorDto,fornecedor);
		fornecedor = fornecedorRepository.save(fornecedor);
		BeanUtils.copyProperties(fornecedor, fornecedorDto);

		return fornecedorDto;

	}

	public FornecedorDto putFornecedor(FornecedorDto fornecedorDto) {

		Fornecedor fornecedor = new Fornecedor();
		fornecedor = fornecedorRepository.findById(fornecedorDto.getIdFornecedor()).get();
		BeanUtils.copyProperties(fornecedorDto, fornecedor);
		fornecedor = fornecedorRepository.save(fornecedor);
		BeanUtils.copyProperties(fornecedor, fornecedorDto);

		return fornecedorDto;

	}

	public FornecedorDto getFornecedorEmail(String email) {

		Fornecedor fornecedor = fornecedorRepository.findByEmail(email);
		FornecedorDto fornecedorDto = new FornecedorDto();
		BeanUtils.copyProperties(fornecedorDto, fornecedor);
		return fornecedorDto;

	}

}
