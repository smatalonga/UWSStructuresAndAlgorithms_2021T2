package com.uws.sya.trees;

public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree aTree = new Tree();
		aTree.insertNode(4);
		aTree.insertNode(2);
		aTree.insertNode(8);
		aTree.insertNode(10);
		aTree.insertNode(9);
		
		
		System.out.println("Preorder");
		System.out.println(aTree.preorderTraversal());
		System.out.println("\n");
		System.out.println("In order");
		System.out.println(aTree.inorderTraversal());
		System.out.println("\n");
		System.out.println("post order");
		System.out.println(aTree.postorderTraversal());
		
		//TestBalaned(aTree);
		
	}

	private static void TestBalaned(Tree aTree) {
		System.out.println("\nBalanced");
		Tree copy = aTree.balance();
		
		System.out.println("Preorder");
		copy.preorderTraversal();
		System.out.println("\n");
		System.out.println("In order");
		copy.inorderTraversal();
		System.out.println("\n");
		System.out.println("post order");
		copy.postorderTraversal();
		
	}

}
