public class Main {
    public static void main(String[]args){
        String s = "s";
        try{
            System.out.println(s.length()); return;
        } catch (RuntimeException e){
            System.out.println(" catch"); return;
        } finally{
            System.out.println(" finally");//finallyは必ず実行される
        }
    }
}