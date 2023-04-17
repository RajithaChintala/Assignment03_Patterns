package assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
	    private String dog;
	    private int age;

	    public Serialization(String dog, int age) {
	        this.dog = dog;
	        this.age = age;
	    }

	    public String getName() {
	        return dog;
	    }

	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	    	Serialization dogNa = new Serialization("jimmy", 5);

	        // Serialize the Person object
	        try {
	            FileOutputStream fileOut = new FileOutputStream("person.ser");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(dogNa);
	            out.close();
	            fileOut.close();
	            System.out.println("Person object serialized successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialize the Person object
	        try {
	            FileInputStream fileIn = new FileInputStream("person.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Serialization se = (Serialization) in.readObject();
	            in.close();
	            fileIn.close();
	            System.out.println("Person object deserialized successfully.");
	            System.out.println("Name: " + se.getName());
	            System.out.println("Age: " + se.getAge());
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}