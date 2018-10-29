package br.com.api.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.model.Contatos;

public interface ContatosRepository extends JpaRepository<Contatos, Long>{
	Contatos findById(Long id);
}
