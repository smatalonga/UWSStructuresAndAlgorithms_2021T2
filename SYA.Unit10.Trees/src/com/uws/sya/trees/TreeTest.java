package com.uws.sya.trees;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TreeTest {

	@Test
	void testInsertNode() {
		Tree aTree = new Tree();
		aTree.insertNode(4);
		aTree.insertNode(2);
		aTree.insertNode(8);
		aTree.insertNode(10);
		aTree.insertNode(9);
		
		assertTrue(!aTree.isEmpty());
	}

	@Test
	void testContains() {
		Tree aTree = new Tree();
		aTree.insertNode(4);
		aTree.insertNode(2);
		aTree.insertNode(8);
		aTree.insertNode(10);
		aTree.insertNode(9);
		
		assertTrue(aTree.contains(4));
		assertTrue(aTree.contains(2));
		assertTrue(aTree.contains(8));
		assertTrue(aTree.contains(10));
		assertTrue(aTree.contains(9));
		assertTrue(!aTree.contains(7));
	}

	@Test
	void testInorderTraversal() {
		Tree aTree = new Tree();
		aTree.insertNode(4);
		aTree.insertNode(2);
		aTree.insertNode(8);
		aTree.insertNode(10);
		aTree.insertNode(9);
		
		ArrayList inOrder = aTree.inorderTraversal();
		
		assertEquals(2, inOrder.get(0));
		assertEquals(4, inOrder.get(1));
		assertEquals(8, inOrder.get(2));
		assertEquals(9, inOrder.get(3));
		assertEquals(10, inOrder.get(4));
	}

	@Test
	void testPostorderTraversal() {
		Tree aTree = new Tree();
		aTree.insertNode(4);
		aTree.insertNode(2);
		aTree.insertNode(8);
		aTree.insertNode(10);
		aTree.insertNode(9);
		
		ArrayList postOrder = aTree.postorderTraversal();
		
		assertEquals(2, postOrder.get(0));
		assertEquals(9, postOrder.get(1));
		assertEquals(10, postOrder.get(2));
		assertEquals(8, postOrder.get(3));
		assertEquals(4, postOrder.get(4));
	}

	@Test
	void testPreorderTraversal() {
		Tree aTree = new Tree();
		aTree.insertNode(4);
		aTree.insertNode(2);
		aTree.insertNode(8);
		aTree.insertNode(10);
		aTree.insertNode(9);
		
		ArrayList preOrder = aTree.preorderTraversal();
		
		assertEquals(4, preOrder.get(0));
		assertEquals(2, preOrder.get(1));
		assertEquals(9, preOrder.get(2));
		assertEquals(10, preOrder.get(3));
		assertEquals(8, preOrder.get(4));
	}

}
