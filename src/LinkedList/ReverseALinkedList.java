package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class ReverseALinkedList {
    public static void main(String[] args) {
        // create a head node
        LinkedList.Node head = new LinkedList.Node(1);
        // insert from start
        System.out.println("Inserting from begining");
        head = LinkedList.insertAtBegining(head, 2);
        head = LinkedList.insertAtBegining(head, 3);
        head = LinkedList.insertAtBegining(head, 4);
        LinkedList.display(head);
        // insert from end
        System.out.println("Inserting from end");
        head = LinkedList.insertAtEnd(head, 5);
        head = LinkedList.insertAtEnd(head, 6);
        LinkedList.display(head);
        // insert at a position
        System.out.println("Insert at position 3");
        head = LinkedList.insertAtPosition(head, 7, 3);
        LinkedList.display(head);
        // delete from head
        System.out.println("Delete from begining");
        head = LinkedList.deleteAtHead(head);
        LinkedList.display(head);
        // delete from end
        System.out.println("Delete from end");
        head = LinkedList.deleteAtTail(head);
        LinkedList.display(head);
        // delete from a position
        System.out.println("Delete from position 2");
        head = LinkedList.deleteAtPosition(head, 2);
        LinkedList.display(head);
        // reverse
        System.out.println("Reverse the linkedlist");
        head = LinkedList.reverse(head);
        LinkedList.display(head);
        // length of the LL
        int length = LinkedList.length(head);
        System.out.println("Length of the linkedlist is "+length);
    }
    public class LinkedList {
        public static class  Node {
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }
        Node head;

        public static void display(Node head){
            if(head==null){
                return;
            }
            Node current = head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }

        public static int length(Node head){
            if(head==null) return 0;
            int count=0;
            Node current = head;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }

        public static Node insertAtBegining(Node head, int data){
            Node newNode = new Node(data);
            if(head==null){
                return newNode;
            }
            newNode.next = head;
            head = newNode;
            return newNode;
        }

        public static Node insertAtEnd(Node head, int data){
            Node newNode = new Node(data);
            if(head==null){
                return newNode;
            }
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
            return head;
        }

        public static Node insertAtPosition(Node head, int data, int position){
            int size = length(head);
            if(position<1 || position>size+1){
                System.out.println("Invalid position. Position must be between 1 and "+(size+1));
                return head;
            }
            Node newNode = new Node(data);

            if(position==1){
                newNode.next=head;
                return head;
            }
            else {
                Node previous = head;
                int count = 1;
                while(count<position-1){
                    previous=previous.next;
                    count++;
                }
                Node current = previous.next;
                newNode.next=current;
                previous.next=newNode;
            }
            return head;
        }

        public static Node deleteAtHead(Node head){
            if(head==null){
                return head;
            }
            Node temp = head;
            head=head.next;
            temp.next=null;
            return head;
        }

        public static Node deleteAtTail(Node head){
            if(head==null){
                return head;
            }
            Node last = head;
            Node previousToLast = null;
            while(last.next!=null){
                previousToLast = last;
                last = last.next;
            }
            previousToLast.next = null;
            return head;
        }

        public static Node deleteAtPosition(Node head, int position){
            int size = length(head);
            if(position>size || position<1){
                System.out.println("Invalid Position");
            }
            if(position==1){
                Node temp = head;
                head=head.next;
                temp.next=null;
                return temp;
            }
            Node previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next=current.next;
            current.next=null;
            return head;
        }

//        public static Node reverse(Node head){
//            if(head==null){
//                return head;
//            }
//            Node current = head;
//            Node previous = null;
//            Node next = null;
//            while(current!=null){
//                next=current.next;
//                current.next=previous;
//                previous=current;
//                current=next;
//            }
//            return previous;
//        }

        // reverse using recursion
        public static Node reverse(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node previous = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return previous;
        }
    }
}
