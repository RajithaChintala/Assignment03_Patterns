package assignment;

public class pureSingleton {
	private static final pureSingleton instance = new pureSingleton();

    private pureSingleton() {
        // Private constructor to prevent instantiation
    }

    public static pureSingleton getInstance() {
        return instance;
    }
}
