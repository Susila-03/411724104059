import java.util.ArrayList;
import java.util.*;
// class pair{
//     int first;
//     int second;
//     pair(int first,int second){
//         this.first=first;
//         this.second=second;
//     }
// }
// public class CollectionClass {
//     public static void main(String[] args) {
//         ArrayList<pair> lst=new ArrayList<>();
//         pair p=new pair(1, 20);
//         lst.add(p);
//         for(pair it:lst){
//             System.out.println(it.first+" "+it.second);
//         }
//     }
// }

class Student{
    String name;
    int rollno;
    String clgname;
    int age;
    Student(String name,int rollno,String clgname,int age){
        this.name=name;
        this.rollno=rollno;
        this.clgname=clgname;
        this.age=age;
    }
}
public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Student> lst=new ArrayList<>();
        Student s=new Student("Saru", 101, "Prince", 19);
        lst.add(s);
        for(Student st:lst){
            System.out.println(st.name+" "+st.rollno+" "+st.clgname+" "+st.age);
        }
    }
}