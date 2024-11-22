package campos;

public class CampoMenor extends Campo {

	private int max;

	public CampoMenor(String etiqueta, int max) {
		super(etiqueta);
		this.max = max;
	}


	@Override
	public boolean condicion(){
		return Integer.parseInt(getDato()) <= max;
	}
}
