public class Main{
    public static void main(String[]args){
        try{
            int[] array = {};//なにもないところに、入れることはできない
            array[0] = 10;
            System.out.println("finish");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
    }
}