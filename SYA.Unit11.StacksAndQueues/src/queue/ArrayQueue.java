package queue;

//Implementation from Slides 17-20
public class ArrayQueue implements iQueue{
	Object queueImpl[];
	int top;
	int tail;
	
	public ArrayQueue(int queueSize) {
		this.queueImpl = new Object[queueSize];
		this.top = 0;
		this.tail = 0;
	}
	
	/*
	 * Adapted from, Slide 21
	 * 	 */
	@Override
	public void enqueue(Object o) throws ArrayException {
		//if (this.top == this.tail) {
		if (this.queueImpl[tail]!=null) {
			//Full, TOP and Tail are the same number
			assert(this.top == this.tail);
			//assert(this.top  == 50);
			throw new ArrayException();
		}
		else {
			this.queueImpl[this.tail] = o;
			this.tail++;
			if (this.tail == (this.queueImpl.length)) {
				this.tail = 0;
			}
		}
		
	}

	@Override
	public Object dequeue() {
		Object output = this.queueImpl[top];
		this.queueImpl[top] = null;
		this.top++;
		if (this.top == (this.queueImpl.length)) {
			this.top = 0;
		}
		return output;
		
	}

	

}
