package arrayLL;

public class ArrayMain {
	
	public static void main(String[] args) {
		
		ArrayList theList = new ArrayList(10);
		theList.fill();
		theList.append(4);
		theList.prepend(7);
		theList.insertAt(11, 2);
		theList.removeAt(6);
		theList.search(4);
		theList.sort();
		theList.print();
		System.out.println("Final list");
	}

}
