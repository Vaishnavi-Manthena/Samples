import java.util.Scanner;
class Emp{
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
}

class Dev extends Emp {
    Dev(){
        salary = 50000;
        desig = "Developer";
    }
}

class tester extends Emp {
    tester(){
        salary = 30000;
        desig = "Tester";
    }
}
class Manager extends Emp {
    Manager(){
        salary = 80000;
        desig = "Manager";
    }
}

class Clerk extends Emp {
    Clerk() {
        salary = 25000;
        desig = "Clerk";
    }
}

public class Demo2{

    public static void main(String args[]){

        int category = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter category: 1: dev, 2: Clerk,3: Tester 4: Manager 5:Exit -> ");
            category = sc.nextInt();

            if(category == 1){
                Dev d = new Dev();
                d.display();
            } else if (category ==2) {
                Clerk c = new Clerk();
                c.display();
            }else if(category ==3 ){
                tester t = new tester();
                t.display();
            } else if (category ==4 ) {
                Manager m = new Manager();
                m.display();
            }
        }while(category != 5);
    }
}

/*import java.util.Scanner;
class Dev
{
	int id,age;
	int salary=60000;
	String name;
	String desig="Developer";
	Dev()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		 id=sc.nextInt();
		System.out.println(" Enter Name : ");
		 name=sc.next();
		System.out.println(" Enter Age : ");
		 age=sc.nextInt();


	}
	void display()
	{
		System.out.println(" Hi ID "+id);
		System.out.println(" My Name : "+name);
		System.out.println(" Hi AGE "+age);
		System.out.println(" My Salary : "+salary);
		System.out.println(" My Designation : "+desig);
	}
}
class Clerk
{
	int id,age;
	int salary=20000;
	String name;
	String desig="Clerk";
	Clerk()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter ID : ");
		 id=sc.nextInt();
		System.out.println(" Enter Name : ");
		 name=sc.next();
		System.out.println(" Enter Age : ");
		 age=sc.nextInt();
	}
	void display()
	{
		System.out.println(" Hi ID "+id);
		System.out.println(" My Name : "+name);
		System.out.println(" Hi AGE "+age);
		System.out.println(" My Salary : "+salary);
		System.out.println(" My Designation : "+desig);
	}
}

public class Demo2
{
	public static void main(String args[])
	{
		int ch1=0;
		do{
			System.out.println("1) Developer");
			System.out.println("2) Clerk");
			System.out.println("3) Exit");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the choice :");
			 ch1= sc.nextInt();

			if(ch1==1)
			{
				Dev d = new Dev();
				d.display();
			}
			if(ch1==2)
			{
				Clerk c = new Clerk();
				c.display();
			}
			if(ch1==3)
			{
				System.out.println("Thank You");
				System.exit(0);
			}

		}while(ch1!=3);
	}
}*/