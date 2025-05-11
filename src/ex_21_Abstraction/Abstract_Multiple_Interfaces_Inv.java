package ex_21_Abstraction;

public class Abstract_Multiple_Interfaces_Inv {
    public static void main(String[] args) {
   Charan c5=new Charan();
   c5.money();
    }

}

interface Rajan// Incomplete method
{
    void money();
}

interface Rannii// Incomplete method
{
    void money();
}

class Charan implements Rajan,Rannii{
    @Override
    public void money(){ // Complete method
        System.out.println("Child has to Pay the money");
    }
}

