abstract class Bank{
    abstract void ATM();
    abstract void KYC();
}

class SBI extends Bank{
    void ATM(){
        System.out.println(" 50,000");
    }

    void KYC(){
        System.out.println(" PAN ");
    }
}
class Axis extends Bank{
    void ATM(){
        System.out.println(" 10,000");
    }

    void KYC(){
        System.out.println(" DL ");
    }
}
class Demo12{
    public static void main(String args[]){

        Axis a = new Axis();
        a.ATM();
        a.KYC();

        SBI s = new SBI();
        s.ATM();
        s.KYC();

    }
}