package br.blog.testes;

import java.util.Scanner;

import br.blog.forms.Avaliacao;
import br.blog.forms.Hotel;
import br.blog.users.Usuario;

public class TesteAvaliacao {

	public static void main(String[] args) {
		// Somente os usu�rios poder�o fazer as avalia��es
		Usuario user = new Usuario();
		Hotel hotel = new Hotel();
		Scanner sc = new Scanner(System.in);
		int id = 1;
		user.setNome("Marquin");
		user.setEmail("marquin@kkkkkk.com");
		user.setId(1);
		user.setSenha("1234");
		
		hotel.setNome("Hotel Casa Grande");
		hotel.setId(1);
		
		
		while (true) {
			System.out.println("GERENCIADOR DE AVALIA��ES");
			System.out.println("SELECIONE UMA OP��O");
			System.out.println("1 - CADASTRAR UMA AVALIA��O");
			System.out.println("2 - MOSTRAR AVALIA��ES");
			System.out.print("DIGITE: ");
			int opt = sc.nextInt();
			sc.nextLine();
			while (opt < 1 || opt > 2) {
				System.out.println("OP��O INV�LIDA...");
				System.out.print("DIGITE: ");
				opt = sc.nextInt();
				sc.nextLine();
			}
			
			if (opt == 1) {
				Avaliacao av = user.avaliar(hotel.getId());	
				av.setId(id);
				id++;
				System.out.print("DESEJA SALVAR AVALIA��O?[S/N]: ");
				String resp = sc.nextLine();
				if (resp.toUpperCase().startsWith("S")) {
					user.salvarAvaliacao(av);								
				}
			} else {
				user.mostrarAvaliacoes();
				break;
			}
		}
		sc.close();
	}

}
