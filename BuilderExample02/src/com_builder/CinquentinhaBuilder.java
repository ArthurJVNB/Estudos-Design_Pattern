/*
 * ESSE � UM Construtor de Fato (ConcreteBuilder)
 * - Aqui se define como de fato o Produto � criado;
 * - � esse tipo de classe que instanciamos diretamente
 *   quando estamos usando o padr�o Builder.
 * 
 * Obs: Aqui se define como se constroi cada parte, mas quem
 * 		de fato chama cada passo � uma classe Diretora. Dessa
 * 		forma podemos abstrair a constru��o detalhada de quem
 * 		est� querendo criar o objeto.
 */

package com_builder;

public class CinquentinhaBuilder extends AbstractVeiculoBuilder {

	public CinquentinhaBuilder() {
		veiculo = new Veiculo("Cinquentinha");
	}
	
	@Override
	public void BuildChassi() {
		veiculo.setComponente("chassi", "Chassi de Cinquentinha");
	}

	@Override
	public void BuildMotor() {
		veiculo.setComponente("motor", "50 cc");
	}

	@Override
	public void BuildRodas() {
		veiculo.setComponente("rodas", "2");
	}

	@Override
	public void BuildPortas() {
		veiculo.setComponente("portas", "0");
	}

}
