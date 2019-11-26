
public class Main {

	public static void main(String[] args) {
		
		IPrototipo c1Original = new Classe1();
		System.out.println("Objeto do tipo Classe1 criado.  Meu inteiro � " + c1Original.meuInteiro() + " e minha hash � " + c1Original.hashCode());
		System.out.println("\n--- agora vamos criar c�pias desse acima ---\n");
		
		IPrototipo c1Copia;
		for (int i = 0; i < 10; i++) {
			c1Copia = c1Original.makeCopy();
			System.out.println("Objeto do tipo Classe1 copiado. Meu inteiro � " + c1Copia.meuInteiro() + " e minha hash � " + c1Copia.hashCode());
		}
		
		System.out.println("\n============================================\n");
		
		IPrototipo c2Original = new Classe2();
		System.out.println("Objeto do tipo Classe2 criado.  Meu inteiro � " + c2Original.meuInteiro() + " e minha hash � " + c2Original.hashCode());
		System.out.println("\n--- agora vamos criar c�pias desse acima ---\n");
		
		IPrototipo c2Copia;
		for (int i = 0; i < 10; i++) {
			c2Copia = c2Original.makeCopy();
			System.out.println("Objeto do tipo Classe2 copiado. Meu inteiro � " + c2Copia.meuInteiro() + " e minha hash � " + c2Copia.hashCode());
		}
	}

}
