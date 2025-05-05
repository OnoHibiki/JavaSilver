public class Main {
    public static void main(String[]args){
        try{
            int a = 10,b = 0;
            int result = a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() + ":" + a + ":" + b);//スコープ外。コンパイルエラー
        }
    }
}