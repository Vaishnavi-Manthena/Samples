import java.util.Scanner;

class Dev {
    int id, age;
    int salary = 50000;
    String name;
    String desig = "Developer";

    Dev(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
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
}

class Clerk {
    int id, age;
    int salary = 25000;
    String name;
    String desig = "Clerk";

    Clerk(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
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
}

public class Demo2{

    public static void main(String args[]){

        int category = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter category: (1: dev, 2: Clerk, 3:Exit) -> ");
           category = sc.nextInt();

            if(category == 1){
                Dev d = new Dev();
                d.display();
            } else if (category ==2) {
                Clerk c = new Clerk();
                c.display();
            }
        }while(category != 3);
    }
}