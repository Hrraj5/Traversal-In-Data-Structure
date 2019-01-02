import java.util.*;
public class inorder_iterative1 {
	class Node
	{
		int info;
		Node left;
		Node right;
		Node(int data)
		{
			info=data;
			left=right=null;
		}
	}
	Node root=null;
	public Node insert(int data)
	{
		root=create_bst(root,data);
		return root;
	}
	public Node create_bst(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else if(data<root.info)
			root.left=create_bst(root.left,data);
		else if(data>root.info)
			root.right=create_bst(root.right,data);
		return root;
	}
	public void inorder()
	{
		Stack<Node> stack=new Stack<Node>();
		Node current=root;
		while(current!=null || stack.size()>0)
		{
			while(current!=null)
			{
				stack.push(current);
				current=current.left;
			}
			current=stack.pop();
			System.out.println(current.info);
			current=current.right;
		}
	}
	public static void main(String args[])
	{
		inorder_iterative1 obj=new inorder_iterative1();
		obj.insert(1);
		obj.insert(2);
		obj.insert(23);
		obj.inorder();
	}
}
