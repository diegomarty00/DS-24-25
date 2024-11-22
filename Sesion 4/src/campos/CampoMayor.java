package campos;

public class CampoMayor extends Campo {

	private int min;

	public CampoMayor(String etiqueta) {
		super(etiqueta);
		this.min = min;
	}


	@Override
	public boolean condicion(){
		return Integer.parseInt(getDato()) >= min;
	}
}
