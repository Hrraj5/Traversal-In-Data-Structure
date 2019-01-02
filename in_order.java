import java.util.*;


public class in_order {
	static class Node
	{
		int info;
		Node left,right;
		Node(int data)
		{
			info=data;
			left=right=null;
			
		}
	}
		static Node root;
		static Node temp=root;
		static void inorder(Node temp )
		{
			if(temp!=null)
			{
				inorder(temp.left);
				System.out.println(temp.info);
				inorder(temp.right);
				
			}
		}
		static void postorder(Node temp)
		{
			if(temp!=null)
			{
				postorder(temp.left);
				postorder(temp.right);
				System.out.println(temp.info);
			}
		}
		static void preorder(Node temp)
		{
			if(temp!=null)
			{
				System.out.println(temp.info);
				preorder(temp.left);
				preorder(temp.right);
			}
		}
		public static void main(String args[])
		{
			  root=new Node(2);
			  root.left=new Node(3);
			  root.right=new Node(4);
			  root.left.left=new Node(9);
			  root.left.right=new Node(1);
			  inorder(root);
			  postorder(root);
			  preorder(root);
		}
	
	
}
