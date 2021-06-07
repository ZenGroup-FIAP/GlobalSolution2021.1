package br.blog.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.blog.forms.Avaliacao;

public class Usuario extends Adiministrador {
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	private Scanner sc = new Scanner(System.in);
	
	public Usuario() {
		super();
		this.tipoUsuario = "usuario";
	}

	public Usuario(String nome, String senha, String email, int id) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.id = id;
		this.tipoUsuario = "usuario";
	}
	
	public Avaliacao avaliar(int idHotel) {
		Avaliacao av = new Avaliacao();
		System.out.print("DE 0 À 5 QUAL É A SUA AVALIACAO SOBRE O HOTEL: ");
		double nota = sc.nextDouble();
		while (nota < 0 || nota > 5) {
			System.out.println("NOTA DE 0 À 5...");
			System.out.print("DE 0 À 5 QUAL É A SUA AVALIACAO SOBRE O HOTEL: ");
			nota = sc.nextDouble();
		}
		av.setNota(nota);
		
		System.out.println("DESCREVA UM COMENTÁRIO SOBRE O HOTEL");
		System.out.print("-> ");
		String coment = sc.nextLine();
		av.setComentario(coment);
		
		av.setIdHotel(idHotel);
		av.setIdUsuario(this.id);
		
		return av;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
}
