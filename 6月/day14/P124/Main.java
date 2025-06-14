public class Main{
    public static void main(String[]args){
        Object a = new Object();
        Object b = null;
        System.out.println(a.equals(b));//オーバーライドしない場合、nullとの比較は一律でfalse
    }
}