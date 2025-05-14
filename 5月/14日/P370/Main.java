class Parent{
    private static void methodA(){
        System.out.println("static Parent methodA()");
    }
    private void methodB(){
        System.out.println("Parent#methodB()");
    }

}
class Child extends Parent{
    public static void methodA(){
        System.out.println("static Child methodA()");
    }
    public void methodB(){
        System.out.println("Child#methodB()");
    }
}
public class Main{
    public static void main(String[]args){
        Parent obj = new Child();
        Child.methodA();
        obj.methodB(); //privateメソッドには、同クラス内からのみアクセスできる
    }
}