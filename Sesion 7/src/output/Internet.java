package output;

import fileSystem.Output;

import java.io.IOException;
import java.io.*;

public class Internet implements Output {
    StringWriter stringWriter = new StringWriter();

    public Internet(String url) {
        stringWriter = new StringWriter();
        stringWriter.append("\n--- START Internet [" + url + "]\n");
    }

    public void append(char c) throws IOException {
        stringWriter.append(c);
    }

    public void close() throws IOException {
        System.out.print(stringWriter.toString());
        System.out.println("\n--- END   Internet");
    }


}
