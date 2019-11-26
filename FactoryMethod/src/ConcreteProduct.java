/**
 * Esta classe concreta contém a implementação de um tipo de produto
 * específico.
 */
class ConcreteProduct implements ProductIF {
	
	@Override
	public void criarProduto() {
		 System.out.println("Meu produto foi criado.");
	}

}