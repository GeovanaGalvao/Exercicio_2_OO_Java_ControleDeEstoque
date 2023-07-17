package aplicacao;

import java.util.Scanner;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		int escolha;
		Produto produto = new Produto();
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor insira os dados do produto abaixo:\nNome: ");
		produto.nome = sc.nextLine();
		System.out.print("Valor R$: ");
		produto.valor = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		System.out.println("\n" + produto);
		
		while (true) {
			System.out.print("Por favor siga as instrucoes a seguir:\nDigite 1 para "
					+ "adicionar produtos no estoque\nDigite 2 para remover produtos"
					+ "do estoque\nDigite 3 para verificar as informacoes do produto\n"
					+ "Digite 4 para sair do programa.\n\nOpcao: ");
			escolha = sc.nextInt();
			switch (escolha){
				case 1:
					System.out.print("\nPor favor digite a quantidade desejada: ");
					produto.adicionarEstoque(sc.nextInt());
					break;
				case 2:
					System.out.print("\nPor favor digite a quantidade desejada: ");
					produto.removerEstoque(sc.nextInt());
					break;
				case 3:
					System.out.println(produto);
					break;
				case 4:
					System.out.println("\nObrigada pela preferencia! Ate breve.");
					sc.close();
					return;
				default:
					System.out.println("\nComando inválido!");
					break;
			}
		}
	}
}
