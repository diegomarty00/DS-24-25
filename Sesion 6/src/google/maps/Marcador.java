package google.maps;

import formulario.Formulario;

public interface Marcador {

	Coordenadas getCoordenadas();

	String getTooltipInfo();

	void abrir();

	String getTitulo();

	void editar(Formulario formulario);
}
