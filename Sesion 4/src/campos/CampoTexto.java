package campos;

public class CampoTexto extends Campo {

	public CampoTexto(String etiqueta) {
		super(etiqueta);
	}


	@Override
	public boolean condicion(){
		for (char ch : getDato().toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}


}
