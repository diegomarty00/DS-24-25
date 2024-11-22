package filtros;

import java.io.IOException;
import fileSystem.Output;

public class FiltroEspacio implements Filtro {
    Output filtro;
    int espacio = 0;

    public FiltroEspacio(Output output) {
        this.filtro = output;
    }

    @Override
    public void append(char c) throws IOException {
        if (espacio == 0)
            filtro.append(c);

        if (c == ' ')
            espacio++;
        else
            espacio = 0;
    }

    @Override
    public void close() throws IOException {
        filtro.close();
    }
}
