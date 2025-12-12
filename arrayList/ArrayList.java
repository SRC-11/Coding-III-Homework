package arrayLL;

public class ArrayList {

	private int[] arrayData;
	private int arrayListLength;
	
	public ArrayList()
	{
		this(5);
	}
	
	public ArrayList (int size)
	{
		this.arrayData = new int[size];
		this.arrayListLength = size;
		
	}
	
	public void append (int appendValue)
	{
		if (arrayData.length == arrayListLength)
		{
			int[] newArray = resize(arrayListLength + 1);
			for (int i = 0; i < arrayListLength; i++)
			{
				newArray[i] = arrayData[i];
			}
			newArray[arrayListLength] = appendValue;
			arrayListLength = arrayListLength + 1;
			arrayData = newArray;
		}
	}
	
	public int[] resize (int newSize) 
	{
		int[] theNewArray = new int[newSize];
		return theNewArray;
	}
	
	public void prepend(int prependValue)
	{
		if (arrayData.length == arrayListLength)
		{
			int[] newArray = resize(arrayListLength + 1);
			for (int i = 1; i < arrayListLength; i++)
			{
				newArray[i] = arrayData[i];
			}
			newArray[0] = prependValue;
			arrayListLength = arrayListLength + 1;
			arrayData = newArray;
		}
	}
	public void insertAt(int insertValue, int insertPosition)
	{
		if (arrayData.length == arrayListLength)
		{
			int[] newArray = resize(arrayListLength + 1);
			arrayListLength = arrayListLength + 1;
			for (int i = 0; i < insertPosition; i++)
			{
				newArray[i] = arrayData[i];
			}
			newArray[insertPosition] = insertValue;
			for (int i = insertPosition + 1; i < arrayListLength; i++)
			{
				newArray[i] = arrayData[i - 1];
			}
			arrayData = newArray;
		}
	
	}
	public void removeAt(int removePosition)
	{
		for (int i = removePosition; i < arrayListLength - 1; i++)
		{
			arrayData[i] = arrayData[i + 1];
		}
		arrayListLength = arrayListLength - 1;
	}
	public void search(int searchValue)
	{
		boolean valueFound = false;
		for (int i = 0; i < arrayListLength; i++)
		{
			if (arrayData[i] == searchValue)
			{
				System.out.println("Value " + searchValue + " is at bucket " + i);
				valueFound = true;
			}
		}
		if (valueFound == false)
		{
			System.out.println(searchValue + " not found.");
		}
		
	}
	public void sort() {
		 int c = 0;
		    int d = 0;
		    int temp3 = 0;
		    for (c = 1; c < 999; c++) {
		    	d = 1;
		    	while (d > 0 && arrayData[d] < arrayData[d -1]) {
		    		temp3 = arrayData[d];
		    		arrayData[d] = arrayData[d - 1];
		    		arrayData[d - 1] = temp3;
		    		--d;
		    	}
		    }
	}
	public void print()
	{
		for (int d = 0; d < arrayListLength; d++)
		{
			if(arrayData[d] != 0)
			{
			System.out.println(arrayData[d]);
			}
		}
	}
	public void fill()
	{
		for (int i = 0; i < arrayListLength; i++)
		{
			arrayData[i] = i;
		}
	}
}
