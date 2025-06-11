public class Main{
    public static void main(String[]args){
        int a = 3;
        int b = a += 5;//ここでaの値も変わっている
        System.out.println(a + b);
    }
}