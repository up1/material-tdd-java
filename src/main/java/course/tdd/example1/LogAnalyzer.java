package course.tdd.example1;

public class LogAnalyzer {
    
    public boolean isValidLogFileName(String fileName) {
        if( fileName == null ||  fileName.isEmpty() ) {
            throw new ArgumentException("File name has to be provided.");
        }
        if( !fileName.endsWith(".log") ) {
            return false;
        }
        
        return true;
    }

}
