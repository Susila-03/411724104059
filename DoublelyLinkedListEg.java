//import java.util.*;

// class Node {
//     int val;
//     Node next;
//     Node prev;
//     Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.prev = null;
//     }
// }
// public class DoublelyLinkedListEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Node head = new Node(arr[0]);
//         Node cur = head;
//         for(int i = 1; i < arr.length; i++) {
//             Node temp = new Node(arr[i]);
//             cur.next = temp;
//             temp.prev = cur;
//             cur = temp;
//         }
//         // //to remove first node
//         // if(head != null) {
//         //     head = head.next;     
//         //     if(head != null) {
//         //         head.prev = null; 
//         //     }
//         // }

//         // //to remove last node
//         // if (head.next == null) {
//         //     head = null;   
//         // } else {
//         //     Node temp = head;
//         //     while (temp.next.next != null) {
//         //         temp = temp.next;
//         //     }
//         //     temp.next = null;
//         // }

//         //to delete a element
//         System.out.println("Enter node to delete:");
//         int k=sc.nextInt();
//         Node temp=head;
//         head=temp.next;
//         temp=null;
//         while(head.next!=null){
//             System.out.println(head.val);
//             head=head.next;
//         }

//         while(head != null) {
//             System.out.println(head.val);
//             head = head.next;
//         }
//     }
// }


//Delete all occurrence of a key in DLL
import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class DoublelyLinkedListEg {

    // Insert at end
    static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    // Delete all occurrences
    static Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                // If head node
                if (curr.prev == null) {
                    head = curr.next;
                    if (head != null) head.prev = null;
                } else {
                    curr.prev.next = curr.next;
                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    }
                }
            }
            curr = curr.next;
        }
        return head;
    }

    // Print DLL
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insert(head, val);
        }

        System.out.print("Enter key to delete: ");
        int x = sc.nextInt();

        head = deleteAllOccurOfX(head, x);

        System.out.println("Updated DLL:");
        printList(head);

        sc.close();
    }
}