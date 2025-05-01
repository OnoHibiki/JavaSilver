
public record Sample(int x,int y) {
    //private double a = 100;
    private static double b = 200.0;
    public double calc() {return x + y ; }
    public static double getB() {return b ;}
    
    @Override
    public int x() {return x;}
    //@Override
    //double a(double z) {return 1.0;}

    @Override
    public String toString() {
        return "Sample record... x:" + x + ",y:" + y;
    }
}

class Main {
    public static void main(String[] args){
        Sample s = new Sample(10,20);
        System.out.println("s.calc():" + s.calc());
        System.out.println("Sample.getB():" + Sample.getB());
        System.out.println("s.x():" + s.x());
        System.out.println(s);
    }
}