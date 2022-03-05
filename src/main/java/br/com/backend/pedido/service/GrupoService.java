package br.com.backend.pedido.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.pedido.dto.GrupoDto;
import br.com.backend.pedido.model.Grupo;
import br.com.backend.pedido.repository.GrupoRepository;

@Service
public class GrupoService {

	@Autowired
	GrupoRepository grupoRepository;

	public List<GrupoDto> getGrupo() {

		List<Grupo> lstGrupo = grupoRepository.findAll();
		List<GrupoDto> lstGrupoDto = new ArrayList<>();

		lstGrupo.stream().forEach(e -> {
			GrupoDto grupoDto = new GrupoDto();   
			BeanUtils.copyProperties(e, grupoDto);
			lstGrupoDto.add(grupoDto);
		});

		return lstGrupoDto;
	}
	

	public GrupoDto postGrupo(GrupoDto grupoDto) {
		
		Grupo grupo = new Grupo();
		BeanUtils.copyProperties(grupoDto,grupo);
		grupo.setNome(grupoDto.getNome().toUpperCase());
		grupo.setDataCadastro(new Date());
		grupo = grupoRepository.save(grupo);
		BeanUtils.copyProperties(grupo,grupoDto );

		return grupoDto;
	}

	
	private boolean pesquisaGrupoNome(Grupo grupo) {
	
		grupo = grupoRepository.findByNome(grupo.getNome());
		
		if(grupo == null) {
			return false;
		}
		
		return true;
	}
}
