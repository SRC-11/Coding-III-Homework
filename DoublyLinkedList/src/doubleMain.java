package doubleLink;



public class doubleMain {
public static void main(String[] args) {
		
		doublyLinkedList theList = new doublyLinkedList();
		 Node node8 = new Node(8);  
		theList.append(node8);
		theList.print();
		System.out.println("List after append");
		theList.prepend(new Node(11));
		theList.print();
		System.out.println("List after prepend");
		theList.insertAfter(8, new Node(13));
		theList.print();
		System.out.println("List after insertAfter");
		theList.insertBefore(new Node(10), node8);
		theList.print();
		System.out.println("List after insertBefore");
		theList.removeAfter(10);
		theList.print();
		System.out.println("List after removeAfter");
		theList.removeBefore(13);
		theList.print();
		System.out.println("List after removeBefore");
		if( theList.search(10) != null)
		{
			System.out.println("Node 10 found.");
		}
		else
		{
			System.out.println("Node 10 not found.");
		}
		System.out.println("The length of the list is " + theList.length());
		if (theList.isEmpty() == true)
		{
			System.out.println("The list is empty.");
		}
		else
		{
			System.out.println("The list is not empty.");
		}
		theList.sort();
		theList.print();
		System.out.println("Final list");
		
	}
	
}
