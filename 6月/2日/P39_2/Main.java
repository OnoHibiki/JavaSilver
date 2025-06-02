public class Main{
    public static void main(String[]args){
        String str = "abcde";
        System.out.println(str.substring(1,3).startsWith("b"));
    }
}

//startsWithメソッド、あんまり親しみないよね。
//引数が二つのオーバーロードもある。boolean startsWith(String prefix, int toffset)　※toffsetはindex
