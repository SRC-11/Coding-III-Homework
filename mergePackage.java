package mergeSort;

import java.util.Random;

public class mergePackage {
	public static void main(String[] args) {
		int start = 0;
		int end = 10000;
		int arr[] = generate_random_unique(start, end);
		System.out.println("Start Merge");
    	  long start3 = System.currentTimeMillis();
		mergePartition(arr, 0, 9999);
		long end3 = System.currentTimeMillis();
		long timeElapsed = end3 - start3;
		System.out.println("Sorting an array of size" + " " + end + " " + "took" + " " + timeElapsed + " " + "miliseconds.");
		
		
	}

private static void mergePartition (int[] arr, int lowPos, int highPos) {
	
	
	if (lowPos < highPos)
	{
	    	int mid = (lowPos + highPos) / 2;
			mergePartition(arr, lowPos, mid); 
			mergePartition(arr, mid + 1, highPos); 
	       mergeAll(arr, 0, mid, 9999);
	   	
	}

}

private static void mergeAll(int[] arr, int lowPos,  int mid, int highPos)
{
    
	int arrSize = (highPos - lowPos) + 1;
	int[] sortedArr = new int[arrSize];
	int mergeIndex = 0;
	int lowStart = lowPos;
	int newHighPos = mid + 1;
	while (lowPos <= mid && newHighPos <= highPos)
		{
		if (arr[lowPos] <= arr[newHighPos] ) {
			sortedArr[mergeIndex] = arr[lowPos];
			lowPos = lowPos + 1;
			
		}
		
		else
		{
			sortedArr[mergeIndex] = arr[lowPos];
			newHighPos = newHighPos + 1;
		}
		mergeIndex = mergeIndex + 1;
		}
		
	while (lowPos <= mid)
	{
		sortedArr[mergeIndex] = arr[lowPos];
		lowPos = lowPos + 1;
		mergeIndex = mergeIndex + 1;
	}
	while (newHighPos <= highPos)
	{
		sortedArr[mergeIndex] = arr[newHighPos];
		newHighPos = newHighPos + 1;
		mergeIndex = mergeIndex + 1;
	}
	for (mergeIndex = 0; mergeIndex < arrSize; mergeIndex++)
	{
		arr[lowStart + mergeIndex] = sortedArr[mergeIndex];
	}

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
