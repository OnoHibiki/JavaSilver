interface Browser{
    default void browse(){
        System.out.println("Browsing..");
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
    public static void main(String[] args){
        Browser br = new MobilePhone();
        br.browse();
        br = new Laptop();
        br.browse();
        MobilePhone mp = (MobilePhone)br;//依存関係がないためキャスト不可
        mp.call();
    }
}