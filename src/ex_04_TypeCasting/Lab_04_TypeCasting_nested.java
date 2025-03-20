package ex_04_TypeCasting;

public class Lab_04_TypeCasting_nested {
    public static void main(String[] args) {
        int number =10;//condition//?satisfied//:Not satisified
        String lang = number>5 ? (number<10?"number>10":"number<=10"): "number<5";
        System.out.println(lang);
    }
}
