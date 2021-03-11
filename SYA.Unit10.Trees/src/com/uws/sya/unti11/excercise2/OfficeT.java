package com.uws.sya.unti11.excercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class OfficeT {
	
	 
	 WorkerNode root;
	 
	
	
	OfficeT(String newWorkerName) throws Exception{
		addWorker(newWorkerName,null);
	}
	
	private boolean isIttheFirstofTheHierarchy(WorkerNode managerName) {
		if ( (this.root == null) && (managerName == null)) 
			return true;
		else
			return false;
	}
	
	//add worker to the Tree
	public void addWorker(String newWorkerName, WorkerNode managerName) throws Exception  {        		
		WorkerNode newWorkerNodeToAddTotheHierarchy = null;
			if (this.isIttheFirstofTheHierarchy(managerName)) {
				 newWorkerNodeToAddTotheHierarchy=new WorkerNode(newWorkerName,null);
				 root = newWorkerNodeToAddTotheHierarchy;
			}
			else {
				WorkerNode toAdd = new WorkerNode(newWorkerName, managerName);
				 root.addSubordinate(toAdd, managerName);
			}	
			
		
		}
		
	
	
		
		
		//findWorker
		WorkerNode findWorker(String name) throws Exception{
			WorkerNode pointerToFoundObject = null;
			if (this.root.getName().equals(name)) {
				pointerToFoundObject = this.root;
			}
			else {
				pointerToFoundObject = this.root.findWorker(name);
			}
			return pointerToFoundObject;
			
			
		}
		
		
		

		public WorkerNode getRoot() {
			
			return this.root;
		}
	   
}
		
		
		

