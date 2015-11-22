package ds.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

	
	
	
	public void preOrder(BinaryTreeNode root){
		if(root==null)
			  return;
	ArrayList<Integer> al=new ArrayList<Integer>();	
	Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
	s.push(root);
	while(!s.isEmpty()){
		BinaryTreeNode current=s.pop();
		al.add(current.data);
		if(current.right!=null)
			s.push(current.right);
		if(current.left!=null)
			s.push(current.left); 
		
	}
	
		
	}
	
	public void inOrder(BinaryTreeNode root){
      ArrayList<Integer> al=new ArrayList<Integer>();
		if(root==null)
			  return;
		Stack<BinaryTreeNode> s=new Stack<BinaryTreeNode>();
		BinaryTreeNode currentNode=root;
		boolean done=false;
		while(!done){
			if(currentNode!=null){
				s.push(currentNode);
				currentNode=currentNode.left;
			}else{
				if(s.isEmpty()){
					done=true;
				}else{
					currentNode=s.pop();
					al.add(currentNode.data);
					currentNode=currentNode.right;
				}
			}
		}
		
	}
	
	public void postOrder(BinaryTreeNode root){
		if(root==null)
		  return;	
		Stack<BinaryTreeNode> s1=new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> s2=new Stack<BinaryTreeNode>();
		s1.push(root);
		while(!s1.isEmpty()){
			BinaryTreeNode current=s1.pop();
			s2.push(current);
			if(current.left!=null)
				s1.push(current.left);
			if(current.right!=null)
				s1.push(current.left);
		}
		
	}
	
	
	public void levelOrderTraversal(BinaryTreeNode root){
		Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			 root=q.poll();
			System.out.println(root.data);
			if(root.getLeft()!=null){
				q.add(root.left);
			}
			if(root.right!=null){
				q.add(root.right);
			}
		}	
	}
	
	
/*
 *   we need to two stacks
 *   
 */
	public void spiralOrderTraversal(BinaryTreeNode root){
		if(root==null)
			  return;	
			Stack<BinaryTreeNode> s1=new Stack<BinaryTreeNode>();
			Stack<BinaryTreeNode> s2=new Stack<BinaryTreeNode>();
			ArrayList<Integer> al=new ArrayList<Integer>();	

			s1.push(root);
			while(!s1.isEmpty()||!s2.isEmpty()){
				
				while(!s1.isEmpty()){
					root=s1.pop();
					al.add(root.getData());
				if(root.left!=null)
					s2.push(root.left);
				if(root.right!=null)
					s2.push(root.right);
				
				}
				
				while(!s2.isEmpty()){
						root=s2.pop();
						al.add(root.getData());
					if(root.right!=null)
						s1.push(root.right);
					if(root.left!=null)
						s1.push(root.left);
				}
				
				
			}
	}
	/*
	 * Queue and stack
	 */
	public void reverseLevelOrderTraversal(BinaryTreeNode root){
		Stack<BinaryTreeNode> s1=new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> q=new LinkedList<BinaryTreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			BinaryTreeNode current=q.poll();
			s1.push(current);
			if(current.right!=null)
				q.add(current.right);
			if(current.left!=null)
				q.add(current.left);
		}
		
		//print stack;
	}
}
