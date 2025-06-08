public class Main{
    public static void main(String[]args){
        String[][] array = {{"A","B"},null,{"C","D","E"}};
        int total = 0;
        for(String[]tmp : array){
            total += tmp.length; //nullをlengthに渡すことは不可能
        }
        System.out.println(total);
    }
}