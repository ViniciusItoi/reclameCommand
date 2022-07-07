package com.fiap.reclame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.reclame.model.Reclamacao;
import com.fiap.reclame.service.ReclamacaoService;

@RestController
@RequestMapping("/reclamacoes")
public class ReclamacaoController {

	@Autowired
	private ReclamacaoService reclamacaoService;
	
	@PostMapping
	public Reclamacao adicionaReclamacao(Reclamacao reclamacao) {
		return this.reclamacaoService.adicionaReclamacao(reclamacao);
	}
	
	@PutMapping()
	public Reclamacao atualizaReclamacao(Reclamacao reclamacao){
		return this.reclamacaoService.atualizaReclamacao(reclamacao);
	}
	@DeleteMapping("/{idReclamacao}")
	public boolean removeReclamacao(@PathVariable("idReclamacao") Long idReclamacao){
		return this.reclamacaoService.removeReclamacao(idReclamacao);
	}
}
