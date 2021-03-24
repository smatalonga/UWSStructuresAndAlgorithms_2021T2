package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestQueues {

	@Test
	void testArrayBasedQueue() throws ArrayException {
		Integer one = new Integer(1);
		String secondItem = "SecondItem";
		Integer three = 3;
		
		iQueue queue = new ArrayQueue(3);
		
		queue.enqueue(one);
		queue.enqueue(secondItem);
		queue.enqueue(three);
		
		
		assertEquals(new Integer(1), (Integer) queue.dequeue());
		assertEquals("SecondItem", (String) queue.dequeue());
		assertEquals(new Integer(3), (Integer) queue.dequeue());
		
		
	}
	
	@Test
	void testFifoBasedQueue() throws ArrayException {
		Integer one = new Integer(1);
		String secondItem = "SecondItem";
		Integer three = 3;
		
		iQueue queue = new FIFO_BAsed_Queue();
		
		queue.enqueue(one);
		queue.enqueue(secondItem);
		queue.enqueue(three);
		
		
		assertEquals(new Integer(1), (Integer) queue.dequeue());
		assertEquals("SecondItem", (String) queue.dequeue());
		assertEquals(new Integer(3), (Integer) queue.dequeue());
		
		
	}
	
	/*
	 * not planning to show this in class, this
	 * algorithm is the complicated bit of the arraybased implementation
	 * I FELT I needed to test it to be sure it is working.
	 * Notice that the test before does not execute this code.
	 */
	@Test
	void testCircularTopTailInArrayBasedQueue() throws ArrayException {
		Integer one = new Integer(1);
		Integer two = 2;
		Integer three = 3;
		Integer four = 4;
		
		iQueue queue = new ArrayQueue(3);
		
		queue.enqueue(one);
		queue.enqueue(two);
		
		assertEquals(new Integer(1), (Integer) queue.dequeue());
		
		queue.enqueue(three);
		queue.enqueue(four);
		
		
		
		assertEquals(new Integer(2), (Integer) queue.dequeue());
		assertEquals(new Integer(3), (Integer) queue.dequeue());
		assertEquals(new Integer(4), (Integer) queue.dequeue());
	}

	/*
	 * Regarding the assert failing to execut today.
	 * I did not have a Test Case that produed the combinations needed to execute that code
	 * The line: assert(this.top  == 50);  in Enqueue is  commented to allow the test to pass.
	 * Un comment it to see the behaviour-
	 * 
	 * Also, Make sure you have  the compiler check for assertions. see:
	 * https://stackoverflow.com/questions/5509082/eclipse-enable-assertions
	 * 
	 * Finally see the code below, the trycatch statement.
	 * Exceptions are not expected in that code. Theerefore, I catch  it and force a "fail".
	 *  
	 */
	@Test
	void TestQueueFull()  {
		Integer one = new Integer(1);
		String secondItem = "SecondItem";
		Integer three = 3;
		
		iQueue queue = new ArrayQueue(3);
		
		try {
			queue.enqueue(one);
			queue.enqueue(secondItem);
			queue.enqueue(three);
		}
		catch(ArrayException ae) {
			fail("Should not  throw exception until its full");
		}
		
		//This line tells JUnit to expect the exception 
		Assertions.assertThrows(ArrayException.class, () -> {
			queue.enqueue(new Integer(4));
		  });
		
		
		
		
		
		
	}
}
