package DataStructures.BinaryTree;

public class TotalNodes
{
	static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data)
		{
			this.data = data;
			this.left=this.right=null;
		}
	}
	static class Tree{
		static int idx=-1;
		private static TreeNode buildTree(int[] node)
		{
			idx++;
			if(node[idx]==-1)
				return null;
			TreeNode newNode=new TreeNode(node[idx]);
			newNode.left=buildTree(node);
			newNode.right=buildTree(node);
			return newNode;
		}
	}




	private static int countNodes(TreeNode root)
	{

		if(root==null)
			return 0;

		int left=countNodes(root.left);
		int right=countNodes(root.right);
		return 1+left+right;



	}

	public static void main(String[] args)
	{
		int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, };
//		int[] node = { 1, 2, 3, 4, 5, 6, 7,8, 9, -1, -1, -1,10,-1,-1,-1,-1,-1,-1,-1,-1 };
		Tree tree = new Tree();
		TreeNode root = tree.buildTree(node);
		System.out.println(countNodes(root));
	}
}
