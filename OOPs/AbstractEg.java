package OOPs;

// abstract class trainer{
//     abstract void Q1();
//     abstract void Q2();
// }
// class Student extends trainer{
//     void Q1(){
//         System.out.println("Implement Q1");
//     }
//     void Q2(){
//         System.out.println("Implement Q2");
//     }
// }
// public class AbstractEg {
//     public static void main(String[] args) {
//         Student s=new Student();
//         s.Q1();
//         s.Q2();
//     }
    
// }

//
// import java.util.*;
// abstract class Animal{
//     String name;
//     Animal(String name){
//         this.name=name;
//     }
//     abstract void makesound();
// }
// class Dog extends Animal{
//     Dog(String name){
//         super(name);
//     }
//     void makesound(){
//         System.out.println("Woof!");
//     }
// }
// class Cat extends Animal{
//     Cat(String name){
//         super(name);
//     }
//     void makesound(){
//         System.out.println("Meow!");
//     }
// }
// public class AbstractEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String d_name=sc.nextLine();
//         String c_name=sc.nextLine();
//         Animal dog=new Dog(d_name);
//         dog.makesound();
//         Animal cat=new Cat(c_name);
//         cat.makesound();
//     }
// }

//interface implement
import java.util.*;
interface PaymentGateway{
    abstract  void processPayment(double amount);
}
class CreditCardPayment implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing credit card payment"+amount);
    }
}
class UPIpayment implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing UPI payment"+amount);
    }
}
public class AbstractEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] paymentMethod = new String[n];
        double[] paymentValue = new double[n];

        for (int i = 0; i < n; i++) {
            paymentMethod[i] = sc.next().toLowerCase();
        }

        for (int i = 0; i < n; i++) {
            paymentValue[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            PaymentGateway payment = null;

            if (paymentMethod[i].equals("credit")) {
                payment = new CreditCardPayment();
            } else if (paymentMethod[i].equals("upi")) {
                payment = new UPIpayment();
            }

            if (payment != null) {
                payment.processPayment(paymentValue[i]);
            }
        }

        sc.close();
    }
}