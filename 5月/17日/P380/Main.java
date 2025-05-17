interface Browser {
    default void browser(){
        System.out.print("Browsing..");
    }
}
class MobilePhone implements Browser{
    public void call(){
        System.out.print("Calling..");
    }
    public void browse(){
        System.out.print("Just scrolling..");
    }
}
class Laptop implements Browser{}

public class Main{
    public static void main(String[]args){
        Browser br = new MobilePhone();
        //Browser br = new Browser(); これはダメ。インターフェース単体ではインスタンス化できない。
        br.browser();
        br = new Laptop();
        br.browser();
        MobilePhone mp = (MobilePhone)br;
        mp.call();
    }
}