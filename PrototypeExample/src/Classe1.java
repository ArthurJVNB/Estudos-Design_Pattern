
public class Classe1 implements IPrototipo {

	public Classe1() {
		//System.out.println("Objeto do tipo Classe1 criado");
	}
	
	@Override
	public int meuInteiro() {
		return 1;
	}
	
	@Override
	public IPrototipo makeCopy() {
		Classe1 classe1 = null;
		
		try {
			classe1 = (Classe1) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("Clone de um objeto do tipo Classe1 criado");
		return (Classe1) classe1;
	}

}
