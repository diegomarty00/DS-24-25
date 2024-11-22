package filtros;

import fileSystem.Output;

import java.io.IOException;

public interface Filtro extends Output{
    void append(char c) throws IOException;
    void close() throws IOException;
}
