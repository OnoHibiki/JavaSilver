public class Main{
    public static void main(String[]args){
        String[] array ={"A","B","C"};
        for(String str : array){
            str = "D";
        } 

        for(String str : array){//上の参照とは別
            System.out.println(str);
        }
    }
}

//拡張for文は、結果表示用と考えるのがベスト。