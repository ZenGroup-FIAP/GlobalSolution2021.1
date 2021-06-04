package br.blog.users;

import java.util.List;

import br.blog.forms.Avaliacao;

import java.util.ArrayList;

public class Usuario extends Adiministrador {
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String senha, String email, int id) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.id = id;
		this.tipoUsuario = "adm";
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
}
