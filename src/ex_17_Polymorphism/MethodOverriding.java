package ex_17_Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();// Dog class function will execute
    }

}

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
    class Dog extends Animal
    {
        @Override
        void sound() { // Overriding the sound function which is used in Animal class
            System.out.println("Bark!");
        }
    }
