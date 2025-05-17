import java.util.ArrayList;

record Item(int no,String name){}

public class Main{
    public static void main(String[]args){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1,"Laptop"));
        items.add(new Item(2,"Mobile"));
        items.add(new Item(2,"Phone"));
        for(Item i : items){
            System.out.print(i.no() + ", ");
        }
        System.out.println(items.set(1, new Item(3,"Smartwatch")));
    }
}