package oopPractice;



public class PracticeNode {

	public int value;
	public PracticeNode next;
	public PracticeNode previous;

	
	public PracticeNode() {
		this.value = 0;
		this.next = null;
		this.previous = null;
	}
	
	public PracticeNode (int value)
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
