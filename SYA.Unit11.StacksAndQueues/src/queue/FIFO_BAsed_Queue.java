package queue;


//TODO: A queue  can be implemented using the FIFO ADT in thispackge (or implemented from scratch)
//See slides 14-21
public class FIFO_BAsed_Queue implements iQueue {
	private FIFOStack queueImpl;
	
	public FIFO_BAsed_Queue() {
		this.queueImpl = new FIFOStack();
	}
	
	@Override
	public void enqueue(Object o) {
		this.queueImpl.push(o);
	}
	
	@Override
	public Object dequeue() {
		return this.queueImpl.pop();
	}
}
