package nodeHomework;

public class SinglyLinkedList {

	public static NodeMainClass head;
	public static NodeMainClass tail;
	public static int listLength;
	
	public SinglyLinkedList()
	{
		head = null;
		tail = null;
	}
	
	public void append(NodeMainClass node)
	{
		if(SinglyLinkedList.head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			node = tail;
		}
	}
	public void prepend (NodeMainClass node)
	{
		if(SinglyLinkedList.head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			node.next = head;
			head = node;
		}
   	
	}
	 public void insertAfter(int currValue, NodeMainClass newNode)
     {
		  /*For whatever reason, this wasn't working properly at first. I had
		   to write a temp node so that this would work. */
  	         NodeMainClass containsNode = search(currValue);
  	         NodeMainClass nodeAfter = containsNode.next;
  	         if (containsNode != null)
  	         {
  	        	 containsNode.next = newNode;
  	        	 newNode.next = nodeAfter;
  	         }
     }
	 public void insertBefore(NodeMainClass newNode, NodeMainClass currNode)
	 { 
		 /*I had to write an extra method to make this work for a SLL. */
		 NodeMainClass containsNode = search(currNode.value);
		 NodeMainClass priorNode = findNodeBefore(currNode);
		 if (containsNode != null)
		 {
			 newNode.next = currNode;
			 priorNode.next = newNode;
		 }
		 else
		 {
			 System.out.println("Insertion failed.");
		 }
	 }
	 public NodeMainClass findNodeBefore(NodeMainClass currNode)
	 {
		 /*This is the method I wrote to allow for insertBefore to work*/
		 NodeMainClass startNode = head;
		 while (startNode != null)
		 {
			 if(startNode.next != currNode)
			 {
				 startNode = startNode.next;
			 }
			 else
			 {
				 return startNode;
			 }
		 }
		 return startNode;
	 }
	 public void delete(int currValue)
	 {
		 /*Come to think of it, I probably could've made this work with my
		  findNodeBefore method */
		 NodeMainClass currNode = head;
		 NodeMainClass priorNode = head;
		 while (currNode != null)
		 {
			 if (currNode.value == currValue)
			 {
				 if (currNode == head)
				 {
					 currNode.next = head;
					 currNode = null;
				 }
				 else if (priorNode != null)
				 {
					 priorNode.next = currNode.next;
					 currNode = null;
				 }
				 break;
			 }
			 priorNode = currNode;
			 currNode = currNode.next;
			 
		 }
	 }
	 public void remove(int value)
	 {
		 /*Rewritten to pass the second-to-last node in list instead of tail */
		NodeMainClass removeNode = search(10);
		if (removeNode != null)
		{
			removeNode.next = null;
		}
	 }
	 public NodeMainClass search (int currValue)
	 {
		 /*This was originally a boolean, but it was rewritten when it
		  wouldn't work. */
		 NodeMainClass currNode = head;
		 while (currNode != null)
		 {
			 if (currNode.value != currValue)
			 {
				 currNode = currNode.next;
			 }
			 else
			 {
				 return currNode;
			 }
		 }
	     return null;
	 }
	 public int length()
	 {
		 NodeMainClass nodeCount = head;
		 while (nodeCount.next != null)
		 {
			 listLength = listLength + 1;
			 nodeCount = nodeCount.next;
		 }
		 if (nodeCount.next == null)
		 {
			 listLength = listLength + 1;
		 }
		 return listLength;
	 }
	 public boolean isEmpty()
	 {
		 if (head == null && tail == null)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 public void sort()
	 {
		 /* The algorithm used is insertion sort, modified to 
		  work with nodes. */
		    NodeMainClass currNode = head;
		    NodeMainClass nodeAfter = head.next;
		    int counter = listLength;
		    	while (counter < listLength) {
		    		if (currNode.value > currNode.next.value)
		    		{
		    			currNode.next = nodeAfter.next;
		    			nodeAfter.next = currNode;
		    			currNode = currNode.next;
		    			counter++;
		    		}
		    	}
		    }
	 
	 public void print()
	 {
		 NodeMainClass currNode = head;
		 while (currNode.next != null)
		 {
			 
			 System.out.println(currNode.value + " ");
			 currNode = currNode.next;
		 }
		 /* Last node reached  */
		 if (currNode.next == null)
		 {
			 System.out.println(currNode.value);
		 }
	 }
	 /*Coding is a lot like solving a puzzle. And I like solving puzzles, but these puzzles
	  can get a bit too much. */
}
