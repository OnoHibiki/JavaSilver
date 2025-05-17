import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[]args){
        Map<String, String> map = new HashMap<>();
        //map.add("UK","United Kingdom");//addメソッドはない。putのみ。
        //map.add("DE","Germany");//addメソッドはない。putのみ。
        //map.add("FR","France");//addメソッドはない。putのみ。
        map.put("UK","United Kingdom");
        map.put("DE","Germany");
        map.put("FR","France");
        System.out.println(map);
    }
}