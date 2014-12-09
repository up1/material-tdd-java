package course.tdd.example1;

import java.util.logging.Logger;

public class LogAnalyzer {

    private final static Logger LOGGER = Logger.getLogger(LogAnalyzer.class.getName());

    public boolean isValidLogFileName(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new ArgumentException("File name has to be provided.");
        }
        if (!fileName.endsWith(".log")) {
            return false;
        }

        return true;
    }

    public void analyze(String fileName) {
        if (fileName.length() < 5) {
            try {
                LOGGER.info(String.format("Filename too short : %s", fileName));
            } catch (Exception e) {
                WebService webService = new WebService();
                webService.write(new ErrorInfo(1000, e.getMessage()));
            }
        }

    }

}
