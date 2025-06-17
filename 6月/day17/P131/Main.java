public class Main{
    public static void main(String[]args){
        int a = 3;
        String result = switch(a){
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> "D";
        }//そう、ここにセミコロンが必要。
         //swithc「式」は非常にややこしい。   
        System.out.println(result);
    }
}