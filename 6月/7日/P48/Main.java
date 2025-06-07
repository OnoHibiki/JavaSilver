public class Main{
    public static void main(String[]args){
        String[]array = {"A","B","C","D"};
        array[0] = null;
        for (String str : array){
            System.out.print(str);
        }
    }
}


//null渡し可能（オブジェクト型と認識される）
//Stringにキャストしたりするとダメ。