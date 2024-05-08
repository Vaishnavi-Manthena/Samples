import java.util.Scanner;
abstract class Emp{
    int salary;
    String desig;
    int id,age;
    String name;
    Emp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p id:");
        id = sc.nextInt();
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter age:");
        age = sc.nextInt();
    }
    void display(){
        System.out.println("Designation: "+desig);
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
   abstract void raiseSalary();
}

class Dev extends Emp {
    Dev(){
        salary = 50000;
        desig = "Developer";
    }

    void raiseSalary(){
        salary = ((salary/100)*10) + salary;
    }
}

class tester extends Emp {
    tester(){
        salary = 30000;
        desig = "Tester";
    }

    void raiseSalary(){
        salary = ((salary/100)*5) + salary;
    }
}
class Manager extends Emp {
    Manager(){
        salary = 80000;
        desig = "Manager";
    }
    void raiseSalary(){
        salary = ((salary/100)*8) + salary;
    }
}

class Clerk extends Emp {
    Clerk() {
        salary = 25000;
        desig = "Clerk";
    }
    void raiseSalary(){
        salary = ((salary/100)*5) + salary;
    }
}

public class Demo10{

    public static void main(String args[]){

        int category = 0, ch1=0;
        Dev d = null;
        Clerk c = null;
        tester t = null;
       Manager m = null;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter the choice :");
            ch1 = sc.nextInt();
            if(ch1 ==1 ) {
                    System.out.println("Enter category: 1: dev, 2: Clerk,3: Tester 4: Manager 5:Exit -> ");
                    category = sc.nextInt();

                    if (category == 1) {
                         d = new Dev();

                    } else if (category == 2) {
                         c = new Clerk();

                    } else if (category == 3) {
                        t = new tester();

                    } else if (category == 4) {
                         m = new Manager();
                    }
            } else if(ch1 == 2){
                if (category == 1) {
                    d.display();
                } else if (category == 2) {
                    c.display();
                } else if (category == 3) {
                    t.display();
                } else if (category == 4) {
                    m.display();
                }
            } else if( ch1 == 3){
                if (category == 1) {
                    d.raiseSalary();
                } else if (category == 2) {
                    c.raiseSalary();
                } else if (category == 3) {
                    t.raiseSalary();
                } else if (category == 4) {
                    m.raiseSalary();
                }
            }
        }while(ch1!=4);
    }
}

