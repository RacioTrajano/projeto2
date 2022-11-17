package br.ufrn.imd.main;

import java.util.Scanner;
import br.ufrn.imd.dominio.Artigo;
import br.ufrn.imd.dominio.Biblioteca;
import br.ufrn.imd.dominio.ItemAcervo;
import br.ufrn.imd.dominio.Livro;
import br.ufrn.imd.dominio.Revista;

public class BibliotecaView {

	public static void main(String[] args) {
		
		Biblioteca library = new Biblioteca();
		
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.err
						.println("Digite a opcao desejada: \n" 
						+ "1 - Cadastrar - Novo Livro \n" 
						+ "2 - Cadastrar - Novo Artigo \n"
						+ "3 - Cadastrar - Nova Revista \n"
						+ "4 - Verificar Disponibilidade \n"
						+ "5 - Listar Acervo \n"
						+ "6 - Fazer aluguel \n"
						+ "7 - Fazer devolucao \n"
						+ "8 - Verifica o tipo do Item do acervo \n" 
						+ "0 - Sair");
				int opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do Livro");
					String t1 = sc.nextLine();
					Livro c = new Livro();
					c.setTitulo(t1);
					System.out.println("Digite a editora do Livro");
					String t2 = sc.nextLine();
					c.setEditora(t2);
					System.out.println("Digite a qtd de Copias");
					int t3 = Integer.parseInt(sc.nextLine());
					c.setQtdCopias(t3);
					System.out.println("Digite a qtd de Paginas");
					int t4 = Integer.parseInt(sc.nextLine());
					c.setQtdPaginas(t4);
					library.addAcervo(c);
					break;
				case 2:
					System.out.println("Digite o nome do Artigo");
					String t5 = sc.nextLine();
					Artigo a = new Artigo();
					a.setTitulo(t5);
					System.out.println("Digite o tipo do Artigo");
					String t6 = sc.nextLine();
					a.setTipo(t6);
					System.out.println("Digite a qtd de Copias");
					int t7 = Integer.parseInt(sc.nextLine());
					a.setQtdCopias(t7);
					System.out.println("Digite a qtd de Paginas");
					int t8 = Integer.parseInt(sc.nextLine());
					a.setQtdPaginas(t8);
					library.addAcervo(a);
					break;
				case 3:
					System.out.println("Digite o nome da Revista");
					String t9 = sc.nextLine();
					Revista r = new Revista();
					r.setTitulo(t9);
					System.out.println("Digite o tema da Revista");
					String t10 = sc.nextLine();
					r.setTema(t10);
					System.out.println("Digite a qtd de Copias");
					int t11 = Integer.parseInt(sc.nextLine());
					r.setQtdCopias(t11);
					System.out.println("Digite a qtd de Paginas");
					int t12 = Integer.parseInt(sc.nextLine());
					r.setQtdPaginas(t12);
					library.addAcervo(r);
					break;
				case 4:
					library.listarItensDisponiveis();
					break;
				case 5:
					library.imprimeCadastrados();
					break;
				case 6:
					System.out.println("Digite o nome do Item para aluguel");
					String t13 = sc.nextLine();
					library.fazerAluguel(t13);
					break;
				case 7:
					System.out.println("Digite o nome do Item para devolucao");
					String t14 = sc.nextLine();
					library.fazerDevolucao(t14);
					break;
				case 8:
					System.out.println("Digite o nome do Item para verficacao");
					String t15 = sc.nextLine();
					library.verificaHeranca(t15);
					break;
				case 0:
					System.out.println("Fechando...");
					System.exit(0);
				}

			}
		} finally {
			sc.close();
		}

	}

}
