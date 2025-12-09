package nodeHomework;

public class ListMain {

	public static void main(String[] args) {
		
		SinglyLinkedList theList = new SinglyLinkedList();
		 NodeMainClass node8 = new NodeMainClass(8);  
		theList.append(node8);
		System.out.println(node8.value);
		System.out.println("List after append");
		theList.prepend(new NodeMainClass(11));
		theList.print();
		System.out.println("List after prepend");
		theList.insertAfter(8, new NodeMainClass(13));
		theList.print();
		System.out.println("List after insertAfter");
		theList.insertBefore(new NodeMainClass(10), node8);
		theList.print();
		System.out.println("List after insertBefore");
		theList.delete(8);
		theList.print();
		System.out.println("List after deletion");
		theList.remove(10);
		theList.print();
		System.out.println("List after removal");
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
