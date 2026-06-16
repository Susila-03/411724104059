import java.util.Scanner;

// class Node{
//     int val;
//     Node next;
//     Node(int val){
//         this.val=val;
//         next=null;
//     }
// }
// public class LinkedListEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Node head=new Node(arr[0]);
//         Node curr=head;
//         for(int i=1;i<n;i++){
//             Node temp=new Node(arr[i]);
//             curr.next=temp;
//             curr=curr.next;
//         }
//         curr=head;
//         while(curr!=null){
//             System.out.println(curr.val);
//             curr=curr.next;
//         }
//     }
// }


//find length of linked list
// class Node{
//     int val;
//     Node next;
//     Node(int val){
//         this.val=val;
//         next=null;
//     }
// }
// public class LinkedListEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Node head=new Node(arr[0]);
//         Node curr=head;
//         for(int i=1;i<n;i++){
//             Node temp=new Node(arr[i]);
//             curr.next=temp;
//             curr=curr.next;
//         }
//         curr=head;
//         int c=0;
//         while(curr!=null){
//             System.out.println(curr.val);
//             curr=curr.next;
//             c++;
//         }
//         System.out.println("Length of the list:"+c);
//     }
// }


//Find 3 val in linked list
// class Node{
//     int val;
//     Node next;
//     Node(int val){
//         this.val=val;
//         next=null;
//     }
// }
// public class LinkedListEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Node head=new Node(arr[0]);
//         Node curr=head;
//         for(int i=1;i<n;i++){
//             Node temp=new Node(arr[i]);
//             curr.next=temp;
//             curr=curr.next;
//         }
//         curr=head;
//         while(curr!=null){
//             System.out.println(curr.val);
//             curr=curr.next;
//         }
//         System.out.println("Enter val to find:");
//         int k=sc.nextInt();
//         curr=head;
//         while(curr!=null){
//             if(curr.val==k){
//                 System.out.println("found");
//                 return;
//             }curr=curr.next;
//         }
//         System.out.println("Not found");
//     }
// }


//to delete
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
    }
}
public class LinkedListEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node head=new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<n;i++){
            Node temp=new Node(arr[i]);
            curr.next=temp;
            curr=curr.next;
        }
        // to remove first node
        // Node temp=head;
        // head=head.next;
        // temp=null;
        // while(head!=null){
        //     System.out.println(head.val);
        //     head=head.next;
        // }

        //to remove last node
        // if (head.next == null) {
        //     head = null;   
        // } else {
        //     Node temp = head;
        //     while (temp.next.next != null) {
        //         temp = temp.next;
        //     }
        //     temp.next = null;
        // }

        //kth element
        System.out.println("Enter kth node to delete:");
        int k=sc.nextInt();
        Node temp=head;
        head=head.next;
        temp=null;
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }

        curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
    }
}

