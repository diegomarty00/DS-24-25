package filtros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import fileSystem.Output;

public class FiltroGrande implements Filtro {
    private ArrayList<Output> filtros = new ArrayList<Output>();

    public FiltroGrande(Output[] lista) {
        //for (Output element : lista) {
        //    this.filtros.add(element);
        //}
        Collections.addAll(this.filtros, lista);
    }

    @Override
    public void append(char c) throws IOException {
        for (Output filtro : filtros) {
            filtro.append(c);
        }
    }

    @Override
    public void close() throws IOException {
        for (Output filtro : filtros) {
            filtro.close();
        }
    }
}
