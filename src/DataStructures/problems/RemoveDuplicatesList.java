package DataStructures.problems;

import DataStructures.list.LinkedList;
import DataStructures.list.Node;



//Remove duplicates from the list 1->1->2->3->3
//Output 1->2->3
public class RemoveDuplicatesList
{
	public static void removeDuplicates(LinkedList list)
	{
		Node head = list.getHead();

		Node temp=head;
		Node tail=temp.next;

			while(temp!=null && tail!=null)
			{
				if(temp.data== tail.data)
				{
					temp.next=tail.next;
					Node todel=tail;
					tail=tail.next;
					todel=null;
				}
				else{
					temp=temp.next;
					tail=tail.next;
				}
			}


	}


	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.push(1);
		list.push(3);
		list.push(2);
//		list.push(3);
//		list.push(3);

		list.display();
		removeDuplicates(list);
		list.display();
	}
}
