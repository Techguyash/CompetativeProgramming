package DataStructures.problems;

import DataStructures.list.LinkedList;
import DataStructures.list.Node;


/**
 * @author ashiq
 * @createdOn 19/01/25 4:03 pm
 * @project JavaPlaygroud
 **/
public class FindMiddleNode
{

/**
 When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5,
 the function will find the exact middle node.
 In this case, it will return the node containing the value 3.

 When the linked list has an even number of nodes, there will be two middle nodes.
 The findMiddleNode function will return the second of these two middle nodes.

 For example, if the linked list is 1 -> 2 -> 3 -> 4 -> 5 -> 6, the two middle nodes are 3 and 4.
 The function will return the node containing the value 4.

 * **/



    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.display();


        Node middleNode = findMiddleNode(list.getHead());
        list.displayNodeValue(middleNode);



    }

    public static  Node findMiddleNode(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
