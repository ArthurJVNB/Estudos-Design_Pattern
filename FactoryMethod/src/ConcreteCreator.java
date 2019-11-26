
class ConcreteCreator extends Creator {

	@Override
	ProductIF gerarProduto(String nome) {
		if(nome == ""|| nome == null) {
			return null;
		}
		
		if(nome.equalsIgnoreCase("Sapato")) {
			return new Sapato();
		} else if(nome.equalsIgnoreCase("Roupa")) {
			return new Roupa();
		}
		
		return null;
	}
}