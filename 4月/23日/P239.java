public class P239 {
    public static void main(String[] args) {
        Item item1 = new Item("Tシャツ");
        Item item2 = item1;
        item2.name = "ジーンズ";

        System.out.println("item1,item2 : " + item1.name + "," + item2.name);
        System.out.println("item1 == item2 : " + (item1 == item2));
    }
}

class Item {
    String name; //コンストラクタ
    Item(String name) {this.name = name;}
}
