package campos;

public class CampoLongitud extends Campo {

	private int longitud;

	public CampoLongitud(String etiqueta, int longitud) {
		super(etiqueta);
		this.longitud = longitud;
	}

	@Override
	public boolean condicion(){
		return getDato().length() == longitud;
	}
}
