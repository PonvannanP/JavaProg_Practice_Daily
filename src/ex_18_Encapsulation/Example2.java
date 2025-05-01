package ex_18_Encapsulation;

public class Example2 {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("Amit",100);
        long Bal=amit.getBal();
        System.out.println(Bal);// Getting the Balance

        // Setting the Balance
        amit.setBal(500, true);// If you are a Cashier allowed to set the Balance
        amit.setBal(500, false);// If you are not a Cashier not allowed to set the Balance
        long bal_updated= amit.getBal();
        System.out.println(bal_updated);

    }


}

class ICICIBank
{

    // All your attributes are private in Nature
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) { // does not allow the amit to set the balance
        // so we are adding Cashier

        if(isCashier)
        {
            this.bal = bal;// if you are a Cashier then only you are allowed to change
            // the Balance else not allowed

        }
        else
        {
            System.out.println("Not allowed to change the Bal");
        }

    }

    private long bal;

    public ICICIBank(String name,long bal)
    {
        this.name=name;
        this.bal=bal;
    }


}
