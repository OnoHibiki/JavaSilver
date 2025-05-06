import java.util.*;
public class Main{
    static int x = 1;
    public static void main(String[]args){
        int[][] a = new int[2][];
        a[0] = new int[1];
        a[1] = new int[3];
        a[0][0] += ++x;
        a[1][1] = a[0].length;//配列の長さを返す
        a[1][2] = x++;
        System.out.println(Arrays.toString(a[0]) + ":" + Arrays.toString(a[1]));
    }
}