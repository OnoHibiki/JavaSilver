public class Main{
    public static void main(String[]args){
        try{
            Object obj = null;
            System.out.println(obj.toString());
            System.out.println("A");
        }finally{
            System.out.println("C");
        }catch(NullPointerException e){
            System.out.println("C");
        }
}

//この順番はダメです