package fileSystem;

import java.io.*;

public class FileSystem {

    public void copyFile(String name, Output output) throws IOException {
        try {
            FileReader reader = new FileReader(name);

            int c;
            while ((c = reader.read()) != -1)
                output.append((char) c);

            reader.close();
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
