public class Main {
    public static void main(String[]args){
        String[] array = {"A ","B "};
        for(final String s : array){
            s += s.toLowerCase(); //finalは変えられない
            System.out.print(s);
        }
    }
}