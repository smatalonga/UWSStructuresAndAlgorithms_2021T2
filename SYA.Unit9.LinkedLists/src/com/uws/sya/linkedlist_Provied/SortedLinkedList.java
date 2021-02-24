package com.uws.sya.linkedlist_Provied;
// this is a cut down version of the class specifically for the Linear Search test
// the complete version is in the Library folder on Moodle
// 
public class SortedLinkedList implements SortedADT {

   private ListNode head;

    /* algorithm
    set up a string to contain the list details
    if list not empty then
        set current node to head of list
        while nodes remain loop
            add the node object to the string
            move to next node
        end loop
    else
        add empty list message to the string
 end if
 */
    
   public String toString() {
       
        String listDetails = new String();
        if (this.head != null) {
            ListNode current = this.head;
            while (current != null) {
                listDetails += current.getObject() + "\n";
                current = current.getNext();
            }
        }
        else{
            listDetails+="list is empty";
        }
        return listDetails;
    }

    public void insert(Comparable object) {
        ListNode newNode = new ListNode(object);
        
        if (isThisTheFirstInsert()) {
            this.head = newNode;
        } 
        else {
            
            this.findPositionAndInsert(object);
            
        }
    }
    
    //

	private void insertNodeAfterPosition(Comparable object, ListNode insertionPosition) {
		
		insertionPosition.setNext(new ListNode(object));
	
	}

	private void findPositionAndInsert(Comparable object) {
		ListNode previous = null;
		ListNode current = this.head;
		boolean insertionPositionFound = false;
		while (!insertionPositionFound) {
            if (current.getNext() == null) {
                if (current.getObject().compareTo(object)>= 0) {
                	this.shiftAndInsert(previous, current, object);
                }
                else {
                	this.insertNodeAfterPosition(object, current);
                }
            	insertionPositionFound = true;
            } else {
            	//previous = current;	
            	current = current.getNext();
                	
            }
		}
		
	}

	private void shiftAndInsert(ListNode previous, ListNode current, Comparable object) {
		ListNode newNode = new ListNode(object);
		newNode.setNext(current);
		if (previous == null) {
			this.head = newNode;
		}
		else {
			previous.setNext(newNode);
		}
		current.setNext(null);
		
		
		
	}

	private boolean isThisTheFirstInsert() {
		return (this.head == null);
	}

	 /* algorithm
    if list empty then
        throw not found exception
    end if
    set current node to head of list
    while object not found loop
        if object matches current node object then
            object found
        else
            if object is less than current object then
                // object is not in the list
                throw not found exception
            else
                if no more objects to compare with then
                    // object is not in the list
                    throw not found exception
                else
                    // move to the next node
                    set the current node to the next node
                end if
            end if
        end if
    end loop
 */
    public Comparable find(Comparable object) throws NotFoundException{
       
        if (isThisTheFirstInsert()) {
            throw new NotFoundException();
        }
        else {
        	Comparable foundObject = null;
            ListNode current = this.head;
            
           while ( (current != null) && (foundObject == null) ){
        	   if (current.getObject().equals(object)) {
        		   foundObject = current.getObject();
        	   }
        	   else {
        		   current = current.getNext();
        	   }
           }
            
            return foundObject;
        }
        
    }
    
    public SortedLinkedList reverse() {
    	SortedLinkedList reversed = new SortedLinkedList();
    	
    	ListNode cursor = this.head;
    	
    	while (cursor != null) {
    		reversed.insertBefore(cursor.getObject());
    		cursor = cursor.getNext();
    	}
    	
    	return reversed;
    	
    }

	private void insertBefore(Comparable object) {
		if (isThisTheFirstInsert()) {
			this.insert(object);
		}
		else {
			ListNode node = new ListNode(object);
			node.setNext(this.head);
			this.head = node;
		}
		
	}

	/*Method added to test reverse
	 * 
	 */
	protected int findIndex(Comparable object) {
		int output = -1;
		int counter = 0;
		
		boolean foundObject = false;
        ListNode current = this.head;
        
       while ( (current != null) && (!foundObject) ){
    	   if (current.getObject().equals(object)) {
    		   output = counter;
    		   foundObject = true;
    	   }
    	   else {
    		   current = current.getNext();
    		   counter++;
    	   }
       }
		
		return output;
	}
    
    

}
