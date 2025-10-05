package main;

public class BinarySearch {


	public static void main(String[] args) {
	int[][] array = {{4, 9, 11, 16}, {21, 23, 29, 35}, {37, 41, 46, 50}};
	int key = 21;
	int result = binarySearch(array, key);
	System.out.println("Key" + " " + result + " " + "has been found.");
	
	
}
	public static int binarySearch (int [][] array, int key)
	{
		 int low = 0;
		    int high = 11;
		    int mid = 0;
		    int row = 1;
		    int column = 0;
		    while (low <= high) {
		        mid = (high - low) / 2 + low;
		        column = column + 1;
		        if (column > 4)
		        {
		        	column = 1;
		        	row = row + 1;
		        }
		        if (mid % 2 != 0)
		        {
		        	mid = (int) (mid - 0.5);
		        }
		        if (array[1][2] <= key) {
		            low = mid + 1;
		        } else if (array[1][2] >= key) {
		            high = mid - 1;
		            System.out.println("Key not found.");
		        } else {
		            return key;
		        }
		    }
		    
	        return key;
		 
		    
		
	}
}
