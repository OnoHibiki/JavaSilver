import java.util.List;

public class Main{
    public static void main(String[]args){
        List list = List.of("A","B","C","D","E","F","G","H");
        for(int index = 0 ; index < list.size();index++){
            System.out.print(list.get(index));
            if(index > 2){
                if (index % 2 == 1) index++;
            }
            
        }
    }
}