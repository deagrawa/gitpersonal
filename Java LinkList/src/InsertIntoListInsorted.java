import java.util.Scanner;

public class InsertIntoListInsorted {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int item = in.nextInt();
		LinkListDeag ll = new LinkListDeag();
		while (item!=0) {
			ll.addInPlace(new NodeData(item));
			item = in.nextInt();
		}
		in.close();
		ll.printList();
	}

}



	
