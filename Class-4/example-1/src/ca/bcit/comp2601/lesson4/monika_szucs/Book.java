package ca.bcit.comp2601.lesson4.monika_szucs;

class A {
    A() {
        super();
        System.out.println("making A");
    }
}

abstract class B extends A {
    B() {
        super();
        System.out.println("making B");
    }
}

class C extends B {

    C() {
        super();
        System.out.println("making C");
    }
}

class D {
    public static void main(String[] args) {
        C c = new C();
    }
}
