package com.fiap.reclame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.reclame.model.Reclamacao;
import com.fiap.reclame.repository.ReclamacaoRepository;
import com.fiap.reclame.service.ReclamacaoService;

@Service
public class ReclamacaoServiceImpl implements ReclamacaoService{

	@Autowired 
	ReclamacaoRepository reclamacaoCommandRepository;

	@Override
	public Reclamacao atualizaReclamacao(Reclamacao reclamacao) {
		return reclamacaoCommandRepository.save(reclamacao);
	}

	@Override
	public Reclamacao adicionaReclamacao(Reclamacao reclamacao) {
		return reclamacaoCommandRepository.save(reclamacao);
	}

	@Override
	public boolean removeReclamacao(Long idReclamacao) {
		try {
			reclamacaoCommandRepository.deleteById(idReclamacao);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
