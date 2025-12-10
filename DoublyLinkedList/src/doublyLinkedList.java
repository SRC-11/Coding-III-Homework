package doubleLink;


public class doublyLinkedList {


	public static Node head;
	public static Node tail;
	public static int listLength;
	
	public doublyLinkedList()
	{
		head = null;
		tail = null;
	}
	
	public void append(Node node)
	{
		if(doublyLinkedList.head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			node.next = head;
			node = tail;
		}
	}
	public void prepend (Node node)
	{
		if(doublyLinkedList.head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			node.next = head;
			head.previous = node;
			head = node;
		}
   	
	}
	 public void insertAfter(int currValue, Node newNode)
     {
		 Node containsNode = search(currValue);
		 Node nodeAfter = containsNode.next;
		 if(doublyLinkedList.head == null)
			{
				head = newNode;
				tail = newNode;
			}
  	        
		     else if (containsNode == tail)
  	         {
		    	 tail.next = newNode;
  	        	 newNode.previous = tail;
  	        	tail = newNode;
  	         }
		     else
		     {
		    	 newNode.next = nodeAfter;
		    	 newNode.previous = containsNode;
		    	 containsNode.next = newNode;
		    	 nodeAfter.previous = newNode;
		     }
		
     }
	 public void insertBefore(Node newNode, Node currNode)
	 { 
		 Node nodeBefore = currNode.previous;
		 if(doublyLinkedList.head == null)
			{
				head = newNode;
				tail = newNode;
			}
		 else if (currNode == head)
	         {
	    	 head.previous = newNode;
	        	 newNode.next = head;
	        	head = newNode;
	         }
		 else 
		 {
			 newNode.next = currNode;
			 newNode.previous = nodeBefore;
			 currNode.previous = newNode;
			 nodeBefore.next = newNode;  
		 }
	
	 }
	
	 
	 public void removeAfter(int value)
	 {
		Node removeNode = search(value);
		if (removeNode != null)
		{
			if(removeNode.next == tail )
			{
				removeNode.next = head;
			}
			else
			{
				removeNode.next = removeNode.next.next;
				removeNode.next.previous = removeNode;
			}
		}
	 }
	 public void removeBefore(int value)
	 {
		 Node removeNode = search(value);
		 Node priorNode = removeNode.previous;
		 if (priorNode != null)
			{
			
				if(removeNode.previous == head )
				{
					removeNode.previous = tail;
				}
				else
				{
					priorNode = priorNode.previous;
					removeNode.previous = priorNode;
					priorNode.next = removeNode;
					
				}
			}
		 else
		 {
			 System.out.println("Removal failed.");
		 }
	 }
	 public Node search (int currValue)
	 {
		
		 Node currNode = head;
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
		 Node nodeCount = head;
		 while (nodeCount.next != head && nodeCount.next != null)
		 {
			 listLength = listLength + 1;
			 nodeCount = nodeCount.next;
		 }
		 if (nodeCount.next == head || nodeCount.next == null)
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
		
			/* Selection sort used. Hopefully. */
		    Node startNode = head;
		    boolean reachedEnd = false;
			Node currNode = startNode.next;
			while (reachedEnd != true)
			{
			   
			        if (startNode.value > currNode.value ) {
			        	   currNode.next = startNode;
					       currNode.previous = startNode.previous;
				        	currNode = startNode.next;
			         }
			        currNode = currNode.next;
			        if(currNode == null)
			       {
			    		   startNode = startNode.next;
			    		   currNode = startNode.next;
			       }
			        else if (currNode.next == head)
			        {
			        	startNode = startNode.next;
			        	currNode = startNode.next;
			        }
			       
			        if (startNode.next == head || startNode.next == null)
			        {
			        	reachedEnd = true;
			        }
			        
			 }
			       
			
		 }
	 
	 public void print()
	 {
		 Node currNode = head;
		 if (head == currNode && tail == currNode)
		 {
				 System.out.println(currNode.value + " ");
			    
	     }
		
		 else 
		 {
			 if (currNode != null)
		 {
			 System.out.println(currNode.value);
			 currNode = currNode.next;
		 }
			 while(currNode != null)
		 {
			 System.out.println(currNode.value + " ");
			 currNode = currNode.next;
			 if ( currNode == null || currNode.next == head  )
			 {
				 break;
			 }
		 }
	
		 
	 }
 }
}
