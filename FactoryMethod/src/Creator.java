
public abstract class Creator {

	/**
	 * Abstra��o de uma classe Creator capaz de manipular produtos.
	 */

	protected ProductIF prod;

	/**
	 * Abstra��o do Factory Method
	 */
	abstract ProductIF gerarProduto(String nome);

}
