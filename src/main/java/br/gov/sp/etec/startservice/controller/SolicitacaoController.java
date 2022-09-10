package br.gov.sp.etec.startservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gov.sp.etec.startservice.model.Solicitacao;
import br.gov.sp.etec.startservice.repository.SolicitacaoRepository;

@Controller
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoRepository repository;
	
	//Aqui abrindo a index do sistema
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("abrir-solicitacao")
	public String abrirSolicitacao() {
		return "solicitacao";
	}
	
	@PostMapping("salvar-solicitacao")
	public String salvarSolicitacao(Solicitacao solicitacao) {
	repository.save(solicitacao);
	return "solicitacao";}

}
