public class Main{
    public static void main(String[]args){
        int a = 100, b = 20, c = 30;
        System.out.println(a % b * c + a / b); //0乗算が発生するが、別に例外ではない。
    }
}