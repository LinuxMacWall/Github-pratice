package asdDD;

public class calculator {

	protected int a;protected int b;
	public calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void sum() {
		System.out.println(a + b);
	}
	
	public void sub() {
		System.out.println(a - b);
	}
	
	public void mult() {
		System.out.println(a * b);
	}
	
	public void div() {
		System.out.println(a / b);
	}
}
