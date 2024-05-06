import java.util.Scanner;
class A{
    int id;
    String name;

    A()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter id: ");
        id = sc.nextInt();

        System.out.println("Enter name: ");
        name = sc.next();

      /*  System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Age is: "+age);

        System.out.println("Enter salary: ");
        float salary = sc.nextFloat();
        System.out.println("salary is: "+salary);

        System.out.println("Enter designation: ");
        String designation = sc.next();
        System.out.println("designation is: "+designation);*/
    }

    void display(){
        System.out.println("Id is: "+id);
        System.out.println("Name is: "+name);
    }
}
public class Demo1{

    public static void main(String args[]){
        A a = new A();
        a.display();
    }
}