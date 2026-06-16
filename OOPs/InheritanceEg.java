package OOPs;

//SINGLE-INHERITANCE
// class Animal{
//     void eat(){
//         System.out.println("This animal eats food");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("This dog barks");
//     }
// }
// public class InheritanceEg {
//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.eat();
//         d.bark();
//     }
// }


//MULTI-LEVEL INHERITANCE
// class Animal{
//     void eat(){
//         System.out.println("This animal eats food");
//     }
// }
// class Mammal extends Animal{
//     void walk(){
//         System.out.println("This mammal walks");
//     }
// }
// class lion extends Mammal{
//     void roar(){
//         System.out.println("The lions roars louder ");
//     }
// }
// public class InheritanceEg {
//     public static void main(String[] args) {
//         lion m=new lion();
//         m.eat();
//         m.walk();
//         m.roar();
//     }
// }

//HIERARCHICAL-INHERITANCE
// class Animal{
//     void eat(){
//         System.out.println("This animal eats food");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("This Dog barks");
//     }
// }
// class Cat extends Animal{
//     void meow(){
//         System.out.println("This Cat meows");
//     }
// }
// public class InheritanceEg {
//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.eat();
//         d.bark();
//         Cat c=new Cat();
//         c.eat();
//         c.meow();
//     }
// }

//OVERRIDING
// class Animal{
//     void sound(){
//         System.out.println("Animals makes sound");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }
// public class InheritanceEg {
//     public static void main(String[] args) {
//         Dog obj=new Dog();
//         obj.sound();
//     }
// }

//HIERARCHICAL-INHERITANCE
// class Employee{
//     String name;
//     int ID;
//     Employee(String name,int ID){
//         this.name=name;
//         this.ID=ID;
//     }
//     void displayDetails(){
//         System.out.println("Name:"+name);
//         System.out.println("ID:"+ID);
//     }
// }
// class Manager extends Employee{
//     int teamsize;
//     Manager(String name,int ID,int teamsize){
//         this.name=name;
//         this.ID=ID;
//         this.teamsize=teamsize;
//     }
//     void displayDetails(){
//         System.out.println("Team size:"+teamsize);
//     }
// }
// class Engineer extends Employee{
//     String Specialization;
//     Engineer(String name,int ID,String Specialization){
//         this.name=name;
//         this.ID=ID;
//         this.Specialization=Specialization;
//     }
//     void displayDetails(){
//         System.out.println("");
//     }
// }

