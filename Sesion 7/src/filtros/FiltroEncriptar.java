package filtros;

import fileSystem.Output;

import java.io.IOException;

public class FiltroEncriptar implements Filtro{
    Output filtro;

    public FiltroEncriptar(Output filtro) {
        this.filtro = filtro;
    }

    @Override
    public void append(char c) throws IOException {
        if (c != ' ') {
            c += 1;
            filtro.append(c);
        }
    }

    @Override
    public void close() throws IOException {
        filtro.close();
    }
}
