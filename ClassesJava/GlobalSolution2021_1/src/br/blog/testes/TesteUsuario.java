package br.blog.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.blog.users.Usuario;

public class TesteUsuario {
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Scanner sc = new Scanner(System.in);
		int id = 1;
		
		while(true) {
			Usuario user = new Usuario();
			System.out.println("CADASTRO DE USUÁRIO");
			System.out.println("-------------------");
			
			System.out.print("NOME: ");
			String nome = sc.next();
			user.setNome(nome);
			
			System.out.print("EMAIL: ");
			String email = sc.next();
			user.setEmail(email);
			
			System.out.print("SENHA: ");
			String senha = sc.next();
			user.setSenha(senha);
			
			user.setId(id);
			
			id++;
			usuarios.add(user);
			
			System.out.println("CADASTRADO COM SUCESSO!");
			System.out.print("DESEJA CONTINUAR?[S/N]: ");
			String resp = sc.next();
			
			if (resp.toUpperCase().startsWith("N")) {
				System.out.println("FIM DO CADASTRO");
				System.out.println("---------------");
				sc.close();
				break;
			}
		}
		
		System.out.println("TOTAL DE USUARIOS CADASTRADOS: " + usuarios.size());
		System.out.println("---------------------------------");
		System.out.println("USUARIOS CADASTRADOS: ");
		for ( Usuario usuario : usuarios) {
			System.out.println("----------------------------");
			System.out.println("NOME: " + usuario.getNome());
			System.out.println("EMAIL: " + usuario.getEmail());
			System.out.println("SENHA: " + usuario.getSenha());
			System.out.println("ID: " + usuario.getId());
		}
		
	}
}
