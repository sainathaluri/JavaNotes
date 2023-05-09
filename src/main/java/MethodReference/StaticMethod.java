package MethodReference;

interface Sayable{
    void say();
}
public class StaticMethod {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
        Sayable sayable = StaticMethod::saySomething;

        sayable.say();
    }
}
