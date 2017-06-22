public class LinkListDeag {
	Node head = null;
	
	
	public void addHead(NodeData nd){
		Node newNode = new Node(nd);
		newNode.next = head;
		head = newNode;
	}
	
	public void addInPlace(NodeData nd) {
		Node newNode = new Node(nd);
		Node curr = head;
		Node pre = null;
		
		while(curr!= null && nd.isCompareTo(curr.data)>0) {
			pre = curr;
			curr = curr.next;
		}
		newNode.next = curr;
		if(pre == null) {
			head = newNode;
		} else {
			pre.next = newNode;
		}
	}
	
	public void printList() {
		Node curr = head;
		while (curr!= null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	
}

class Node {
	NodeData data;
	Node next;
	
	Node(NodeData nd) {
		data = nd;
		next = null;
	}
}
