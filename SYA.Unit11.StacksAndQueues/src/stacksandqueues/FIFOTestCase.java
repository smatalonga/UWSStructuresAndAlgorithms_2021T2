package stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FIFOTestCase {

	@Test
	void test() {
		//Using integer data to test
		Integer o1 = 1;
		Integer o2 = 2;
		Integer o3 = 3;
		Integer o4 = 4;
		
		IStack stack = new FIFOStack();
		
		assertNull(stack.pop());
		
		stack.push(o1);
		stack.push(o2);
		stack.push(o3);
		stack.push(o4);
		
		assertEquals(new Integer(1), stack.pop());
		assertEquals(new Integer(2), stack.pop());
		assertEquals(new Integer(3), stack.pop());
		assertEquals(new Integer(4), stack.pop());
	}

}
