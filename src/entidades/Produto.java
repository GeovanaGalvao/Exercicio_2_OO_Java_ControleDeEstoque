package entidades;

public class Produto {
	public String nome;
	public double valor;
	public int quantidade;
	
	public double valorTotalEmEstoque() {
		return valor*quantidade;
	}
	
	public void adicionarEstoque(int quantidadeDesejada) {
		quantidade += quantidadeDesejada;
		System.out.println("\nQuantidade inserida com sucesso!\n\n" + toString());
	}
	
	public void removerEstoque(int quantidadeDesejada) {
		if (quantidade >= quantidadeDesejada) {
		quantidade -= quantidadeDesejada;
		System.out.println("\nQuantidade removida com sucesso!\n\n");
		}
		else System.out.println("\nNão eh possivel a remocao dessa quantididade no"
				+ " estoque, pois nao ha produtos suficientes armazenados.\n\n");
		System.out.println(toString());
	}
	
	public String toString() {
		return "Nome: " + nome + "\nValor R$: " + String.format("%.2f", valor) +
				"\nQuantidade: " + quantidade + "\nValor total em estoque R$: "
				+ String.format("%.2f", valorTotalEmEstoque()) + "\n";
	}
}
