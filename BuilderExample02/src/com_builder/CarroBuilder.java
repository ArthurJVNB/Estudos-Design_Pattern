/*
 * ESSE É UM Construtor de Fato (ConcreteBuilder)
 * - Aqui se define como de fato o Produto é criado;
 * - É esse tipo de classe que instanciamos diretamente
 *   quando estamos usando o padrão Builder.
 * 
 * Obs: Aqui se define como se constroi cada parte, mas quem
 * 		de fato chama cada passo é uma classe Diretora. Dessa
 * 		forma podemos abstrair a construção detalhada de quem
 * 		está querendo criar o objeto.
 */

package com_builder;

public class CarroBuilder extends AbstractVeiculoBuilder {

	public CarroBuilder() {
		veiculo = new Veiculo("Carro");
	}
	
	@Override
	public void BuildChassi() {
		veiculo.setComponente("chassi", "Chassi de Carro");
	}

	@Override
	public void BuildMotor() {
		veiculo.setComponente("motor", "2500 cc");
	}

	@Override
	public void BuildRodas() {
		veiculo.setComponente("rodas", "4");
	}

	@Override
	public void BuildPortas() {
		veiculo.setComponente("portas", "4");
	}

}
