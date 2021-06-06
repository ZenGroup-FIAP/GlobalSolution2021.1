package br.blog.users;

import java.util.Date;
import java.util.Scanner;

import br.blog.forms.Post;

public class Adiministrador {
	protected String nome;
	protected String senha;
	protected String email;
	protected int id;
	protected String tipoUsuario;
	private Scanner sc = new Scanner(System.in);
	
	public Adiministrador() {
		super();
		this.tipoUsuario = "adm";
	}
	
	public Adiministrador(String nome, String senha, String email, int id) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.id = id;
		this.tipoUsuario = "adm";
	}
	
	// Método de criar uma postagem
	public Post postar() {
		Post post = new Post();
		Date data = new Date();
		post.setDataCriacao(data);
		post.setId(this.id);
		
		
		System.out.print("DIGITE O TÍTULO DA POSTAGEM: ");
		String titulo = sc.next();
		post.setTitulo(titulo);
		
		System.out.println("DIGITE O CONTEÚDO DA POSTAGEM: ");
		System.out.print("-> ");
		String conteudo = sc.next();
		post.setConteudo(conteudo);
		
		return post;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
