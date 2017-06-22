public class NodeData {
	int data;
	
	public NodeData(int num) {
		data = num;
	}
	
	public int isCompareTo(NodeData nd) {
		if(this.data == nd.data) return 0;
		else if(this.data < nd.data) return -1;
		else {
			return 1;
		}
	}
	
	public String toString() {
		return data + "";
	}
}