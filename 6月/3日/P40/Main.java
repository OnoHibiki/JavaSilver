public class Main{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.capacity());
    }
}

//StringBuilderは、デフォルトで16byte?容量を持っている。