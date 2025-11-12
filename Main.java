package main;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		int[] arr = generate_random_unique(start, end);
		int[] intervals = {1000, 500, 200, 1};
		 insertionSort (arr);
		    System.out.println("End of insertion sort.");
	   ShellSort(arr, intervals);
	   System.out.println("First shell sort complete.");
	 ShellSort2(arr);
	 System.out.println("Second shell sort complete");

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
	public static int[] insertionSort(int[] arr)
	{
		int[] recreate = new int [10000];
		for (int v = 0; v < 10000; v++)
		{
			recreate[v] = arr[v];
		}
	    int c = 0;
	    int d = 0;
	    int temp3 = 0;
	    long start3 = System.currentTimeMillis();
	    for (c = 1; c < 10000; c++) {
	    	d = c;
	    	while (d > 0 && recreate[d] < recreate[d -1]) {
	    		temp3 = recreate[d];
	    		recreate[d] = recreate[d - 1];
	    		recreate[d - 1] = temp3;
	    		--d;
	    	}
	    }
	    long finish3 = System.currentTimeMillis();
	    long timeElapsed3 = finish3 - start3;
	    System.out.println("Sorting an array of size 10000 took insertion sort" + " " + timeElapsed3 + " " + "ms to complete");
		return arr;
	}
	public static int[] ShellSort(int[] arr, int[] intervals)
	{
		int k = 0;
		int temp = 0;
	  long start2 = System.currentTimeMillis();
		for (int i = 0; i < 4; i++)
		{
			for (int start = 0; start < (intervals[i]); start++)
			{
			for (int r = start + intervals[i]; r < 10000; r = r + (intervals[i]))
			{
				k = r;
				while(((k - intervals[i]) >= start) && arr[k] < arr[k - (intervals[i])])
				{
					temp = arr[k];
			        arr[k] = arr[k - intervals[i]];
					arr[k - (intervals[i])] = temp;
					k -= intervals[i];
				}
			}
			}
		}
		long finish2 = System.currentTimeMillis();
	    long timeElapsed2 = finish2 - start2;
	    System.out.println("Sorting an array of size 10000 took the shell sort" + " " + timeElapsed2 + " " + "ms to complete");
		return arr;
	}
	public static int[] ShellSort2 (int[] arr)
	{
		int intervals[] = new int[14];
		for (int i = 0; i < 14; i++)
		{
			int decide = 13;
			intervals[i] = 2^decide;
			decide = decide - 1;
		}
		ShellSort(arr, intervals);
		return arr;
		
	}
}
