package com.uws.sya.trees;

import java.util.ArrayList;

/*
 * This Tree implementationis based on Java: How to Program, 8th Edition 8th edition 
 * by Harvey M. Deitel, Paul J. Deitel (2009) Paperback
 * Amazon Link: https://amzn.to/2Sne1ff
 * I have modified it to support Generics to enable the
 * comparison to SharableTree Structure
 *
 * @author 77800577
 */
public class Tree {
    private TreeNode root;

   // constructor initializes an empty Tree of integers
   public Tree() 
   { 
      root = null; 
   } 

   public TreeNode getRoot(){
       return root;
   }
   
   /*
    *  Recursion is the best  alternative for managing trees.
    *  Unless this is the first node (root = null). Responsability for insert is delegated to  TreeNode
    */
   public void insertNode( Comparable insertValue )
   {
      if ( root == null )
         root = new TreeNode( insertValue ); // create the root node here
      else
         root = root.insert( insertValue ); // call the insert method
   } 

   /*
    *  Again recursion is present with a public method as head and a private recursive method that
    *  does the work
    */
   public boolean contains (Comparable value)
   { 
      return containsHelper( root , value); 
   } 

   // recursive method to perform preorder traversal
   private boolean containsHelper( TreeNode node, Comparable value )
   {
      if ( node == null ){
         return false;
      }
      else if (node.getPayload().equals(value)){
          return true;
      }
      else{
          return containsHelper( node.leftNode, value )
                  || containsHelper( node.rightNode, value ); 
      }

     
   } 

   /*
    *  Inorder traversal
    */
   public ArrayList inorderTraversal()
   { 
	   ArrayList inOrder = new ArrayList();
       inorderHelper( root, inOrder );
       return inOrder;
   } // end method inorderTraversal

   // recursive method to perform inorder traversal
   private void inorderHelper( TreeNode node, ArrayList list )
   {
      if ( node == null )
         return;

      inorderHelper( node.getLeftNode(), list );        // traverse left subtree
      list.add(node.getPayload());// output node data
      inorderHelper( node.getRightNode(), list );       // traverse right subtree
   } // end method inorderHelper

   /*
    *  begin postorder traversal
    */
   public ArrayList postorderTraversal()
   { 
	   ArrayList postOrder = new ArrayList();
	   postorderHelper( root, postOrder );
	   return postOrder;
   } 

   // recursive method to perform postorder traversal
   private void postorderHelper( TreeNode node , ArrayList list )
   {
      if ( node == null )
         return;
  
      postorderHelper( node.getLeftNode(), list );      // traverse left subtree
      postorderHelper( node.getRightNode(), list );     // traverse right subtree
      list.add(node.getPayload());// output node data
   } // end method postorderHelper
   
   public ArrayList preorderTraversal() {
	   
	   ArrayList preOrder = new ArrayList();
	   preorderHelper(root, preOrder);
	   return preOrder;
   }
   
   private void preorderHelper( TreeNode node,ArrayList list )
   {
	      if ( node == null )
	         return;
	  
	      list.add(node.getPayload());// output node data
	      postorderHelper( node.getLeftNode(), list );      // traverse left subtree
	      postorderHelper( node.getRightNode(), list );     // traverse right subtree
	      
   } 
   
   
   /**
    * Balancing a tree at insert can be costly as the algorithm is unaware of the contents of the
    * opposing branches.
    * This strategy to balancing extracts teh tree into an array before prociding to inserting 
    * (in order) into a new tree.
    * @return
    */
   public Tree balance() {
	   ArrayList<Comparable> aux = new ArrayList<Comparable>();
	   aux = BalanceHelper_GetListOfElements(root, aux);
	   
	   Comparable[] array = new Comparable[aux.size()]; 
	   aux.toArray(array);
	   
	   int midPoint = array.length / 2;
	   
	   Tree balanced = blancedHelper_InsertElementsIntoNewTree(array, midPoint);
	   
	   return balanced;
	   
   }

	private Tree blancedHelper_InsertElementsIntoNewTree(Comparable[] array, int midPoint) {
		Tree balanced = new Tree();
	   balanced.insertNode(array[midPoint]);
	   
	   
	   for (int i = midPoint +1; i < array.length; i++) {
		   balanced.insertNode(array[i]);
	   }
	   for (int i = 0; i< midPoint; i++) {
		   balanced.insertNode(array[i]);
	   }
		return balanced;
		 
	}

   private ArrayList<Comparable> BalanceHelper_GetListOfElements(TreeNode node, 
		   										ArrayList<Comparable> aux) {
			
	   	if ( node != null ) {
         BalanceHelper_GetListOfElements( node.getLeftNode(), aux );        // traverse left subtree
         aux.add(node.getPayload()); // output node data
         BalanceHelper_GetListOfElements( node.getRightNode(), aux );       // traverse right subtree
		}
			
	    return aux;
   	}
   
   public boolean isEmpty() {
	   return this.root == null;
   }
   
}