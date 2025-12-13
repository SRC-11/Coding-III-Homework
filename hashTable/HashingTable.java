package hashPackage;

public class HashingTable extends baseTable  {

	private HashKey[] table;
	public static HashKey head;
    public static HashKey tail;
    private HashKey[] theTable;
 
	
	public void setTable(int size)
	{
		table = new HashKey[size];
		for (int i = 0; i < table.length; i++)
		{
			table[i] = null;
		}
	}
	
	

	@Override
	public boolean insert(Object key, Object value) {
		 int bucketIndex = hash(key) % table.length;
		 HashKey theKey = table[bucketIndex];
		 HashKey previousKey = null;
		 while (theKey != null)
		 {
			 if (key == theKey.key)
			 {
				 theKey.value = value;
			     return true;
			 }
		 }
		 previousKey = theKey;
	     if (table[bucketIndex] == null)
	     {
	    	 table[bucketIndex] = new HashKey(key, value);
	     }
	     else
	     {
	    	 previousKey.next = new HashKey(key, value);
	     }
	     System.out.println(value + " has been added to bucket " + key);
	     return true;
	}

	@Override
	public boolean remove(Object key) {
		 int bucketIndex = hash(key) % table.length;
		 HashKey theKey = table[bucketIndex];
		 HashKey previousKey = null;
		 while (theKey != null)
		 {
			 if (key == theKey.key)
			 {
				if (previousKey == null)
				{
					 table[bucketIndex] = theKey.next;
				}
				else
				{
					previousKey.next = theKey.next;
				}
				System.out.println(theKey.value + "has been removed from bucket" + theKey.key);
			 }
		 }
		 previousKey = theKey;
		
		
		
		return true;
	}

	@Override
	public Object search(Object key) {
		 int bucketIndex = hash(key) % table.length;
		 HashKey theKey = table[bucketIndex];
		 while (theKey != null)
		 {
			 if (key == theKey.key)
			 {
				System.out.println("Key " + theKey.key + " has been found.");
				return theKey;
			 }
			 else
			 {
				 theKey = theKey.next;
			 }
		 }
		return null;
	}
	public void resize() {
		
		theTable = new HashKey[table.length * 2];
		
		for (int x = 0; x < table.length; x++)
		{
			HashKey otherKey = table[x];
			theTable[x] = otherKey;
		}
		table = theTable;
		System.out.println("The table has been resized to " + table.length);
	}
	
}
