package com;

public class Runner {

	public static void main(String[] args) {

		BinaryTree<Integer> BinaryTree = new BinaryTree<>();

		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(3);
		BinaryTree.add(22);
		BinaryTree.add(40);
		BinaryTree.add(11);
		BinaryTree.add(16);
		BinaryTree.add(60);
		BinaryTree.add(95);
		BinaryTree.add(65);
		BinaryTree.add(67);
		BinaryTree.add(63);
		BinaryTree.add(70);
		BinaryTree.displayNode();
		BinaryTree.getSize();
		System.out.println("Size of the tree is : " +BinaryTree.getSize());
		BinaryNode<Integer> searchResult = BinaryTree.searchNode(70);
		if (searchResult == null) {
			System.out.println("Node not present in Binary Tree");
		} else {
			System.out.println("Node is present in Binary Tree :" + searchResult.getKey() + " found");
		}
	}
}
