import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Object[] oArr = {"100",new String("200"),300};
        String[] sArr = {"100","200","300"};
        int value = Arrays.mismatch(sArr,oArr);
        System.out.println(value);
    }
}