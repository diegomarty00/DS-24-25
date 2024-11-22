package filtros;

import java.io.IOException;
import fileSystem.Output;

public class FiltroNormalizar implements Filtro{
    Output filtro;

    public FiltroNormalizar(Output output){
        this.filtro = output;
    }

    @Override
    public void append(char c) throws IOException {
        if (c != '\r'){
            filtro.append(c);
        }
    }

    @Override
    public void close() throws IOException {
        filtro.close();
    }
}
