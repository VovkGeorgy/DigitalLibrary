import service.impl.DLibrary;
import service.impl.console.io.ConsoleHandler;
import service.impl.files.io.Reader;
import service.impl.service.ArchiveParser;

public class DLibraryRunner {
    public static void main(String[] args) {
        Reader reader = Reader.getReaderInstance();
        ArchiveParser archiveParser = ArchiveParser.getArchiveParserInstance();
        ConsoleHandler consoleHandler = ConsoleHandler.getConsoleHandlerInstance();


        DLibrary.showWelcomeMessage();
        archiveParser.bookListBuilder(reader.readFile());
        consoleHandler.getResponse();
    }
}
