package com_builder;

public class Main {

	public static void main(String[] args) {
		AbstractVeiculoBuilder builder;
		Diretor diretor = new Diretor();
		
		builder = new CarroBuilder();
		diretor.build(builder);
		builder.getVeiculo().descrever();
		
		builder = new MotocicletaBuilder();
		diretor.build(builder);
		builder.getVeiculo().descrever();
		
		builder = new CinquentinhaBuilder();
		diretor.build(builder);
		builder.getVeiculo().descrever();
	}

}
