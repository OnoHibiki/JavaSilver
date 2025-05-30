public class Main{
    public static void main(String[]args){
        if(false)//この処理が行われることは、未来永劫ない。
        System.out.println("A");//{}がない時、ifの範囲は１行下まで。
        System.out.println("B");
    }
}

