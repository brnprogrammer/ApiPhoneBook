package br.com.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "operadoras")
public class Operadoras implements Serializable {

	private static final long serialVersionUID = 2632545651202252926L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OPER_SEQ")
	@SequenceGenerator(name = "OPER_SEQ", sequenceName = "OPER_SEQ")
	private Long id;

	private String operadora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
}
