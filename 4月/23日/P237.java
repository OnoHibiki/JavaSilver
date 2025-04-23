public class P237 {
    public static void main(String[] args){
        int val1 = 100;
        int val2 = val1;
        val2 = 200;
        P237 m = new P237();
        m.methodA(val2);
        System.out.println("val1 : " + val1);
        System.out.println("val2 : " + val2);

    }
    public void methodA(int val3) {
        val3 += val3;
        System.out.println("val3 : " + val3);
    }
}