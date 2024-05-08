class A{
    static int num = 1000;
    static void display(){
        System.out.println(" Method");
    }
}

class Demo11{

    public static void main(String args[]){
        System.out.println(A.num);
        A.display();
    }
}