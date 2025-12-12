package oopPractice;

 class MyQueue extends PracticeLinkList implements Queue {
	
	 @Override
	public void enqueue(MyQueue theQueue, int x) {
		 PracticeNode newNode = new PracticeNode(x);
		if(head == null && tail == null)
		{
			newNode = head;
			newNode = tail;
		}
		if (head != null)
		{
			newNode.next = head;
			newNode.previous = tail;
			newNode = tail;
		}
		
			
		
		
	}

	
	
	public void front() {
		
		System.out.println("Node  " + head.value + "  is at the front of the line.");
		
	}
	 
	public void dequeue() {
		System.out.println("Node" + head.value + "  has been dequeued.");
		if (head != null && tail != null)
		{
			head.next = head;
			head.previous = tail;
		}
	
		
	}

  
	


	

}
