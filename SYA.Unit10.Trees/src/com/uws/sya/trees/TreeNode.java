package com.uws.sya.trees;


/**
 * 
 * @author 77800577
 */
public class TreeNode {
    // package access members
   TreeNode leftNode; // left node  
   Comparable payload; // node value
   TreeNode rightNode; // right node

   // constructor initializes data and makes this a leaf node
   public TreeNode( Comparable nodeData )
   { 
      payload = nodeData;              
      leftNode = rightNode = null; // node has no children
   } // end TreeNode no-argument constructor

   public Comparable getPayload(){
        return payload;
   }
   
   public TreeNode getLeftNode(){
       return leftNode;
   }
   
   public TreeNode getRightNode(){
       return rightNode;
   }
   
   
   
   // Based on Slide 4-9.  
   //locate insertion point and insert new node; ignore duplicate values
   //Different to slide 4, creation of new node is defferd until adequate possition is found.
   public TreeNode insert(Comparable insertValue )
   {
      // insert in left subtree
      if ( insertValue.compareTo(payload) < 0 ) 
      {  
         if ( this.leftNode == null ) {
            this.leftNode = new TreeNode( insertValue );
         }
         else
        	 this.leftNode = this.leftNode.insert( insertValue ); 
      } 
      else if ( insertValue.compareTo(payload) > 0 ) // insert in right subtree
      {
          
         if ( this.rightNode == null )
        	 this.rightNode = new TreeNode( insertValue );
         else
        	 this.rightNode = this.rightNode.insert( insertValue ); 
      } 
      // else if (insertValue.compareTo(payload) == 0) TODO make a test case to see what happens, then complete the code.
      return this;
   } 
}
  