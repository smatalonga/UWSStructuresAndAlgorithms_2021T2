package com.uws.sya.unti11.excercise2;

import java.util.LinkedList;
import java.util.List;


public class WorkerNode {

	private WorkerNode bossName;
	private String name;
	private WorkerNode subordinate;
	private WorkerNode peer;
    
    //Constructor
    public WorkerNode(String name,WorkerNode boss) {    
	        this.name = name;
	        //boss
	        this.bossName=boss;
    }

	public void addSubordiante(String newWorkerName) {
		// TODO Auto-generated method stub
		
	}

	public Object getName() {
		
		return this.name;
	}

	public WorkerNode getBoss() {
		return this.bossName;
	}

	public WorkerNode getSubordinates() {
		
		return this.subordinate;
	}

	public WorkerNode getPeers() {
		return this.peer;
	}
	
	
	public void addPeer(WorkerNode newPeer, WorkerNode inmediateBoss) {
		if (this.peer == null) {
			this.peer = newPeer;
			newPeer.setBoss(inmediateBoss);
			
		}
		else {
			this.peer.addPeer(newPeer, inmediateBoss);
		}
	}
	
	private void setBoss(WorkerNode inmediateBoss) {
		this.bossName = inmediateBoss;
		
	}

	public void addSubordinate(WorkerNode newSubordiante, WorkerNode inmediateBoss) {
		if (this.subordinate == null) {
			this.subordinate = newSubordiante;
			newSubordiante.setBoss(inmediateBoss);	
		}
		else {
			this.subordinate.addPeer(newSubordiante, inmediateBoss);//REcursion thorugh Peer nodes
		}
	}

	public WorkerNode findWorker(String nametoFind) {
		if (this == null) {
			return this;
		}
		else if (this.name.equals(nametoFind)) {
			return this;
			
		}
		else {
			WorkerNode pointerToFoundObject = this.findInSubordinats(nametoFind);
			if (pointerToFoundObject == null) {
				pointerToFoundObject = this.findInPeers(nametoFind);
			}
			return pointerToFoundObject;
		}
	}

	private WorkerNode findInPeers(String nametoFind) {
		// TODO Auto-generated method stub
		return null;
	}

	private WorkerNode findInSubordinats(String nametoFind) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
		
		
}
