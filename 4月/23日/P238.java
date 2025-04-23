import java.util.Arrays;

public class P238 {
    public static void main(String[] args){
        int[]array = {1,2,3};
        P238 obj = new P238();
        obj.methodB(array);
        System.out.println("P238() array : " + Arrays.toString(array));
    }    

    public void methodB(int[] ary){
        ary[1] = 5;
        System.out.println("methodB() ary : " + Arrays.toString(ary));
    }
}
