package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Java");
        p.setAge(28);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
