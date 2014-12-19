package com.liangsworld.bst;

/**
 * Created with IntelliJ IDEA.
 * User: liliang
 * Date: 12/19/14
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class BSTFunctions {


	int counter = 0;

	public void resetCounter(){
		counter = 0;
	}

	private BSTNode targetNode = null;

	public void resetTargetNode(){
		targetNode = null;
	}

	//print kth smallest
	void printKthSmallest(BSTNode node, int k){
		if (node == null)
			return;

		printKthSmallest(node.getLeft(), k);

		if(++ counter == k)
			System.out.println(String.format("%d -th smallest is %d", k, node.getValue()));

		printKthSmallest(node.getRight(), k);
	}

	//print kth smallest
	BSTNode getKthSmallest(BSTNode node, int k){
		if (node == null)
			return null;
		else{
			getKthSmallest(node.getLeft(), k);

//			if(targetNode == null && ++counter == k)
			if(++counter == k)
				return node;

//			return getKthSmallest(node.getRight(), k);
			return getKthSmallest(node.getRight(), k);
		}
//
//		if(++ counter == k)
//			targetNode = node ;
//
//		getKthSmallest(node.getRight(), k);
//
//		return targetNode;
	}


	//print kth largest


}
