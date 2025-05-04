import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(1); scores.add(2); scores.add(null);
        scores.add(3,3);
        scores.set(4, 10);//ここがだめ。この段階でインデックス４の要素はないから。
        System.out.println(scores);
    }
}