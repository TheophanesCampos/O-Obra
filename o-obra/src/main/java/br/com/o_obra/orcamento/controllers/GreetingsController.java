package br.com.o_obra.orcamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.o_obra.orcamento.model.ComposicaoSintetica;
import br.com.o_obra.orcamento.repository.ComposicaoSinteticaRepository;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
	@Autowired /* IC/CD ou CDI - Injeção de dependencia*/
	private ComposicaoSinteticaRepository composicaoSinteticaRepository;
	
	
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Olá " + name + "!";
    }
    
    
    
  //Primeiro método de API - buscarTodos   
    @GetMapping(value="listatodos")
    @ResponseBody /*retorna os dados para o corpo da resposta*/
    public ResponseEntity<List<ComposicaoSintetica>> listaComposicoes(){
    	List<ComposicaoSintetica> composicoes = composicaoSinteticaRepository.findAll(); /*executa a consulta no banco de dados*/
    	return new ResponseEntity<List<ComposicaoSintetica>>(composicoes,HttpStatus.OK);/*retorna a lista em json*/
    }
}
