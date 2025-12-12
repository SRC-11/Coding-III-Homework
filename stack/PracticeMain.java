package oopPractice;



 class PracticeMain  {


	 public static void main(String[] args) {
			
			
		 MyStack theStack = new MyStack();
			theStack.push(theStack, 10);
			theStack.peek();
			theStack.pop();
			MyQueue theQueue = new MyQueue();
			theQueue.enqueue(theQueue, 8);
			theQueue.front();
			theQueue.dequeue();
			
			
		
			
			
		}


}
