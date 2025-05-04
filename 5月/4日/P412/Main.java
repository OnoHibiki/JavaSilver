public class Main{
    public static void main(String[]args){
        int i1 = 0;
        int i2 = 0;

        try{
            i1 = args[0].length();
            i2 = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println(i1 + i2);
    }
}