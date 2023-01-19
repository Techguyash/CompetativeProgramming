package DataStructures.problems;

import DataStructures.BinaryTree.TreeTraversal_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree_101
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

	static class Tree{
		static int idx=-1;
		TreeNode buildTree(int[] nodes)
		{
			idx++;
			if(nodes[idx]==-1) return null;
			TreeNode newNode=new TreeNode(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;
		}
	}

	public static void levelOrderTraversal(TreeNode root)
	{
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty())
		{
			TreeNode node = queue.remove();
			if(node==null)
			{
				System.out.println();
				if(queue.isEmpty()) break;
				else
					queue.add(null);
			}
			else
			{
				System.out.print(node.data+" ");
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);
			}
		}
	}

	public static boolean isSymmetric(TreeNode root)
	{
		return helper(root.left,root.right);

	}

	public static boolean helper(TreeNode p,TreeNode q)
	{
		if(p==null || q==null)
		{
			if(p==null && q==null)
				return true;
			else return false;
		}
		if(p.data!=q.data) return false;
		return helper(p.left,q.right) && helper(p.right,q.left);
	}

	public static void main(String[] args)
	{
//		int[] node = { 1, 2, 3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1 };
		int[] node = {1,2,-1,3,-1,-1,2,-1,3,-1,-1};
		Tree tree = new Tree();
		TreeNode root = tree.buildTree(node);
		levelOrderTraversal(root);
	System.out.println(isSymmetric(root));
	}
}

