package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4600;
		p1.desconto = 0.29;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 6.50;
		p2.desconto = 5.3;
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);
	}
	

}
