// ESSE EH UM Builder.
// Aqui se define uma abstracao de como eh o objeto final
// (pode ser uma interface, se assim preferir ou fizer mais sentido)

package com_builder;

public abstract class AbstractVeiculoBuilder {
	protected Veiculo veiculo;
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public abstract void BuildChassi();
	public abstract void BuildMotor();
	public abstract void BuildRodas();
	public abstract void BuildPortas();
}
