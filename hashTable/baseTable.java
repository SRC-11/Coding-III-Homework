package hashPackage;

public abstract class baseTable {

	 protected int hash(Object key) {
	      long keyHash = key.hashCode();
	      
	      if (keyHash < 0) {
	         keyHash += 2147483648L;
	      }
	      
	      return (int)keyHash;
	   }
	 
	 public abstract boolean insert(Object key, Object value);
	   
	   // Searches for the specified key. If found, the key/value pair is removed 
	   // from the hash table and true is returned. If not found, false is returned.
	   public abstract boolean remove(Object key);
	   
	   // Searches for the key, returning the corresponding value if found, null if 
	   // not found.
	   public abstract Object search(Object key);
}
