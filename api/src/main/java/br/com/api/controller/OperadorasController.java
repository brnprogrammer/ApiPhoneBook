package br.com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import br.com.api.model.Operadoras;
import br.com.api.repostory.OperadorasRepository;

@RestController
@RequestMapping("/operadoras")
public class OperadorasController {

	@Autowired
	OperadorasRepository operadorasRepository;
	
//	@CrossOrigin
//	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody ResponseEntity<String> listaOperadoras() {
//		return new ResponseEntity<>(ObjectFactory);
//	}
	@CrossOrigin
	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Operadoras> listaOperadoras() {
		return this.operadorasRepository.findAll();
	}
	
	@CrossOrigin
	@PostMapping(value = "/novo", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Operadoras salvarContato(@RequestBody Operadoras operadoras) {
		return operadorasRepository.save(operadoras);
		
	}
}
