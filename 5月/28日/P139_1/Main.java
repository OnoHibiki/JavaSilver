public class Main{
    public static void main(String...args){
        String[] array = {"A","B","C"};
        for(String str : array){
            str = "D";
        }
        for (String str : array){
            System.out.println(str);
        }
    }
}

//Javaの拡張For文は、読み取り用として考えよう！！