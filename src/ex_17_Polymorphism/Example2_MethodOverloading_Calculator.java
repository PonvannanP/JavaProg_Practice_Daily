package ex_17_Polymorphism;

public class Example2_MethodOverloading_Calculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(2, 6);
        c1.add(2.5, 3.5, 4.5);


    }
}

    class Calculator {


        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b, double c) {
            return a + b + c;
        }
    }

