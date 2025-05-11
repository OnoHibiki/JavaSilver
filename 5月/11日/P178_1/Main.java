public class Main {
    public static void main(String[]args){
        char[] chars = {'a','b','c','d','e','f'};
        int a = 0, b = 1;
        for(a = chars.length - b; a > b; a -= 2){
            System.out.print(chars[a]);
        }
    }
}