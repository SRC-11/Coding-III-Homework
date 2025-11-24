package quicksortPack;

import java.util.Random;

public class QuicksortMain {
	
	public static void main(String[] args) {
		int start = 0;
		int end = 15000;
		int[] arr = generate_random_unique(start, end);
		quicksort(arr);	
	}
       
public static int[] quicksort (int[] arr)
{
	int pivot = arr[5000];
    int d;
	int lowIndex = 0;
	int highIndex = 9999;
	int lowEndIndex;
	int highEndIndex;
	int temp;
	int temp2;
	boolean finish = false;
    long start3 = System.currentTimeMillis();
	while (arr[lowIndex] < pivot)
	{
		lowIndex = lowIndex + 1;
	}
	while (arr[highIndex] > pivot)
	{
		highIndex = highIndex - 1;
       
	}
	while (finish != true)
	{
		
		 temp = arr[lowIndex];
		 arr[lowIndex] = arr[highIndex];
		 arr[highIndex] = temp;
		 lowIndex = lowIndex + 1;
		 highIndex = highIndex - 1;
		 if (lowIndex >= highIndex)
		 {
			 finish = true;
		 }
	}
	 highEndIndex = lowIndex;
	 lowEndIndex = highIndex;
	 for (int r = 1; r <= lowEndIndex; r++)
	 {
			 d = r;
			 while (d > 0 && arr[d] < arr[d -1]) {
		    		temp2 = arr[d];
		    		arr[d] = arr[d - 1];
		    		arr[d - 1] = temp2;
		    		--d;
		    	}
		 }
		  
	 for (int s = highEndIndex; s < 10000; s++)
	 {
		 d = s;
		 while (d > 0 && arr[d] < arr[d -1]) {
	    		temp2 = arr[d];
	    		arr[d] = arr[d - 1];
	    		arr[d - 1] = temp2;
	    		--d;
	    	}
	 }
	 long finish3 = System.currentTimeMillis();
	 long timeElapsed3 = finish3 - start3;
	 System.out.println("Quicksorting an array of 10000 took" + " " + timeElapsed3 + " " + "miliseconds");
	 
	return arr;
	
}


public static int[] generate_random_unique(int start, int end)
{
	
	int[] arr = new int[10000];
	Random r = new Random();
	for (int l = 0; l < 10000; l++)
	{
		arr[l] = r.nextInt(start, end);
		for (int j = 0; j < 10000; j++)
		{
			if (arr[j] == arr[l] && l != j )
			{
				arr[l] = r.nextInt(start, end);
				break;
			}
		}
	} 

	
	   return arr;	
	
}
}

