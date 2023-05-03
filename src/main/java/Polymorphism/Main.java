package Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculation.addtion(8, 7));
        System.out.println(Calculation.addtion(8.2, 2.9));

        //method over riding

        MethodOverriding testcase = new childOne();
        testcase.print();

        MethodOverriding testcase1 = new childTwo();
        testcase1.print();
    }
}
