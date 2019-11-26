/*
 * ESSE AQUI FUNCIONA COMO UM Diretor (Director)
 * 
 * - Aqui é responsável por se construir (build) o objeto complexo,
 *   recebendo um Builder como parâmetro e chamando seus métodos
 *   passo-a-passo para criação correta do objeto.
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
