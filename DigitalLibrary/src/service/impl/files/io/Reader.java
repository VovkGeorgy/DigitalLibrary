package service.impl.files.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Reader {
    private static Reader readerInstance;

    private Reader() {
    }

    public static Reader getReaderInstance() {
        if (readerInstance == null) readerInstance = new Reader();

        return readerInstance;
    }

    public List<String> readFile() {
        try {
            String filePath = "D:\\Prog\\projects\\Idea_projects\\DigitalLibrary\\Archive.txt";
            return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Ops" + e.getMessage());
        }
        return null;
    }
}
