public record Item(int id,String name){}
class Main{
    public static void main(String[]args){
        Item item1 = new Item(100,"T-shirt");
        Item item2 = new Item(200,"Jeans");
        System.out.println("item1.id():" + item1.id());
        System.out.println("item1.name():" + item1.name());
        System.out.println("item1.equals(item2):" + item1.equals(item2));
        System.out.println("item1.hashCode():" + item1.hashCode());
        System.out.println("item1.toString():" + item1.toString());
    }
}