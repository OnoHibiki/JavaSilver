public class Main{
    public static void main(String...args){
        try{
            String s = null;
            int i1 = s.length(); //ここでNullPointerExceptionがスローされる
            int i2 = Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("NumberFormatExceptionがスロー");
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("NullPointerExceptionがスロー");
        }
    }
}