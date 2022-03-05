package br.com.backend.pedido.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.pedido.dto.GrupoDto;
import br.com.backend.pedido.service.GrupoService;


@RestController
@RequestMapping("/grupo")
public class GrupoResource {
		
	@Autowired
	GrupoService grupoService;
	
	@GetMapping
	public List<GrupoDto> doGetGrupo() {
		return grupoService.getGrupo();
	}
			
	@PostMapping
	public GrupoDto doPostGrupo(@Validated @RequestBody GrupoDto grupoDto) {
		return grupoService.postGrupo(grupoDto);
	}
	
	@PutMapping 
	public GrupoDto doPutGrupo(@Validated @RequestBody GrupoDto grupoDto) {
		return null;
	}
	
}
