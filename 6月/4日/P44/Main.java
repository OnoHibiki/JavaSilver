public class Main{
    public static void main(String[]args){
        String a = "sample";
        String b = "sample";
        System.out.print(a == b);
        System.out.print(",");
        System.out.println(a.equals(b));
    }
}

//newで宣言しない限り、==でもTrueがかえる