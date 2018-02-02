package service.impl.service;

import service.impl.Book;
import service.impl.BookBuilder;
import service.impl.console.io.ConsoleHandler;
import service.impl.files.io.Writer;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchiveParser {
    private static ArchiveParser archiveParserInstance;

    private ArchiveParser() {
    }

    public static ArchiveParser getArchiveParserInstance() {
        if (archiveParserInstance == null) archiveParserInstance = new ArchiveParser();
        return archiveParserInstance;
    }

    private List<Book> listOfBooks = new LinkedList<>();

    public void bookListBuilder(List<String> lines) {
        String[] lineParts;
        for (String line : lines) {
            if (line.equals("")) continue;
            lineParts = line.split("-");
            BookBuilder bookBuilder = new BookBuilder();
            bookBuilder
                    .setName(lineParts[0])
                    .setAuthor(lineParts[1])
                    .setPublishYear(lineParts[2])
                    .setGenre(lineParts[3])
                    .setIsAvailable(lineParts[4])
                    .setSignature(line);
            listOfBooks.add(bookBuilder.build());
        }
    }

    public void availableFieldsScanner(int choice) {
        if (choice < 1 || choice > 5) {
            System.out.println("Не правильный номер!");
            ConsoleHandler consoleHandler = ConsoleHandler.getConsoleHandlerInstance();
            consoleHandler.getResponse();
        } else {
            List<String> fieldList = new LinkedList<>();
            for (Book book : listOfBooks) {
                switch (choice) {
                    case 1:
                        fieldList.add(book.getName());
                        break;
                    case 2:
                        fieldList.add(book.getAuthor());
                        break;
                    case 3:
                        fieldList.add(book.getPublishYear());
                        break;
                    case 4:
                        fieldList.add(book.getGenre());
                        break;
                    case 5:
                        fieldList.add(book.getIsAvailable());
                        break;
                }
            }
            List<String> uniqueFieldList = new LinkedList<>(fieldList.stream().distinct().collect(Collectors.toList()));
            ConsoleHandler consoleHandler = ConsoleHandler.getConsoleHandlerInstance();
            consoleHandler.getResponse(uniqueFieldList);
        }
    }

    public void getNeededBooks(String fieldName, int choice) {
        List<String> filteredBooks = new LinkedList<>();
        for (Book book : listOfBooks) {
            switch (choice) {
                case 1:
                    if (book.getName().equals(fieldName)) {
                        filteredBooks.add(book.getSignature());
                    }
                    break;
                case 2:
                    if (book.getAuthor().equals(fieldName)) {
                        filteredBooks.add(book.getSignature());
                    }
                    break;
                case 3:
                    if (book.getPublishYear().equals(fieldName)) {
                        filteredBooks.add(book.getSignature());
                    }
                    break;
                case 4:
                    if (book.getGenre().equals(fieldName)) {
                        filteredBooks.add(book.getSignature());
                    }
                    break;
                case 5:
                    if (book.getIsAvailable().equals(fieldName)) {
                        filteredBooks.add(book.getSignature());
                    }
                    break;
            }
        }
        Writer writer = Writer.getWriterInstance();
        writer.writeFile(filteredBooks);
    }
}

