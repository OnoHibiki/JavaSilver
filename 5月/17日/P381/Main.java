import java.util.ArrayList;
public class Main{
    public static void main(String...args){
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(1); scores.add(2);scores.add(null);//null可能
        scores.add(3,3);
        scores.add(4,10);
        System.out.print(scores);
    }
}