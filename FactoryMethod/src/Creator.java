
public abstract class Creator {

	/**
	 * Abstração de uma classe Creator capaz de manipular produtos.
	 */

	protected ProductIF prod;

	/**
	 * Abstração do Factory Method
	 */
	abstract ProductIF gerarProduto(String nome);

}
