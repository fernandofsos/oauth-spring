package br.com.backend.pedido.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.pedido.dto.ProdutoDto;
import br.com.backend.pedido.service.ProdutoService;

//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
	public List<ProdutoDto> doGetProduto() {
		return produtoService.getProduto();
	}
	
	@GetMapping("/grupo")
	public List<ProdutoDto> doGetProdutoForGrupo() {
		return produtoService.getProdutoForGrupo();
	}
	
	@PostMapping
	public ProdutoDto doPostProduto(@RequestBody ProdutoDto produtoDto) {
		return produtoService.postProduto(produtoDto);
	}
	
	@PutMapping
	public ProdutoDto doPutProduto(ProdutoDto produtoDto) {
		return produtoService.putProduto(produtoDto);
		
	}
	
	

}
