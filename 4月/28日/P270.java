
class P270 {
    private int id = 100;
    public void printItem() {
        System.out.println("Item id : " + id);
    }
}

class Clothes extends P270{ //サブクラス

    private String brand = "Java";
    public void printClothes(){
        System.out.println("Clothes brand: " + brand);
        //System.out.println("Item id : " + id);　×
        //スーパークラスだったとしても、private変数にはアクセスできない
    }

}

class Main {
    public static void main(String[] args){
        Clothes c = new Clothes();
        c.printItem();
        c.printClothes(); //サブクラスのメソッド
    }
}