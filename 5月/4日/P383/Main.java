import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[]args){
        Map<String,String> map = new HashMap<>();
        map.add("UK","United Kingdom");//addはない。putです
        map.add("DE","Germany");
        map.add("FR","France");
        System.out.println(map);
    }
}