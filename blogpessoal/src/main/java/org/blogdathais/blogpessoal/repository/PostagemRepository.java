package org.blogdathais.blogpessoal.repository;

import java.util.List;

import org.blogdathais.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
	public List<Postagem> findAllByTitleContainingIgnoreCase(String titulo);
}
