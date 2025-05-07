public class Item {
    private String name;
    void Item(){ //voidのため、System.out.printに値を返せず、コンパイルエラーになる
        name = "Something";
    }
    public Item(String name){
        name = name; // なんならここも、変数に代入しているだけ
    }
    public String toString(){
        return " Item:" + name;
    }

    public static void main(String...args){
        System.out.print(new Item());//3行目を呼ぶが、戻り値は返ってこない、、、
        System.out.println(new Item("Coffee"));
    }
}