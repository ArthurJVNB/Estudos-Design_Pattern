
public class Main {

	public static void main(String[] args) {
		ConcreteCreator concreteCreator = new ConcreteCreator();
		 
		ProductIF product = concreteCreator.gerarProduto("Roupa");
		product.criarProduto();
		
		product = concreteCreator.gerarProduto("Sapato");
		product.criarProduto();

	}

}
