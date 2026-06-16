package OOPs;

// class Clg {
//     int rollno;
//     String teacher;
//     String friend;

//     void setDetails(int rollno,String teacher,String friend){
//         this.rollno=rollno;
//         this.teacher=teacher;
//         this.friend=friend;
//     }

//     void display(){
//         System.out.println("RollNo:"+rollno);
//         System.err.println("Teacher:"+teacher);
//         System.out.println("Friend:"+friend);
//     }
// }
// public class ClassEg {
//     public static void main(String[] args) {
//         Clg s1=new Clg();
//         s1.setDetails(101, "mam", "Saru");
//         s1.display();
//         s1.setDetails(102, "sir", "Ranjani");
//         s1.display();
//         s1.setDetails(103, "mam", "Abirami");
//         s1.display();
//     }
// }


// import java.util.*;
// class Bank{
//     String customer_name;
//     double balance;
//     double check_bal;
//     double deposit;
//     double withdraw;

//     void set(String cn,double b,double cb,
//         double d,double w){
//             this.customer_name=cn;
//             this.balance=b;
//             this.check_bal=cb;
//             this.deposit=d;
//             this.withdraw=w;
//         }
    
//     void display(){
//         System.out.println("Customer name:"+customer_name);
//         System.out.println("Balance:"+balance);
//         System.out.println("Check balance:"+check_bal);
//         System.out.println("Deposit:"+deposit);
//         System.out.println("Withdraw:"+withdraw);
//     }
// }
// public class ClassEg {
//     public static void main(String[] args) {
//         Bank b= new Bank();
//         Scanner sc=new Scanner(System.in);
//         String cn=sc.next();
//         double b=sc.nextDouble();
//         double cb=sc.nextDouble();
//         double d=sc.nextDouble();
//         double w=sc.nextDouble();

//     }
// }

class clg{
    int rollno;
    String name;
    String batch;
    clg(int rollno,String name,String batch){
        this.rollno=rollno;
        this.name=name;
        this.batch=batch;
    }
    void setDetails(int rollno,String name,String batch){
        this.rollno=rollno;
        this.name=name;
        this.batch=batch;
    }
    void display(){
        System.out.println("Rollno:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Batch:"+batch);
    }
}
public class ClassEg {
    public static void main(String[] args) {
        clg s=new clg(101, "Susila", "CSE");
        s.display();
    }
}
