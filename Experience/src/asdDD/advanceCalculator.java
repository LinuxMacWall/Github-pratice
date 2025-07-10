package asdDD;

public class advanceCalculator extends calculator{

	public advanceCalculator(int a, int b) {
		super(a, b);
	}
	
	public void mod() {
		System.out.println(a % b);
	}
	
	public void pow() {
		System.out.println(Math.pow(a, b));
	}
}
