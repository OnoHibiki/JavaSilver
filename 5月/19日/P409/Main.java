public class Main{
    public static void main(String[]args){
        for(int i = 0 ; i < 3; i++){
            System.out.println("### LOOP" + (i + 1) + " ###");
            
            try{
                System.out.println("try - " + args[i]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(" catch - " + e.getMessage());
            }finally {
                System.out.println(" finally");
            }
            
        }
    }
}