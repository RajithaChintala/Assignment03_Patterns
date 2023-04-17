package assignment;

public class covariantReturn {
	public covariantReturn allowObject() {
		System.out.println("Example of covariantReturn");
		return new covariantReturn();
	}
}

class covariantReturn1 extends covariantReturn{
	@Override
	public covariantReturn1 allowObject() {
		System.out.println("Example of covariantReturn1");
		return new covariantReturn1();
	}
}