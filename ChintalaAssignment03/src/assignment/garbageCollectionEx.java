package assignment;

public class garbageCollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		garbageCollectionEx obj1 = new garbageCollectionEx();
		garbageCollectionEx obj2 = new garbageCollectionEx();

		// Setting obj1 and obj2 to null
		obj1 = null;
		obj2 = null;

		// Suggesting garbage collection to run
		System.gc();
	}

}
