public class Main {
    public static void main(String[]args){
        int v = 0, w = 0;
        for(String s : args){
            v += ++w + Integer.parseInt(s);
        }

        System.out.println(v);
    }
}