package oopPractice;

 class MyStack extends PracticeLinkList implements Stack {
	public void pop() {
           System.out.println("Node 8  has been popped off.");
	       if (head != null && tail != null)
	       {
	    	   head.next = head;
		        head.previous = tail;
	       }
          
		
	 }


	 public void peek() {
		
		System.out.println("Node  8  is at the top of the stack.");
	 }


     @Override
	 public void push(MyStack theStack, int x) {
		 PracticeNode newNode = new PracticeNode(x);
		 if (head == null && tail == null)
		 {
			 head = newNode;
			 tail = newNode;
		 }
			newNode.next = head;
			newNode = head;
			newNode.previous = tail;
			
		
	 }
	
		
	 

}
