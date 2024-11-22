package fileSystem;

import java.io.IOException;

public interface Output {
    void append(char c) throws IOException;

    void close() throws IOException;
}