package com.studyplan.algorithmsone.medium;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/solution/
public class PerfectBinaryTree {

	static Node root;

	public static void main(String[] args) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		PerfectBinaryTree tree_level = new PerfectBinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.connect(root);

	}

	public Node connect(Node root) {

		if (root == null) {
			return root;
		}

		// Initialize a queue data structure which contains
		// just the root of the tree
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(root);

		// Outer while loop which iterates over
		// each level
		while (Q.size() > 0) {

			// Note the size of the queue
			int size = Q.size();

			// Iterate over all the nodes on the current level
			for (int i = 0; i < size; i++) {

				// Pop a node from the front of the queue
				Node node = Q.poll();

				// This check is important. We don't want to
				// establish any wrong connections. The queue will
				// contain nodes from 2 levels at most at any
				// point in time. This check ensures we only
				// don't establish next pointers beyond the end
				// of a level
				if (i < size - 1) {
					node.next = Q.peek();
				}

				// Add the children, if any, to the back of
				// the queue
				if (node.left != null) {
					Q.add(node.left);
				}
				if (node.right != null) {
					Q.add(node.right);
				}
			}
		}

		// Since the tree has now been modified, return the root node
		return root;
	}

}

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
};
