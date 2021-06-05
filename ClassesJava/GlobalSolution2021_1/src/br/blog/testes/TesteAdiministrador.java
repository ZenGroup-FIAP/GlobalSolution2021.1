package br.blog.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.blog.users.Adiministrador;

public class TesteAdiministrador {

	public static void main(String[] args) {
		List<Adiministrador> adiministradores = new ArrayList<Adiministrador>();
		Scanner sc = new Scanner(System.in);
		int id = 1;
		
		while(true) {
			Adiministrador adm = new Adiministrador();
			System.out.println("CADASTRO DE ADIMINISTRADOR");
			System.out.println("--------------------------");
			
			System.out.print("NOME: ");
			String nome = sc.next();
			adm.setNome(nome);
			
			System.out.print("EMAIL: ");
			String email = sc.next();
			adm.setEmail(email);
			
			System.out.print("SENHA: ");
			String senha = sc.next();
			adm.setSenha(senha);
			
			adm.setId(id);
			
			id++;
			adiministradores.add(adm);
			
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
		
		System.out.println("TOTAL DE USUARIOS CADASTRADOS: " + adiministradores.size());
		System.out.println("---------------------------------");
		System.out.println("ADIMINISTRADORES CADASTRADOS: ");
		for ( Adiministrador adm : adiministradores) {
			System.out.println("----------------------------");
			System.out.println("NOME: " + adm.getNome());
			System.out.println("EMAIL: " + adm.getEmail());
			System.out.println("SENHA: " + adm.getSenha());
			System.out.println("ID: " + adm.getId());
		}
	}

}
