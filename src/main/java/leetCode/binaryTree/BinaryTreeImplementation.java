package leetCode.binaryTree;

public class BinaryTreeImplementation {

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.add(15);
		bt.add(20);
		bt.add(9);
		bt.add(32);
		bt.add(7);
		
		System.out.println(bt.inOrderTraversal());
		System.out.println(bt.preOrderTraversal());
		System.out.println(bt.postOrderTraversal());

	}

}
