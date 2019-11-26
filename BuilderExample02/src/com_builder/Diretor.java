/*
 * ESSE AQUI FUNCIONA COMO UM Diretor (Director)
 * 
 * - Aqui � respons�vel por se construir (build) o objeto complexo,
 *   recebendo um Builder como par�metro e chamando seus m�todos
 *   passo-a-passo para cria��o correta do objeto.
 */

package com_builder;

public class Diretor {
	public void build(AbstractVeiculoBuilder veiculoBuilder) {
		veiculoBuilder.BuildChassi();
		veiculoBuilder.BuildMotor();
		veiculoBuilder.BuildPortas();
		veiculoBuilder.BuildRodas();
	}
}
