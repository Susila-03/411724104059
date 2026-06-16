import java.util.Scanner;
import java.util.Stack;
class Queue{
        int front=-1,rear=-1;
        int size=5;
        int[] queue=new int[size];
        void enqueue(int data){
            if(rear==size-1){
                System.out.println("Overflow");
            }else{
                if(front==-1){
                    front=0;
            }
            queue[++rear]=data;
            System.out.println(data);
        }
    }
    void dequeue(){
        if(front==-1||front>rear){
            System.out.println("underflow");
        }else{
            System.out.println(queue[front]);
            front++;
        }
    }
    void display(){
        if(front==-1||front>rear){
            System.out.println("Empty");
        }else{
            System.out.println("Queue Elements");
            for(int i=0;i<size;i++){
                System.out.println(queue[i]);
            }
        }
    }
}-
    public class QueueEg {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Queue q=new Queue();
            while(true){
                System.out.println("\n1.Enqueue");
                System.out.println("\n2.Dequeue");
                System.out.println("\n3.Display value");
                System.out.println("\n4.Exit");
                System.out.println("\nEnter your choice:");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter elements:");
                        int data=sc.nextInt();
                        q.enqueue(data);
                        break;
                    case 2:
                        q.dequeue();
                        break;
                    case 3:
                        q.display();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Queue");
                        break;
            }
        }
    }
}
