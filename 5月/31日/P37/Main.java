public class Main{
    public static void main(String[]args){
        String str = "hoge,world.";
        hello(str);
        System.out.println(str);
    }
    private static void hello(String msg){
        msg.replaceAll("hoge", "hello");//元のstrを変更しているわけではない。しかも、返すだけなのでmsgの値は結局変わっていない。
        System.out.println(msg);//しかも、返すだけなのでmsgの値は結局変わっていない。
        System.out.println(msg.replaceAll("hoge", "hello"));//こうすれば置き換えた値を出力できる。
    }
}