package org.example.inheritance;

class SuperClass {
    void methodSuper() {
        System.out.println("I am a super class method");
    }
}

// Inheriting SuperClass to SubClass
class SubClass extends SuperClass {
    void methodSubclass() {
        System.out.println("I am a sub class method");
    }
}
