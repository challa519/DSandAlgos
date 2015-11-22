package ds.trees;

public class BinaryTree {
	
	public BinaryTreeNode root;
	
	/* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    public BinaryTreeNode insert(BinaryTreeNode node, int data)
    {
    	root=node;
    	BinaryTreeNode prev=null;
        if (node == null){
            node = new BinaryTreeNode(data);
            return node;
            
        } else
        {
        	while(node!=null){
        		prev=node;
	            if (node.getRight() == null && data > node.getRight().data)
	                node=node.getRight();
	            else
	            	 node=node.getLeft();
	        }
        	if(data>prev.data){
        		prev.setRight(new BinaryTreeNode(data));
        	}
        	else{
        		prev.setLeft(new BinaryTreeNode(data));
        	}
            
        }
        return root;
    }     

   public boolean search(BinaryTreeNode root, int data){
	   boolean find=false;
	   if(root==null) return find;
	   while(root!=null){
		   if(root.data==data) return true;
            if(root.getRight()!=null&& data>root.data)
            	 root=root.right;
            else
            	root=root.left;
		   
	   }
	   return find;
   }
    
    public void delete(BinaryTreeNode root, int n, BinaryTreeNode prev){
    	if (root == null)
            return;
    	if(root.data>n){
    		prev=root;
           delete(root.left,n,root);
    	}else if(root.data<n){
    		prev=root;
    		delete(root.right,n,root);
    	}else{
           if(root.getLeft()!=null && root.getRight()!=null){
            	BinaryTreeNode successor = findMax(root.left);
                root.data = successor.data;
                delete(root.left,successor.data,root);
            }else if(root.left==null && root.right ==null){
            	if (prev.left.data==root.data){
            		prev.left=null;
            	}else{
            	   prev.right=null;
            	}
            }else{
            	if(root.right==null){
            		prev.left=root.left;
            	}
            	else{
            		prev.right=root.right;
            	}
            }
        } 
    	
    	
    }
  
   public BinaryTreeNode findMax(BinaryTreeNode root){
           if(root!=null &&root.right!=null){
        	   root=findMax(root.right) ;  
           }
           return root;
   }
    
    
}
