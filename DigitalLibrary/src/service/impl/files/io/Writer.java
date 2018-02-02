package service.impl.files.io;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Writer {
    private static Writer writerInstance;

    private Writer() {
    }

    public static Writer getWriterInstance() {
        if (writerInstance == null) writerInstance = new Writer();
        return writerInstance;
    }

    public void writeFile(List<String> filtredBooks) {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh-mm-ss a zzz");
        String outFilePath = "D:\\Prog\\projects\\Idea_projects\\DigitalLibrary\\ChosenBooks-" + formatForDateNow.format(date) + ".txt";
        try (java.io.FileWriter writer = new java.io.FileWriter(outFilePath, true)) {
            for (String line : filtredBooks) {
                writer.write(line);
                writer.append('\n');
            }
            System.out.println("File successfully created!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
