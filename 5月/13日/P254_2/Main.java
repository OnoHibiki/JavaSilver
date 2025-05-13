public class Main{
    public static void main(String...args){
        Item obj1 = new Item();
        Item obj2 = new Item();
        method(obj1);
        obj1 = new Item();
        obj2 = null ;
    }

    public static void method(Item obj){
        obj = new Item();
    }
}

class Item{}