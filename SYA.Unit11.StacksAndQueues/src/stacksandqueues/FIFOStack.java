package stacksandqueues;


//FIFO First in - First Out Stack
//FIFO are a special type of  Stackes called Queue.
public class FIFOStack implements IStack {
	private StackNode top;
	
	public FIFOStack() {
		top = null;
		
	} 
	
	public void push(Object o) {
		if (top == null) {
			StackNode newNode = new StackNode(o);
			top = newNode;
		}
		else {
			StackNode newNode = new StackNode(o);
			top.setNext(newNode);
		}
		
	}
	
	public Object pop() {
		if (top == null) {
			return null;
		}
		else {
			Object toPop = top.getData();
			top = top.getNext();
			return toPop;
		}	
	}
	
	
	
}
