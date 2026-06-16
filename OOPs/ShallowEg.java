package OOPs;
class Address{
    String city;
    Address(String city){
        this.city=city;
    }
}
class Student{
    String name;
    Address address;
    Student(String name,Address address){
        this.name=name;
        this.address=address;
    }
}
public class ShallowEg {
    public static void main(String[] args) {
        Address a1 =new Address("Ballari");
        Student s1=new Student("Ranjith", a1);
        Student s2=new Student(s1.name, s1.address);
        s2.address.city="Bengaluru";
        System.out.println("s1 city:"+s1.address.city);
        System.out.println("s2 city:"+s2.address.city); 
    }
    
}
