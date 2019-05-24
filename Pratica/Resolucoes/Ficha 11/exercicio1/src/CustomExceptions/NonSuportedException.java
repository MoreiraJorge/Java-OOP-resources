package CustomExceptions;

/**
 * Exception para ficheiros não suportados
 */
public class NonSuportedException extends Exception {
    public NonSuportedException(String m){
        super(m);
    }
}
