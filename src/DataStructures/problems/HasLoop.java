package DataStructures.problems;

import DataStructures.list.LinkedList;
import DataStructures.list.Node;



/**
 * @author ashiq
 * @createdOn 19/01/25 4:47 pm
 * @project JavaPlaygroud
 **/
public class HasLoop
{
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.push(1);
        Node node2 = list.push(2);
        list.push(3);
        Node node4 = list.push(4);
        node4.next=node2;
        System.out.println("The list has loop : "+hasLoop(list.getHead()));
    }

    public static boolean hasLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;

        }
        return false;
    }
}
