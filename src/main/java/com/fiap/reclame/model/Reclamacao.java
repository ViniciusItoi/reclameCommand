package com.fiap.reclame.model;

import java.sql.Date;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "reclamacao")
@EnableJpaRepositories
public class Reclamacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,updatable = false)
	private Long idReclamacao;
	@NotNull
	private String tipo;
	@NotNull
	@Column(name = "idUsuario")
	private Long idUsuario;
	private String descricao;
	private Date dataCriacao;
	private Date dataConclusao;
	private HashMap<String,Date> chat;
	private String imagem;
	
	/**
	 * @return the idReclamacao
	 */
	public Long getIdReclamacao() {
		return idReclamacao;
	}
	/**
	 * @param idReclamacao the idReclamacao to set
	 */
	public void setIdReclamacao(Long idReclamacao) {
		this.idReclamacao = idReclamacao;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}
	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	/**
	 * @return the dataConclusao
	 */
	public Date getDataConclusao() {
		return dataConclusao;
	}
	/**
	 * @param dataConclusao the dataConclusao to set
	 */
	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	/**
	 * @return the chat
	 */
	public HashMap<String, Date> getChat() {
		return chat;
	}
	/**
	 * @param chat the chat to set
	 */
	public void setChat(HashMap<String, Date> chat) {
		this.chat = chat;
	}
	/**
	 * @return the imagem
	 */
	public String getImagem() {
		return imagem;
	}
	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
} 

