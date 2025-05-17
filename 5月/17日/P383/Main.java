import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[]args){
        Map<String, String> map = new HashMap<>();
        map.add("UK","United Kingdom");//addメソッドはない。putのみ。
        map.add("DE","Germany");//addメソッドはない。putのみ。
        map.add("FR","France");//addメソッドはない。putのみ。
        System.out.println(map);
    }
}