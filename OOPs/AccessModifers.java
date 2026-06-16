package OOPs;
class Employee{
    public String name;
    protected int empid;
    private double salary;

    public  void setsalary(double salary){
        this.salary=salary;
        if(salary<0) System.out.println("Invalid salary"); this.salary=0.0;

    }
    public double getsalary(){
        return salary;
    }
    Employee(double salary,String name,int empid){
        this.salary=salary;
        this.name=name;
        this.empid=empid;
        if(salary<0){
            System.out.println("Invalid salary");
            setsalary(0);
        }
    }
    void displayEmployeeDetails(){
        System.out.println("Salary:"+salary);
        System.out.println("Name:"+name);
        System.out.println("EmployeeID:"+empid);

    }
}
public class AccessModifers {
    public static void main(String[] args) {
        Employee e=new Employee(150000, "Abi", 10001);
        e.setsalary(-356);
        e.displayEmployeeDetails();
    }
    
}
