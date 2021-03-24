package queue;


//Data Structure Needed to Create Stacks
//Notice  any difference between this one and the  oneneeedfor the lists
public class StackNode {
	private Object data;
	private StackNode next;

	public StackNode(Object o, StackNode nextNode) {
		data = o;
		this.next = nextNode;
	}

	
	public StackNode(Object o) {
		data = o;
	}

	public Object getData() {
		
		return data;
	}

	public StackNode getNext() {
		return this.next;
	}


	public void setNext(StackNode newNode) {
		if (this.next == null) {
			this.next = newNode;
		}
		else {
			this.next.setNext(newNode);
		}
	}

}
