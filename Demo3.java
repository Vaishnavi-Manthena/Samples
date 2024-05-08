class P
{
    int money = 80000;
    String car = "bmw";
    String newCar = "Benz";
    int site =5;

    void use(){
        System.out.println("Money: "+money);
        System.out.println("Car: "+car);
        System.out.println("Site: "+site);
    }
}

class C extends P{
    int money = 10000;
    void use(){
        System.out.println("Money: "+money);
        System.out.println("Parents money: "+super.money);
        System.out.println("Parents new car: "+newCar);
    }
}

class Demo3{
    public static void main(String args[]){
        C c = new C();
        c.use();
    }
}