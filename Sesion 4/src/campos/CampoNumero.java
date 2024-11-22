package campos;

public class CampoNumero extends Campo {

	public CampoNumero(String etiqueta) {
		super(etiqueta);
	}

	public CampoNumero(Campo campo) {
		super(campo);
	}



	@Override
	public boolean condicion(){
		for (char ch : getDato().toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}
}
