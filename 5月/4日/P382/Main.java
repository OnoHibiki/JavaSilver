import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[]args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1,3);
        System.out.println(numbers.remove(1));
    }
}