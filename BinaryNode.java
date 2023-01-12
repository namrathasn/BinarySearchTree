package com;

public class BinaryNode<K extends Comparable<K>> {
	K key;
	public BinaryNode<K> left;// left pointer
	public BinaryNode<K> right;// for right pointer

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
