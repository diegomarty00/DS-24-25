package campos;

public class CampoEdad extends Campo {

	public CampoEdad(String etiqueta) {
		super(etiqueta);
	}


	@Override
	public boolean condicion(){
		return Integer.parseInt(getDato()) >= 18;
	}
}
