package Polymorphism;

public class MethodOverriding {
    void print(){
        System.out.println("parent class");
    }
}
class childOne extends MethodOverriding{
    void print(){
        System.out.println("child One");
    }
}

class childTwo extends MethodOverriding{
    void print(){
        System.out.println("child Two");
    }
}