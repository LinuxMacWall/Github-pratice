package exceptionPratice;

public class MainClasss {

	public static void noOverSpeed(int speed) throws OverSpeedException{
		if(speed > 130) {
			throw new OverSpeedException("You are speeding, be careful");
		}

	}
	
	public static void tooFast(int speed) throws TooFastException {
		if(speed > 180) {
			throw new TooFastException("You are driving too fast, your license will be revoked.");
		}
	}
	
	private static void checkArray() {
		int[] arrSample = {1,2,3,4,5};
		try {
			int a = arrSample[7];
		}
		catch(Exception e) {
			System.out.println("Array out of range.");
			System.out.println(e.getMessage()); // Default from the exception information.
		}
		finally{
			System.out.println("All clear");
		}
	}
	
	private static void speedCheck() {
		int speed = 110;
		int speed2 = 140;
		int speed3 = 200;
		try{
			noOverSpeed(speed);
			noOverSpeed(speed2);
		}
		catch(OverSpeedException e)  {
			System.out.println(e.getMessage());
		}
		try {
			tooFast(speed3);
		}
		catch(TooFastException e2) {
			System.out.println(e2.getMessage());
		}
	}
	
	public static void main(String[] args) {
		checkArray();
		speedCheck();
	}

}
