public class Main{
    int a, b;
    public Main(int a, int b){
        init(a,b);
    }
    public void init(int a, int b){
        this.a = a * b;
        this.b = b * b;    
    }
    public static void main(String[]args){
        int a = 2,b = 3;
        Main s = new Main(a,b);
        System.out.println(a + "," + b);
    }
}