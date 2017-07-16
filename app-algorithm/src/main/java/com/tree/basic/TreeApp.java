package com.tree.basic;

public class TreeApp {
	public static void main(String[] args) {
		Tree theTree = new Tree();
		
		theTree.insert(50, 1.5);
		theTree.insert(25, 1.7);
		theTree.insert(70, 1.9);
		
		Node found = theTree.find(25);
		if(found!=null){
			System.out.println("found 25");
		}else{
			System.out.println("not find");
		}
	}
}
