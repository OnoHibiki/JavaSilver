public class Main {
    public static void main(String[]args){
        for (int i = 0 ; i < 2;){
            i++;;
            int j;
            for(j = 0; j < i ; j++){
            }
            System.out.print(j + " ");
        }
        System.out.println(":" + i); // スコープ外のためエラー
    }
}