package stor;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		int target = 43;
		int start = 0;
		int end = 130;
		int total = 1000;
		int[] input = generate_random_unique(start, end, total);
		if (input != null)
		{
			System.out.println(Scan(input, target));
			System.out.println(Stor(input, target));
		}
	
	
	}
	
	


public static int[] generate_random_unique(int start, int end, int total)
{
	
	int[] input = new int[11];
	Random r = new Random();
	int count = 0;
	for (int l = 0; l < 11; l++)
	{
		input[l] = r.nextInt(start, end);
		count = count + input[l];
		for (int j = 0; j < 11; j++)
		{
			if (input[j] == input[l] && l != j )
			{
				input[l] = r.nextInt(start, end);
				break;
			}
		}
	}
     if (count <=total)
     {
    	 return input;
     }
     else
     {
    	 System.err.println("Error. The total of the array exceeds 750.");
    	 input = null;
     }
	
	   return input;
	
	
}


public static boolean Scan(int[] input, int target) {
	
	boolean truth = false;
	for (int i = 0; i < 11; i++)
	{
		if (input[i] == target)
		{
			
			truth = true;
	        break;
			
		}
	}
     return truth;
	
}


public static boolean Stor(int[] input, int target)
{     int[] storTest = new int[11];
	  boolean theTruth = false;
	  for (int k = 0; k < 11; k++)
	  {
		  storTest[k] = input[k];
		  if (input[k] == target)
		  {
			  System.out.println("Target" + " " + target + " " + "was built at position" + " " + k);
			  theTruth = true;
		  }
	  }
	  for (int u = 0; u < 11; u++)
	  {
		  if (storTest[u] != 0)
		  {
			  System.out.println("Position" + " " + u + " " + "is not null.");
		  }
		  else
		  {
			  System.out.println("Position" + " " + u + " " + "is null.");
		  }
	
	  }
	  return theTruth;
}
}