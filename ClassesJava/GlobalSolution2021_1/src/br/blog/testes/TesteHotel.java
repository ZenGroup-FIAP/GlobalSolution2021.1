package br.blog.testes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import br.blog.forms.Hotel;

public class TesteHotel {

	public static void main(String[] args) {
		List<Hotel> hoteis = new ArrayList<Hotel>();
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int id = 1;
		
		while(true) {
			Hotel hotel = new Hotel();
			System.out.println("GERENCIADOR DE HOTÉIS");
			System.out.println("SELECIONE UMA OPÇÃO");
			System.out.println("1 - CADASTRAR HOTEL");
			System.out.println("2 - MOSTRAR HOTÉIS");
			System.out.print("DIGITE: ");
			int opt = sc.nextInt();
			sc.nextLine();
			while(opt < 1 || opt > 2) {
				System.out.println("OPÇÃO INVÁLIDA...");
				System.out.print("DIGITE: ");
				opt = sc.nextInt();
				sc.nextLine();
			}
			
			if (opt == 1) {
				System.out.print("NOME DO HOTEL: ");
				String nome = sc.nextLine();
				hotel.setNome(nome);
				
				System.out.print("ENDEREÇO: ");
				String endereco = sc.nextLine();
				hotel.setEndereco(endereco);
				
				System.out.print("QUANTIDADE DE QUARTOS: ");
				int qtdQuartos = sc.nextInt();
				sc.nextLine();
				hotel.setQtdQuartos(qtdQuartos);
				
				System.out.print("PREÇO DA ESTADIA: R$");
				double precoEstadia = sc.nextDouble();
				sc.nextLine();
				hotel.setPrecoEstadia(precoEstadia);
				
				hotel.setClassificacao(gerador.nextInt(5));
				hotel.setId(id);
				id++;
				
				System.out.print("SALVAR HOTEL?[S/N]: ");
				String resp = sc.nextLine();
				
				if (resp.toUpperCase().startsWith("S")) {
					hoteis.add(hotel);
				}
				
			} else {
				for (Hotel hot : hoteis) {
					System.out.println("NOME: " + hot.getNome());
					System.out.println("ENDEREÇO: " + hot.getEndereco());
					System.out.println("QUANTIDADE DE QUARTOS: " + hot.getQtdQuartos());
					System.out.println("CLASSIFICAÇÃO: " + hot.getClassificacao());
					System.out.println("ID: " + hot.getId());
					System.out.println("-------------------------------");
				}
				break;
			}
		}
		sc.close();
	}

}
