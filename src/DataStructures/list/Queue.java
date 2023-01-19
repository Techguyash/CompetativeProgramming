package DataStructures.list;

public class Queue
{
	Node front;
	Node rear;



	public void enQueue(int data)
	{
		Node newNode=new Node(data);
		if(front==null && rear==null)
		{
			front=rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}

	public void deQueue()
	{
		if(front!=null)
		{
			System.out.println("Dequeue : "+front.data);
			front=front.next;
			return;
		}
		System.out.println("Queue is empty");
	}
	public void peek()
	{
		if(front!=null)
		{
			System.out.println("Peek :"+front.data);
			return;
		}
		System.out.println("Queue is empty");
	}
	public void showRear()
	{
		if(rear!=null)
		{
			System.out.println("rear :"+rear.data);
		}
	}

	public static void main(String[] args)
	{
		int[] data={1,2,3,4,5,6};
		Queue queue=new Queue();
		queue.peek();
		for(int i: data)
			queue.enQueue(i);
		queue.showRear();
		queue.peek();
		queue.deQueue();
		queue.deQueue();
		queue.showRear();
		queue.peek();
	}
}
