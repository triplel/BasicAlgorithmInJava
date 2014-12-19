package com.liangsworld.bst;

/**
 * Created with IntelliJ IDEA.
 * User: liliang
 * Date: 12/19/14
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class BSTNode {

	int value;
	BSTNode left, right;

	public BSTNode(int value){
		this.value = value;
	}

	public BSTNode(int value, BSTNode left, BSTNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}



}
