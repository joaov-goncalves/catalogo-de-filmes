package br.com.monkeyfilms.catalogofilmes.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.monkeyfilms.catalogofilmes.modelos.Filme;
import br.com.monkeyfilms.catalogofilmes.repositorys.FilmeRepository;

@RestController
public class FilmeController {
	
	@Autowired
	FilmeRepository repo;
	
	@GetMapping("/api")
	public List<Filme> retornaTodos(){
		return repo.findAll();
	}
	
	@GetMapping("/api/{id}")
	public Filme retornaFilmeById(@PathVariable Integer id) {
		Optional<Filme> op = repo.findById(id);
		
		if (op.isPresent()) return op.get();
		else return null;
	}
	
	@PostMapping("/api")
	public void insereFilme(@RequestBody Filme filme) {		
		
		
		
		repo.save(filme);
	}
	
	@PutMapping("/api")
	public void atualizaFilme(@RequestBody Filme filme) {				
		repo.save(filme);
	}
}
