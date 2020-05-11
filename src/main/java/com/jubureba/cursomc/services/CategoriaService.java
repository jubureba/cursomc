package com.jubureba.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jubureba.cursomc.domain.Categoria;
import com.jubureba.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired //auto-instaciada pelo spring, pelo mecanismo de injecao de dependencia ou inversao de controle
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
