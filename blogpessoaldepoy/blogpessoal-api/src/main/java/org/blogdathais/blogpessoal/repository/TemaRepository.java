package org.blogdathais.blogpessoal.repository;

import java.util.List;

import org.blogdathais.blogpessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Integer> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
