package leetCode.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	BinaryTree(int val) {
		root = new Node(val);
	}

	private Node insertNode(Node root, int val) {

		if (root == null) {
			return new Node(val);
		}

		if (root.val > val) {
			root.left = insertNode(root.left, val);
		}

		if (root.val < val) {
			root.right = insertNode(root.right, val);
		}
		return root;

	}

	public void add(int val) {
		root = insertNode(root, val);
	}

	// left root right
	public List<Integer> inOrderTraversal() {
		Stack<Node> stack = new Stack<Node>();
		List<Integer> listInOrder = new ArrayList<>();
		if (root == null) {
			return listInOrder;
		}

		Node current = root;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;

			}
			current = stack.pop();
			listInOrder.add(current.val);
			current = current.right;
		}

		return listInOrder;
	}

	// root left right
	public List<Integer> preOrderTraversal() {
		Stack<Node> stack = new Stack<Node>();
		List<Integer> listInOrder = new ArrayList<>();
		if (root == null) {
			return listInOrder;
		}

		Node current = root;
		stack.push(current);
		while (!stack.isEmpty()) {
			current = stack.pop();
			listInOrder.add(current.val);
			if(current.right != null) {
			stack.push(current.right);
			}
			if(current.left != null) {
				stack.push(current.left);
			}
		}

		return listInOrder;
	}
	
	// left right root
		public List<Integer> postOrderTraversal() {
			Stack<Node> stack = new Stack<Node>();
			List<Integer> listPostOrder = new ArrayList<>();
			if (root == null) {
				return listPostOrder;
			}

			Node current = root;
			while (current != null || !stack.isEmpty()) {
				while(current != null) {
					if(current.right != null) {
						stack.push(current.right);
					}
					if(current.left != null) {
						stack.push(current.left);
					}
				}
				current = stack.pop();
				listPostOrder.add(current.val);
			}

			return listPostOrder;
		}

}
