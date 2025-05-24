public class Main{
    public static void main(String[]args){
        String str = "hoge,world";//不変
        hello(str);
        System.out.println(str);
    }
    private static void hello(String msg){//voidです
        msg = msg.replaceAll("hoge", "hello");
        //System.out.println(str);
        System.out.println(msg);
    }
}