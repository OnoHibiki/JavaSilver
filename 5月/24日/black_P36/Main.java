public class Main{
    public static void main(String[]args){
        String str = "hoge,world";//不変
        hello(str);
        System.out.println(str);
    }
    private static void hello(String msg){//voidです
        msg.replaceAll("hoge", "hello");
        System.out.println(str);
        System.out.println(msg);//replaceAllは置換結果を返すため、出力に反映させるには
        System.out.println(msg = msg.replaceAll("hoge", "hello"));//変数うへの代入が必要
    }
}