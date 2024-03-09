package LinkedList;

public class ReorderList {
    public static void main(String[] args) {
        // create a head node
        LinkedList.Node head = new LinkedList.Node(1);
        head = LinkedList.insertAtEnd(head, 2);
        head = LinkedList.insertAtEnd(head, 3);
        head = LinkedList.insertAtEnd(head, 4);
        head = LinkedList.insertAtEnd(head, 5);
        LinkedList.reorderList(head);
        LinkedList.display(head);
    }
    public class LinkedList {

        public static class Node {
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }
        Node head;

        public static void reorderList(Node head){
            // find mid of the LL
            Node mid = mid(head);
            // break of the LL from mid into 2 LL : L1 & L2
            Node l1 = head;
            Node l2 = mid.next;
            mid.next = null;
            // reverse the 2nd LL
            l2 = reverse(l2);
            // merge 2 sorted LL
            mergeTwoLists(l1, l2);
        }

        public static void display(Node head){
            if(head==null){
                return;
            }
            Node current = head;
            while(current != null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }

        public static Node mid(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        public static Node reverse(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node previous = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return previous;
        }

        public static Node mergeTwoLists(Node l1, Node l2){
            Node dummy = new Node(-1);
            Node current = dummy;
            while(l1!=null && l2!=null){
                current.next=l1;
                l1=l1.next;
                current=current.next;
                current.next=l2;
                l2=l2.next;
                current=current.next;
            }
            current.next = l2==null ? l1:l2;
            return dummy.next;
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
    }
}
