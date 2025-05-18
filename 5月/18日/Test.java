interface Foo{
    default void x(){
        System.out.println("Foo#x()");
    }
    default void y(){
        System.out.println("Foo#y()");
    }
}
class Test implements Foo{
    @Override
    public void x(){
        System.out.println("Test#()");
    }
    public static void main(String[]args){
        Test t = new Test();
        t.x();
        t.y();
    }
}