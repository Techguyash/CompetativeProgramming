package DataStructures.list;

public class Stack
{
	Node top;

	public void push(int data)
	{
		Node newNode=new Node(data);
		System.out.println("pushed :"+data);
		if(top==null)
		{
			top=newNode;
			return;
		}
		newNode.next=top;
		top=newNode;

	}
	public void pop()
	{
		if(top==null) return;
		Node temp=top;
		top=top.next;
		System.out.println("Popped data :"+temp.data);
		temp=null;
	}
	public void peek()
	{
		System.out.println("Peek : "+top.data);
	}
	public boolean isEmpty()
	{
		if(top==null) return true;
		else return false;
	}

	public static void main(String[] args)
	{
		Stack stack=new Stack();
		System.out.println("Empty : "+stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.peek();
		stack.pop();
		stack.pop();
		stack.peek();
		System.out.println("Empty : "+stack.isEmpty());
	}

}
