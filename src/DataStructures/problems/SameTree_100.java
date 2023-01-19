package DataStructures.problems;


public class SameTree_100
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

	public static boolean isSameTree(TreeNode p, TreeNode q)
	{
		if(p==null && q==null)
			return true;
		else if(p==null || q==null)
			return false;
		else if(p.data!=q.data)
			return false;
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


	}
}
