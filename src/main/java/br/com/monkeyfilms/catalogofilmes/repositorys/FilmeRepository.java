package br.com.monkeyfilms.catalogofilmes.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.monkeyfilms.catalogofilmes.modelos.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer>{
	
}
