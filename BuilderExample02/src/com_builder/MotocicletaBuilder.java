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

public class MotocicletaBuilder extends AbstractVeiculoBuilder {

	public MotocicletaBuilder() {
		veiculo = new Veiculo("Motocicleta");
	}
	
	@Override
	public void BuildChassi() {
		veiculo.setComponente("chassi", "Chassi de Motocicleta");
	}

	@Override
	public void BuildMotor() {
		veiculo.setComponente("motor", "500 cc");
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
