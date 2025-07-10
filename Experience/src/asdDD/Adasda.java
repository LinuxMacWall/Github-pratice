package asdDD;

public class Adasda {

	
	private static boolean checkVovel(char sample) {
		if(sample == 'a' || sample == 'e' || sample == 'i' || sample == 'o' 
				|| sample == 'u') {
			return true;
		}
		return false;
		
	}
	
	private static boolean checkVovelSwitch(char sample) {
		switch(sample) {
		case 'a': case 'e': case 'i': case 'o': case'u': return true;
		default : return false;
		}
	}
	
	
	private static int mul(int a, int b) {
		int result = 0;
		for(int i = 0; i < Math.abs(b); i++) {
			result += a;
		}
		if(b < 0) {
			result = -result;
		}
		return result;
	}
	
	private static void printPattern1(int sample) {
		for(int i = 0; i < sample; i++) {
			String printout = "";
			for(int j = 1; j < sample - i + 1.; j++) {
				printout += String.valueOf(j) + " ";
			}
			System.out.println(printout);
		}
	}

	private static void printPattern2(int sample) {
		for(int i = 0; i < sample; i++) {
			String printout = "";
			for(int j = 1; j < sample - i + 1.; j++) {
				printout += "* ";
			}
			System.out.println(printout);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(checkVovel('b'));
		System.out.println(checkVovelSwitch('e'));
		System.out.println(mul(2, 5));
		printPattern1(10);
		printPattern2(8);

	}
}
