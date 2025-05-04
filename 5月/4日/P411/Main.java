public class Main{
    public static void main(String[]args){
        try {
            String s = null;
            int i1 = s.length();
            int i2 = Integer.parseInt(s);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("nullはIntegerにできません");
        }finally{
            System.out.println("終了しました");
        }
    }
}

//例外処理の順番に注意