package bibleCount;

public class Main {

	
	public static void main(String[] args) {
		int tru = 13;
		int years = 0;
		int exponent = 0;
		long pop = 7699999987L;
		findNumberofDisciples(pop);
		while (pop > 0)
		{
			years = years + 3;
			pop = pop - (tru * (2^exponent));
			exponent = exponent + 1;
		}
		System.out.println("Answer 1) It will take" + " " + years + " " + "years.");
	}


public static void findNumberofDisciples(long pop) {
	long answer = Math.round(Math.pow(pop, 1.0/16.0));
	System.out.println("Answer 2) You would need to train" + " " + answer + " " + "disciples at a time.");
}
}

