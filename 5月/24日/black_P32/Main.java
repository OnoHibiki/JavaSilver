public class Main {
    public static void main(String[]args){
        int val = 7;
        bool flg = true; // boolなんてものはない。boolean(ラッパークラス)
        if(flg == true){
            do{
                System.out.println(val);
            } while (val > 10);
        }
    }
}