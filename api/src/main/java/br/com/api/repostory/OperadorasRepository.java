package br.com.api.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.model.Operadoras;

public interface OperadorasRepository extends JpaRepository<Operadoras, Long>{
	Operadoras findById(Long id);
}
