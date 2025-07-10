package asdDD;

public class scientistCalculator extends advanceCalculator{

	
	public void ov1(int a, int b) {
		System.out.println(a + b);
	}
	
	public void ov1(float a, float b) {
		System.out.println(a + b);
	}
	
	@Overrided
	public void sum() {
		System.out.println(a + a + b + b);
	}
	
	public scientistCalculator(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	public void log() {
		System.out.println(Math.log(a) / Math.log(b));
	}
}
