/**
 *  A user defined exception
 */
public class SingletonException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SingletonException() {
        super();
    }
    
    public SingletonException(String s) {
        super(s);
    }
    
}