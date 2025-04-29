
public class P273 {}
class Y extends P273 {}
class Super{
    P273 method(int a, String b) { return new P273();}
}

class Sub extends Super {
    @Override
    Y method(int a,String b){return new Y();}
}

class Sub2 extends Super {
    @Override
    public P273 method(int a , String b) {return new P273();}
}
