public class Main{
    public static void main(String[]args){
        int value = 0x000B;
        if(value <= 0)
            System.out.print("value: " + value + 2 + 10);
        else if(value > 0 && value < 10)
            System.out.print("value " + value * 2 + 10);
        else if(value >= 10 & value<20)
            System.out.println("value: " + value - value); //文字列との連結の際、計算は不可
            //System.out.println("value: " + (value - value)); //文字列との連結前であれば可能。
        else
            System.out.println("value: " + value + value);
    }
}