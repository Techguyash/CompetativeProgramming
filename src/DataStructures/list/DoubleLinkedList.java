package DataStructures.list;

public class DoubleLinkedList
{
	DoubleNode head;
	DoubleNode tail;
	public void push(int data)
	{
		DoubleNode newNode=new DoubleNode(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return;
		}
		DoubleNode last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=newNode;
		newNode.prev=last;
		tail=newNode;
	}

	public void pop()
	{
		DoubleNode temp=tail;
		DoubleNode tailPrev=temp.prev;
		tailPrev.next=null;
		temp=null;
		tail=tailPrev;
	}


	public void insertFirst(int data)
	{
		DoubleNode newNode=new DoubleNode(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		head.prev=newNode;
		newNode.next=head;
		head=newNode;
	}
	public void displayList()
	{
		System.out.println("Forward order");
		DoubleNode temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(temp.data);
		System.out.println("Reverse order");
		while(temp.prev!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.prev;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args)
	{
		DoubleLinkedList list=new DoubleLinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
//		list.displayList();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.displayList();
		System.out.println("Head Data "+list.head.data);
		System.out.println("Tail Data "+list.tail.data);
		list.pop();
		list.pop();
		list.displayList();

	}
}
