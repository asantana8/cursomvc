package com.asantana.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asantana.cursomc.domain.Cidade;
import com.asantana.cursomc.repositories.CidadeRepository;
import com.asantana.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public Cidade buscar(Integer id) {
		Cidade obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()); 
		}
		return obj;
	}

}
