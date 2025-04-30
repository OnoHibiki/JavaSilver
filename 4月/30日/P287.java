
class A {
    A() {System.out.println("class A");}
}

class B extends A {
    B() {System.out.println("class B");}
}

class C extends B {
    C(){System.out.println("class C");}
}

class P287{
    public static void main(String[] args) {new C();}
} 



