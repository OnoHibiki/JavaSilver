public class Main {
    public static void main(String[]args){
        int[] array = {10,20,30,40,50,60};
        int count = array.length;
        while(count > 1){
            count--;
            System.out.println(array[--count]);
        }
    }
}