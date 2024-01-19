abstract class Bank {
    abstract int InterestRate ();
}
class Boc extends Bank {
    @Override
    int InterestRate() {
        return 8;
    }
}
class hnb extends Bank {
    @Override
    int InterestRate() {
        return 8;
    }
}
class test2 {
    public static void main(String[] args) {
        Bank b;
        b = new Boc();
        System.out.println("Boc Rate Of Interest : " + b.InterestRate() + "%");
        b =new hnb();
        System.out.println("Boc Rate Of Interest : " + b.InterestRate() + "%");
    }
}