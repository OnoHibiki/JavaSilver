public class Main{
    public void method(int num){
        if(num < 0) return;
        System.out.println("A");
        return;
        System.out.println("B");//未到達エラー
    }
}