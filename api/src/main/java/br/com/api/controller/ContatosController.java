package br.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.model.Contatos;
import br.com.api.repostory.ContatosRepository;

@RestController
@RequestMapping("/contatos")
public class ContatosController {

	@Autowired
	ContatosRepository contatosRepository;

	@CrossOrigin
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Contatos> listaContato() {
		return contatosRepository.findAll();
	}

	@CrossOrigin
	@PostMapping(value = "/novo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contatos salvarContato(@RequestBody Contatos contato) {
		return contatosRepository.save(contato);
	}
	
	@CrossOrigin
	@DeleteMapping(value = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteContato(@RequestBody Contatos contato) {
		 contatosRepository.delete(contato);
	}
	
	@CrossOrigin
	@PutMapping(value = "/atualizar", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contatos updateContato(@RequestBody Contatos contato) {
		 return contatosRepository.save(contato);
	}
	
	
}
