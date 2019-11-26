
public class Classe2 implements IPrototipo {
	
	public Classe2() {
		//System.out.println("Objeto do tipo Classe1 criado");
	}
	
	@Override
	public int meuInteiro() {
		return 2;
	}

	@Override
	public IPrototipo makeCopy() {
		Classe2 classe2 = null;
		
		try {
			classe2 = (Classe2) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Clone de um objeto do tipo Classe1 criado");
		return (Classe2) classe2;
	}

}
