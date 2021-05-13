package implementations;

class Node {
	int data;
	Node left,right;
	
	public Node(int a){
		data = a;
		left = right =null;
	}
	
	public void insertNode(int x) {
		
		if(this.left == null && this.data>x) {
			this.left = new Node(x);
		} else if(this.right == null && this.data<x) {
			this.right = new Node(x);
		}
		
		if(this.data >x && this.left != null) {
			this.left.insertNode(x);
		} else if(this.data < x && this.right!=null) {
			this.right.insertNode(x);
		} 
	}
}

class BinaryTree  {
	Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	public BinaryTree(int a){
		root  = new Node(a);
	}
	
	public void insert(int x) {
		if(this.root == null) {
			this.root = new Node(x);
			return;
		}
		this.root.insertNode(x);
	}
}

class Traversals {
	public static void main(String args[]) {

		//making binary tree
		
		BinaryTree tree = new BinaryTree();

		
		
//		tree.root.left = new Node(3);
//		tree.root.right = new Node(7);
//		tree.root.left.left = new Node(2);
//		tree.root.left.right = new Node(4);
//		tree.root.right.left = new Node(6);
//		tree.root.right.right = new Node(8);
//		tree.root.left.left.left = new Node(1);
		
		/* 
		 * 				5
		 * 			3		7
		 * 	  	  2   4   6   8
		 * 		1
		 * 
		 */
//		
		tree.insert(6);
		tree.insert(1);
		

		System.out.println("inOrder:");
		inOrder(tree.root);
	}
	
	
	//LNR
	static void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	
	
	//NLR
	static void preOrder(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
		
		
		
	}
	
	
	//LRN
	static void postOrder(Node node) {
		if(node == null) {
			return;
		}
		
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
}
