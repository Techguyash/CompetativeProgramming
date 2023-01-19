package DataStructures.list;

public class LinkedList
{
	Node head=null;

	public void push(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=newNode;
	}

	public Node getHead()
	{
		return head;
	}

	public void display()
	{
		if(head==null) return;
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args)
	{
			LinkedList list=new LinkedList();
			list.push(10);
			list.push(20);
			list.push(40);
			list.push(55);
			list.display();
	}
}
