public class Item{
    private String name;
    void Item(){
        name = "Something";
    }
    public Item(String name){
        name = name;
    }
    public String toString(){
        return "Item:" + name;
    }

    public static void main(String ...args){
        //System.out.println(new Item()); 引数なしのコンストラクタはないためNG
        System.out.println(new Item("Coffee"));
    }
}