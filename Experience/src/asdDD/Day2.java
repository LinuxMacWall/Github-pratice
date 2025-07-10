package asdDD;

public class Day2 {

	public static void main(String[] args) {
		scientistCalculator newCal = new scientistCalculator(2, 5);
		calculator oldCal = new scientistCalculator(2, 5);
		newCal.log();
		newCal.sum();
		oldCal.sum();
	}

}
