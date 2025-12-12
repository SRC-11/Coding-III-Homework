package oopPractice;


public class PracticeLinkList {
	
	public static PracticeNode head;
	public static PracticeNode tail;
	public static int listLength;
	
	public PracticeLinkList()
	{
		head = null;
		tail = null;
	}
	
	public void append(PracticeNode node)
	{
		if(PracticeLinkList.head == null)
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
	public void prepend (PracticeNode node)
	{
		if(PracticeLinkList.head == null)
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
	 public void insertAfter(int currValue, PracticeNode newNode)
     {
		 PracticeNode containsNode = search(currValue);
		 PracticeNode nodeAfter = containsNode.next;
		 if(PracticeLinkList.head == null)
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
	 public void insertBefore(PracticeNode newNode, PracticeNode currNode)
	 { 
		 PracticeNode nodeBefore = currNode.previous;
		 if(PracticeLinkList.head == null)
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
		PracticeNode removeNode = search(value);
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
		 PracticeNode removeNode = search(value);
		 PracticeNode priorNode = removeNode.previous;
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
	 public PracticeNode search (int currValue)
	 {
		
		 PracticeNode currNode = head;
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
		 PracticeNode nodeCount = head;
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
	
	 public void sort()
	 {
		
			/* Selection sort used. Hopefully. */
		    PracticeNode startNode = head;
		    boolean reachedEnd = false;
			PracticeNode currNode = startNode.next;
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
		 PracticeNode currNode = head;
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
