package LinkedList;

import java.util.List;

public class SelfMadeLinkedList {
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
        // mid of the LL
        LinkedList.Node ans = LinkedList.middleNode(head);
        System.out.println("mid node of this LL is : "+ans.data);
        // merge two LL
//        LinkedList.Node mergeAns = LinkedList.mergeTwoLists(head, head);
//        LinkedList.display(mergeAns);
        // Creating nodes for list B
        LinkedList.Node b1 = new LinkedList.Node(5);
        b1 = head.next.next;
        LinkedList.Node intersectionNode = LinkedList.getIntersectionNode(head, b1);
        System.out.print("Intersection of LL is : ");
        LinkedList.display(intersectionNode);


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

        // mid of a linkedList
//        public static Node middleNode(Node head){
//            int count = length(head)/2;
//            Node current = head;
//            int i =0;
//            while(current!=null){
//                if(i==count){
//                    return current;
//                }
//                current = current.next;
//                i++;
//            }
//            return current;
//        }
        public static Node middleNode(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static Node mergeTwoLists(Node list1, Node list2){
            Node prevHead = new Node(-1);
            Node prev = prevHead;

            while(list1!=null && list2!=null){
                if(list1.data <= list2.data){
                    prev.next = list1;
                    list1 = list1.next;
                }else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }
            prev.next = list1 == null ? list2:list1;
            return prevHead.next;
        }

        public static Node getIntersectionNode(Node head1, Node head2){
            Node current1 = head1;
            Node current2 = head2;

            // Iterate through both lists until they are equal or reach the end
            while (current1 != current2) {
                // If either list reaches the end, move to the other list
                current1 = (current1 == null) ? head2 : current1.next;
                current2 = (current2 == null) ? head1 : current2.next;
            }

            // Return the intersection node (or null if no intersection)
            return current1;
        }

        // intersection of two linkedlists : FAST RUNNER APPROACH

//        public static Node getIntersectionNode(Node head1, Node head2){
//
//            // Calculate the lengths of both linked lists
//            int length1 = length(head1);
//            int length2 = length(head2);
//
//            // Move the pointer of the longer list forward by the difference in lengths
//            while (length1 > length2) {
//                head1 = head1.next;
//                length1--;
//            }
//
//            while (length2 > length1) {
//                head2 = head2.next;
//                length2--;
//            }
//
//            // Iterate through both lists simultaneously using two pointers until they meet
//            while (head1 != null && head2 != null) {
//                if (head1 == head2) {
//                    return head1; // Intersection found
//                }
//                head1 = head1.next;
//                head2 = head2.next;
//            }
//
//            return null; // No intersection found
//        }
    }
}
