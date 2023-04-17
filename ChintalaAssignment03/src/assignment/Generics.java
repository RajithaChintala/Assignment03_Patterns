package assignment;

public class Generics<T> {
	
	T generics;

	public Generics(T generics) {
		super();
		this.generics = generics;	
	}

	public T getGenerics() {
		return generics;
	}
}

class Main{
	public static void main(String[] args ) {
		Generics<Integer> intObj = new Generics<Integer>(15);
        System.out.println(intObj.getGenerics());
        
        Generics<String> stringObj = new Generics<String>("String Generics");
        System.out.println(stringObj.getGenerics());
 
	}
}