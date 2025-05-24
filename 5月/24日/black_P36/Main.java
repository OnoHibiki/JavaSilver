public class Main{
    static String str = "これは、static変数を代入したstr";
    public static void main(String[]args){
        String str = "hoge,world";//不変
        hello(str);
        System.out.println(str);//これは、ローカル変数のstr
    }
    private static void hello(String msg){//voidです
        msg.replaceAll("hoge", "hello");
        System.out.println(str);//ここからアクセスできるのは、static変数のstr
        System.out.println(msg);//replaceAllは置換結果を返すため、出力に反映させるには
        System.out.println(msg = msg.replaceAll("hoge", "hello"));//変数うへの代入が必要
    }
}