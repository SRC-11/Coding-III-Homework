package bibleHomework2;

public class BibleMain {

	public static void main(String[] args) {
		
		int tru = 13;
		int years = 0;
		long pop = 7699999987L;
		int exponent = 0;
		int babyYears = 0;
		int deadYears = 0;
		int baby = 0;
		while (pop > 0)
		{
			years = years + 3;
			pop = pop - (tru * (2^exponent));
			exponent = exponent + 1;
			if (years >= 30)
			{
				babyYears = babyYears + 1;
				baby = baby + 1;
			}
			deadYears = deadYears + 1;
			if (babyYears == 18 && baby < 1)
			{
				tru = tru + 1;
			}
			else if ((babyYears - 30) % 18 == 0)
			{
				tru = tru + 1;
			}
			
			if (years % 30 == 0 && baby < 1)
			{
		        deadYears = 0;
			}
			
			else if (years % 30 == 0)
			{
				deadYears = 42;
			}
			
			if (years == 72)
			{
				pop = pop - 13;
			
			}
			
			else if (deadYears - 72 == 0);
			{
				pop = pop - 1;
				deadYears = 0;
			}
			
		}
	
		System.out.println ("It will take" + " " + years + " " + "years.");
}
}
