package br.com.backend.pedido.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.pedido.dto.ProdutoDto;
import br.com.backend.pedido.model.Produto;
import br.com.backend.pedido.repository.ProdutoRepository;

@Service
public class ProdutoService {
	

	@Autowired
	ProdutoRepository produtoRepository;
	
	public List<ProdutoDto> getProduto() {

		List<Produto> lstProduto = produtoRepository.findAll();
		List<ProdutoDto> lstProdutoDto = new ArrayList<>();

		lstProduto.stream().forEach(e -> {
			ProdutoDto produtoDto = new ProdutoDto();
			BeanUtils.copyProperties(e, produtoDto);
			lstProdutoDto.add(produtoDto);
		});

		return lstProdutoDto ;
	}
	
	
	public List<ProdutoDto> getProdutoForGrupo() {

		List<Produto> lstProduto = produtoRepository.findByProdutoInnerGrupo();
		List<ProdutoDto> lstProdutoDto = new ArrayList<>();

		lstProduto.stream().forEach(e -> {
			ProdutoDto produtoDto = new ProdutoDto();
			BeanUtils.copyProperties(e, produtoDto);
			lstProdutoDto.add(produtoDto);
		});

		return lstProdutoDto ;
	}
	
	public ProdutoDto postProduto(ProdutoDto produtoDto) {
		
		Produto produto = new Produto();
		produtoDto.setNome(produtoDto.getNome().toUpperCase());
		produtoDto.setDataCadastro(new Date());
		produtoDto.setNomeApresentacao(produtoDto.getNomeApresentacao().toUpperCase());
		produtoDto.setUnidadeMedida(produtoDto.getUnidadeMedida().toUpperCase());
		produtoDto.setGrupo(null);
		BeanUtils.copyProperties(produtoDto,produto);
		
		produto = produtoRepository.save(produto);
		
		BeanUtils.copyProperties(produto, produtoDto);

		return produtoDto;

	}

	public ProdutoDto putProduto(ProdutoDto produtoDto) {

		Produto produto = new Produto();
		BeanUtils.copyProperties(produto, produtoDto);
		produto = produtoRepository.save(produto);
		BeanUtils.copyProperties(produtoDto, produto);

		return produtoDto;

	}



}
