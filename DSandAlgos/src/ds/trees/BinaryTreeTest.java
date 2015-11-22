package ds.trees;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		BinaryTree bt=new BinaryTree();
		bt.insert(5);
		bt.insert(6);
		bt.insert(7);
		bt.insert(8);
		bt.insert(9);
		bt.insert(22);
		bt.insert(52);
		bt.insert(53);
		bt.insert(54);
     System.out.println(size(bt.root));		
		
		
	}

	public static int size(BinaryTreeNode root){
		if(root==null)
			return 0;
		int leftCount=size(root.left);
		int rightCount=size(root.right);
		return 1+leftCount+rightCount; 
		
	}
	
}
