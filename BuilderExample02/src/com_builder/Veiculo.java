/*
 * ESSA EH A CLASSE "PRODUTO" (PRODUCT)
 * - A classe produto é apenas uma representação intermediária do objeto final.
 * - Aqui se definem algumas coisas, como no exemplo, a forma de definir os componentes
 * - e a forma de ser instanciado o produto.
 */

package com_builder;
import java.util.HashMap;

public class Veiculo {
	private String tipoDeVeiculo;
	private HashMap<String, String> componentes = new HashMap<>();
	
	public Veiculo(String tipoDeVeiculo) {
		this.tipoDeVeiculo = tipoDeVeiculo;
	}
	
	public void setComponente(String nomeComponente, String componente) {
		componentes.put(nomeComponente, componente);
	}
	
	public void descrever() {
		StringBuilder descricao = new StringBuilder();
		descricao.append("\n---------------------------");
		descricao.append("\nTipo de Veiculo: " + tipoDeVeiculo);
		descricao.append("\n  Chassi: " + componentes.get("chassi"));
		descricao.append("\n  Motor:  " + componentes.get("motor"));
		descricao.append("\n  Rodas:  " + componentes.get("rodas"));
		descricao.append("\n  Portas: " + componentes.get("portas"));
		
		System.out.println(descricao);
	}
}
