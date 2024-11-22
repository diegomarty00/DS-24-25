package filtros;

import fileSystem.Output;

import java.io.IOException;

public class FiltroContador  implements Filtro{


    Output filtro;
    int contador = 0;

    public FiltroContador(Output filtro) {
        this.filtro = filtro;
    }

    public int getContador() {
        return contador;
    }

    @Override
    public void append(char c) throws IOException {
        contador += 1;
        filtro.append(c);
    }

    @Override
    public void close() throws IOException {
        filtro.close();
    }
}
