package com.liangsworld.bst;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: liliang
 * Date: 12/19/14
 * Time: 11:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestKthNode {

	BSTNode root;
	BSTFunctions functions;

	@Before
	public void setUp(){
		constructBST();
		functions = new BSTFunctions();
	}

	@Test
	public void testPrintKthSmallest(){
		functions.printKthSmallest(root,1);
		functions.resetCounter();
		functions.printKthSmallest(root,3);
		functions.resetCounter();
		functions.printKthSmallest(root,6);
		functions.resetCounter();
	}

	@Test
	public void testGetKthSmallest(){
//		Assert.assertEquals(functions.getKthSmallest(root,1).getValue(), 2);
//		functions.resetTargetNode();
		Assert.assertEquals(functions.getKthSmallest(root,3).getValue(), 18);
		functions.resetTargetNode();
//		Assert.assertEquals(functions.getKthSmallest(root,6).getValue(), 48);
//		functions.resetTargetNode();
//		Assert.assertEquals(functions.getKthSmallest(root,8).getValue(), 65);
//		functions.resetTargetNode();
//		Assert.assertEquals(functions.getKthSmallest(root,13).getValue(), 123);
//		functions.resetTargetNode();
	}

	private void constructBST(){
		BSTNode node1 = new BSTNode(2);
		BSTNode node2 = new BSTNode(18);
		BSTNode node3 = new BSTNode(12);
		BSTNode node4 = new BSTNode(38);
		BSTNode node5 = new BSTNode(43);
		BSTNode node6 = new BSTNode(48);
		BSTNode node7 = new BSTNode(52);
		BSTNode node8 = new BSTNode(83);
		BSTNode node9 = new BSTNode(71);
		BSTNode node10 = new BSTNode(65);
		BSTNode node11 = new BSTNode(79);
		BSTNode node12 = new BSTNode(152);
		BSTNode node13 = new BSTNode(99);
		BSTNode node14 = new BSTNode(123);
		BSTNode node15 = new BSTNode(291);

		node3.setLeft(node1);
		node3.setRight(node2);
		node4.setLeft(node3);
		node4.setRight(node5);
		node5.setRight(node6);
		node7.setLeft(node4);
		node7.setRight(node8);
		node8.setLeft(node9);
		node8.setRight(node12);
		node9.setLeft(node10);
		node9.setRight(node11);
		node12.setLeft(node13);
		node12.setRight(node15);
		node13.setRight(node14);

		root = node7;
	}
}
