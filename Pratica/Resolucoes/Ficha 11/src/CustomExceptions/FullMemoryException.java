package CustomExceptions;

/**
 * Exception para memoria cheia
 */
public class FullMemoryException extends Exception {
    public FullMemoryException(String m){
        super(m);
    }
}
