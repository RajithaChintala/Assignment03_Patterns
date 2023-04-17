package assignment;

public class stringBufffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		s1 += " Everyone";
		System.out.println(s1);
		
		StringBuffer strBuff=new StringBuffer("Welcome");
		strBuff.append(" Everyone");
		System.out.println(strBuff.toString());
	}

}
