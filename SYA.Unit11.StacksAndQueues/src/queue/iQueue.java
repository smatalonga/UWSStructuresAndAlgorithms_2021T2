package queue;

public interface iQueue {

	void enqueue(Object o) throws ArrayException;

	Object dequeue();

}