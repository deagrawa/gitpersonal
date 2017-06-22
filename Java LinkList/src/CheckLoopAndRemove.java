
public class CheckLoopAndRemove {
	
	static Node head;
	
	static class Node {		
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		//Add node at the head
		public void push(int data) {
			Node new_node = new Node(data);
			new_node.next = head;
			head = new_node;
		}
		
		@SuppressWarnings("null")
		public boolean detectLoop () {
			Node slow = head;
			Node fast = head;
			
			while(slow != null || fast!= null || fast.next !=null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					removeLoop(slow);
					return true;
				}
			}
			return false;
		}
		
		public void removeLoop(Node slow) {
			
		}
	
 	
	public static void main (String[] args) {
		
		CheckLoopAndRemove loop = new CheckLoopAndRemove();
		loop.push(10);
		loop.push(15);
		loop.push(20);
		loop.push(25);
		loop.push(30);
		loop.push(35);
		
		head.next.next.next.next.next = head.next;
		if(loop.detectLoop()) {
			System.out.println("Dtected loop");
		}
		else {
			System.out.println("No loop");
		}
	}

}
