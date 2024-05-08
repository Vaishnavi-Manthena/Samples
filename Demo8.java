class Bank
{
    int roi()
    {
        System.out.println("10");
        return 10;
    }
}
class SBI extends Bank{
}

class Axis extends Bank{
    int roi(){
        System.out.println("12");
        return 12;
    }
}
class Demo8{
    public static void main(String args[]){
        SBI s = new SBI();
        s.roi();

        Axis a = new Axis();
        a.roi();
    }
}