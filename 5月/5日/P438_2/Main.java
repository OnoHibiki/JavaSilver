public class Main {
    public static void main(String[]args){
        int[] values = {1,2,3,4};
        try {
            disp(values);
            System.out.println(" try-end");//ここは実行されない
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" catch");
        } finally{
            System.out.println(" finally");
        }
    }
    public static void disp(int[] x){
        for (int i = 0 ; i <= 4 ; i++){
            System.out.println(x[i]);
        }
    }
}