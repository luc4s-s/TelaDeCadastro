package TelaDeCadastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TelaDeCadastro.model.Pessoa;
import TelaDeCadastro.repository.PessoaRepository;


@RestController
public class GreetingsController {
//  
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
//    @ResponseStatus(HttpStatus.OK)
//    public String greetingText(@PathVariable String name) {
//        return "Hello " + name + "!";
//    }
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa pessoa){
		
		Pessoa pessoa2 = pessoaRepository.save(pessoa);
		return new ResponseEntity<Pessoa>(pessoa2,HttpStatus.CREATED);
	}
}
