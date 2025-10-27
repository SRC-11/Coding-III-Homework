package benchmark;

import java.util.Random;

public class Benchmark {

	
	public static void main(String[] args) {
		int start = 0;
		int end = 130;
		int[] input = generate_random_unique(start, end);
		int[] input2 = generate_random_unique(start, end);
	   bubbleSort(input);
      selectionSort(input2);
}
	
	public static int[] generate_random_unique(int start, int end)
	{
		
		int[] input = new int[10000];
		input[9999] = 0;
		Random r = new Random();
		for (int l = 0; l < 9999; l++)
		{
			input[l] = r.nextInt(start, end);
			for (int j = 0; j < 9999; j++)
			{
				if (input[j] == input[l] && l != j )
				{
					input[l] = r.nextInt(start, end);
					break;
				}
			}
		} 
	
		
		   return input;	
		
	}


public static int[] bubbleSort (int[] input)
{
	long start = System.currentTimeMillis();
	int temp = 0;
	for (int i = 0; i < 9999; i++)
	{
		for (int k = 0; k < 9999; k++)
		{
		    if(input[k] >= input[k + 1] && i < 9998)
		{
			temp = input[k + 1];
			input[k + 1] = input[k];
			input[k] = temp;
		}
   	}
	
}
	long finish = System.currentTimeMillis();

	System.out.println("End of bubble sort.");
	long timeElapsed = finish - start;
    System.out.println("Sorting an array of size 10000 took bubble sort" + " " + timeElapsed + " " + "ms to complete");
	return input;
	
}


public static int[] selectionSort(int[] input2)
{
	long start2 = System.currentTimeMillis();
	int x = 0;
	int y = 0;
	int indexSmallest = 0;
	int temp2 = 0;
	 for (x = 0; x < 9998; ++x)
	 {
		 indexSmallest = x;
		 for (y = x + 1; y < 9999; ++y) {
	         
	         if (input2[y] < input2[indexSmallest] ) {
	            indexSmallest = y;
	         }
	      }
	 temp2 = input2[x];
	    input2[x] = input2[indexSmallest];
		input2[indexSmallest] = temp2;
	 }
	 long finish2 = System.currentTimeMillis();
	
		long timeElapsed2 = finish2 - start2;
		System.out.println("End of selection sort.");
		 System.out.println("Sorting an array of size 10000 took selection sort" + " " + timeElapsed2 + " " + "ms to complete");
	return input2;
}
}

