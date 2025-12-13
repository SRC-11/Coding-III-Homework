package hashPackage;

public class HashMain {
	public static void main(String[] args) {
	HashingTable myTable = new HashingTable();
	myTable.setTable(10);
	myTable.insert(7, 20);
	myTable.remove(6);
	myTable.search(5);
	myTable.resize();
	}
}
