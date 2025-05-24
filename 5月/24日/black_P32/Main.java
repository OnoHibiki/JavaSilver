public class Main {
    public static void main(String[]args){
        int val = 7;
        //bool flg = true; // boolなんてものはない。boolean(ラッパークラス)
        boolean flg = true;
        if(flg == true){
            do{//do whileなので一度実行される。
                System.out.println(val);
            } while (val > 10);//false
        }
    }
}