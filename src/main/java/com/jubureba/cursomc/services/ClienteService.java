package com.jubureba.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jubureba.cursomc.domain.Cliente;
import com.jubureba.cursomc.repositories.ClienteRepository;
import com.jubureba.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired //auto-instaciada pelo spring, pelo mecanismo de injecao de dependencia ou inversao de controle
	private ClienteRepository repo;
	
	/*
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);
	}*/
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrando! id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	

}
