public class Main{
    public static void main(String[]args){
        char[] chars = new char[]{'A','P','P','L','E'};
        int value = 0;
        for(char c : chars){
            value += switch(c) {
                case 'A': yield 1;
                case 'P' : yield 2 ;
                default: yield 3;
            };

            //System.out.println(value);
        }
        System.out.println(value);
    }
}