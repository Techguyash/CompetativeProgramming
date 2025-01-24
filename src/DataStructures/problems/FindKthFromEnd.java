package DataStructures.problems;

import DataStructures.list.LinkedList;
import DataStructures.list.Node;

import static DSA.list.Node.insertLast;

/**
 * @author ashiq
 * @createdOn 19/01/25 4:57 pm
 * @project JavaPlaygroud
 *
 *
 * Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
 *
 * If the list has fewer than k nodes, the method should return null.
 **/
public class FindKthFromEnd
{

    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);

        findKthFromEnd(5, list.getHead());
    }

    public static Node findKthFromEnd(int k, Node head)
    {
        Node temp = head;
        int pointer = 0;

        while(temp.next != null)
        {
            temp = temp.next;
            pointer++;
        }
        if(pointer<k)
        {
            return null;
        }
        int current=0;
        while(current!=k)
        {
            head = head.next;
        }
        return head;


    }
}
