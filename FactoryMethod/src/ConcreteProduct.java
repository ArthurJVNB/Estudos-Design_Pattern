/**
 * Esta classe concreta cont�m a implementa��o de um tipo de produto
 * espec�fico.
 */
class ConcreteProduct implements ProductIF {
	
	@Override
	public void criarProduto() {
		 System.out.println("Meu produto foi criado.");
	}

}