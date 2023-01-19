package DataStructures.list;

public class CircularDoublyLinkedList
{
	DoubleNode head;

	public void push(int data)
	{
		DoubleNode newNode=new DoubleNode(data);
		if(head==null)
		{
			head=newNode;
			head.next=head.prev=head;
			return;
		}
		DoubleNode last=head.prev;
		newNode.next=head;
		newNode.prev=last;
		last.next=newNode;
		head.prev=newNode;


	}

	public void insertFirst(int data)
	{
		DoubleNode newNode=new DoubleNode(data);
		DoubleNode last=head.prev;
		newNode.next=head;
		newNode.prev=head.prev;
		head.prev=newNode;
		head=newNode;
		last.next=newNode;
	}

	public void display()
	{
		DoubleNode start=head;
		System.out.println("Forward move");
		while(start.next.data!= head.data)
		{
			System.out.print(start.data+"->");
			start=start.next;
		}
		System.out.println(start.data);
		System.out.println("Backward move");
		start=head;
		while(start.prev.data!=head.data)
		{
			System.out.print(start.data+"->");
			start=start.prev;
		}
		System.out.println(start.data);
	}

	public static void main(String[] args)
	{
		CircularDoublyLinkedList list=new CircularDoublyLinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.insertFirst(10);
		list.insertFirst(15);
		list.display();
	}
}
