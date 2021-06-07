package br.blog.testes;

import java.util.Scanner;

import br.blog.forms.Post;
import br.blog.users.Adiministrador;

public class TestePost {

	public static void main(String[] args) {
		// Somente o adiministrador pode criar um post
		Scanner sc = new Scanner(System.in);
		Adiministrador adm = new Adiministrador();
		int id = 1;
		adm.setNome("adm");
		adm.setSenha("123");
		adm.setEmail("adm@mail.com");
		adm.setId(1);
		
		
		while (true) {
			System.out.println("GERENCIADOR DE POSTAGENS");
			System.out.println("SELECIONE UMA OPÇÃO");
			System.out.println("1 - CADASTRAR UMA POSTAGEM");
			System.out.println("2 - VER POSTAGENS");
			System.out.print("DIGITE:");
			int opt = sc.nextInt();
			while (opt < 1 || opt > 2) {
				System.out.println("OPÇÃO INVÁLIDA...");
				opt = sc.nextInt();
			}
			
			if (opt == 1) {
				Post postagem = adm.postar();
				postagem.setId(id);
				id++;
				System.out.print("DESEJA SALVAR POSTAGEM?[S/N]");
				String resp = sc.next();
				if (resp.toUpperCase().startsWith("S")) {
					// Adicionar a postagem na lista de postagens do adm
					adm.salvaPost(postagem);								
				}
			} else {
				// Método que ve postagens			
				adm.mostraPostagens();
				break;
			}
		}
		sc.close();
	}

}
