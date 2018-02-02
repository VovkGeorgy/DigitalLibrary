package service.impl.console.io;

import service.impl.service.ArchiveParser;

import java.io.UnsupportedEncodingException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleHandler {
    private static ConsoleHandler consoleHandlerInstance;
    public static int firstChoice = 1;

    private ConsoleHandler() {
    }

    public static ConsoleHandler getConsoleHandlerInstance(){
        if (consoleHandlerInstance == null) consoleHandlerInstance = new ConsoleHandler();
        return consoleHandlerInstance;
    }

    public void getResponse() {
//        try {
//            System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        System.out.println("Выберите поле для фильтра: \n 1. Название книги \n 2. ФИО автора \n 3. Год издания \n 4. Жанр \n 5. Доступность");
        Scanner in = new Scanner(System.in);
        try {
            firstChoice = in.nextInt();
        } catch (InputMismatchException ex) {
            getResponse();
        }
        ArchiveParser archiveParser = ArchiveParser.getArchiveParserInstance();
        archiveParser.availableFieldsScanner(firstChoice);
    }

    public void getResponse(List<String> uniqueList) {
        int fieldNumber = 1;
        int secondChoice = 1;
        for (String field : uniqueList) {
            System.out.println(fieldNumber++ + " " + field);
        }
        Scanner in = new Scanner(System.in);
        try {
            secondChoice = in.nextInt();
        } catch (InputMismatchException ex) {
            getResponse(uniqueList);
        }
        ArchiveParser archiveParser = ArchiveParser.getArchiveParserInstance();
        archiveParser.getNeededBooks(uniqueList.get(secondChoice - 1), firstChoice);
    }
}
