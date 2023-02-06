package Dsa_video8;

public class BinaryTree {

	public static void main(String[] args)
	{
		Node n=new Node(5);
		n.left=new Node(4);
		n.left=new Node(8);
	}
	
	static class Node
	{
		int value;
		Node right,left;
		Node(int value)
		{
			this.value=value;
			left=null;
			right=null;
		}
		
	}
}
