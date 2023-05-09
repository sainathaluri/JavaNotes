package MethodReference;

interface Says{
    void say();
}

public class Reference {
    public void saySomething(){
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
        Reference methodReference = new Reference();

        Says sayable = methodReference::saySomething;

        sayable.say();

        Says sayable2 = new Reference()::saySomething;

        sayable2.say();
    }
}
