public class Main{
    public static void main(String[]args){
        try{
            String s = null;
            int i1 = s.length();
            int i2 = Integer.parseInt(s);
        } catch(NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}

//catchしないと異常終了。catchしていると、正常終了
//出てくるエラーは同じでも、終わり方が違う