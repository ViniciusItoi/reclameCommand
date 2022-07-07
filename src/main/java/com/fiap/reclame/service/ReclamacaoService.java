package com.fiap.reclame.service;

import com.fiap.reclame.model.Reclamacao;

public interface ReclamacaoService {


	public Reclamacao atualizaReclamacao(Reclamacao reclamacao);

	public Reclamacao adicionaReclamacao(Reclamacao reclamacao);

	public boolean removeReclamacao(Long idReclamacao);
}
