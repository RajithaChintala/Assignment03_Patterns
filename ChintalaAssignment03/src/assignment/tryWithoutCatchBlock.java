package assignment;

public class tryWithoutCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int obj1=2;
		int obj2=0;
		try {
				int obj3 = obj1/obj2;
				System.out.println("just by try block");
		}
		finally {
			System.out.println("without catch block");
		}
	}

}
