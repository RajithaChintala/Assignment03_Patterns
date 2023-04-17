package assignment;

public class singletonSynchronized {
	    private static singletonSynchronized instance;
	    
	    private singletonSynchronized() {
	        // Private constructor to prevent instantiation
	    }
	    
	    public static synchronized singletonSynchronized getInstance() {
	        if (instance == null) {
	            instance = new singletonSynchronized();
	        }
	        return instance;
	    }
}
