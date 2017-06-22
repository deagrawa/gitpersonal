
public class StackClass {

	NodeData[] ele;
	int top;
	public final static int MAXCOUNT = 256;
	StackClass() {
		ele = new NodeData[MAXCOUNT];
		top = -1;
	}
	public void push(NodeData data){
		if(top != MAXCOUNT) {
			ele[++top]= data;
		}
	}
	
	public NodeData pop() {
		NodeData temp = null;
		if(top != -1) {
			temp = ele[top--];
		}
		return temp;
	}
	
	public NodeData peek() {
		NodeData temp = null;
		if(top != -1) {
			temp = ele[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		if(this.top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
}
