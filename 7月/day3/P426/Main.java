public class Main{
    static int num = 23;
    public static void main(String[]args){
        int num = num ;//ダメです　Main.numならOK
        System.out.println(num);
    }
}