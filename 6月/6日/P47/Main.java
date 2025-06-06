public class Main{
    public static void main(String[]args){
        Item[] item = new Item(3); //Itemクラスにintを引数に取るコンストラクタはないためエラーになる。
        int total = 0 ;
        for(int i = 0 ; i < item.length; i++){
            total += item[i].price;
        }
        System.out.println(total);
    }
}