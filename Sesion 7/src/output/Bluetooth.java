package output;

import fileSystem.Output;

import java.io.IOException;
import java.io.StringWriter;

public class Bluetooth implements Output {
    StringWriter stringWriter;

    public Bluetooth(String device) {
        stringWriter = new StringWriter();
        stringWriter.append("\n--- START Bluetooth [" + device + "]\n");
    }

    public void append(char c) throws IOException {
        stringWriter.append(c);
    }

    public void close() throws IOException {
        System.out.print(stringWriter.toString());
        System.out.println("\n--- END   Bluetooth");
    }
}
