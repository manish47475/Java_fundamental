package Dsa_video9;

public class MyTreeTest {

	public static void main(String[] args)
	{
		Tree t=new Tree();
		Tree.Node n=new Tree.Node(5);
		
		t.insert(n,2);
		t.insert(n,4);
		t.insert(n,8);
		t.insert(n,6);
		t.insert(n,7);
		t.insert(n,3);
		t.insert(n,9);
		t.traverseInOrder(n);
	}
	public static  class Tree
	{
		//Node n=new Node(5);
		static class  Node
		{
			int value;
			Node left,right;
			Node(int value)
			{
				this.value=value;
				left=null;
				right=null;
			}
		}
		public void insert(Node n,int value)
		{
			
			if(value<n.value)
			{
				if(n.left!=null)
				{
					insert(n.left,value);
				}
				else
				{
					
					System.out.println("Insert "+value+" to the left of "+n.value);
					n.left=new Node(value);
				}
			}else if(value>n.value)
			{
				if(n.right!=null)
				{
					insert(n.right,value);
				}
				else
				{
					
					System.out.println("Insert "+value+" to the right of "+n.value);
					n.right=new Node(value);
				}
			}
			
		}
		public void traverseInOrder(Node node)
		{
			if(node!=null)
			{
					traverseInOrder(node.left);
					System.out.println(""+node.value);
					traverseInOrder(node.right);
			}
		}
		
	}
}
