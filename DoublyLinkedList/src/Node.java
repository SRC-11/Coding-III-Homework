package doubleLink;



public class Node {

	public int value;
	public Node next;
	public Node previous;

	
	public Node() {
		this.value = 0;
		this.next = null;
		this.previous = null;
	}
	
	public Node (int value)
	{
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
	@Override
	public String toString ()
	{
		return " " + this.value;
	}
	public int getValue()
	{
		return this.value;
	}
	
	
	
}
