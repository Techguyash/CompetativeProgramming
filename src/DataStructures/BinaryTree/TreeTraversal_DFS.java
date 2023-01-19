package DataStructures.BinaryTree;

public class TreeTraversal_DFS
{
	static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
			this.left=this.right=null;
		}
	}

	static class Tree
	{
		static int idx=-1;
		public static TreeNode buildTree(int[] nodes)
		{
			idx++;
			if(nodes[idx]==-1) return null;
			TreeNode newNode=new TreeNode(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;
		}
	}

	public static void inOrderTraversal(TreeNode root)
	{
		if(root==null) return;
		inOrderTraversal(root.left);
		System.out.print(root.data+"->");
		inOrderTraversal(root.right);

	}

	public static void postOrderTraversal(TreeNode node)
	{
		if(node ==null) return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.data+"->");
	}
	public static void preOrderTraversal(TreeNode temp)
	{

		if(temp==null) return;
		System.out.print(temp.data+"->");
		preOrderTraversal(temp.left);
		preOrderTraversal(temp.right);
	}


	public static void main(String[] args)
	{
		int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Tree tree = new Tree();
		TreeNode root = tree.buildTree(node);
		System.out.println("Inorder Traversal");
		inOrderTraversal(root);
		System.out.println();
		System.out.println("PreOrder traversal");
		preOrderTraversal(root);
		System.out.println();
		System.out.println("PostOrder Traversal");
		postOrderTraversal(root);

	}
}
