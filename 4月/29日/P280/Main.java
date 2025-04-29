
class Super {
    int x = 1;
    static int y = 2;
    void instMethod(){
        System.out.println("Super#instMethod()");
    }

    static void statMethod() {
        System.out.println("Super#statMethod()");
    }
}

class Sub extends Super {
    double x = 1.0 ;
    static double y = 2.0;
    /*static*/ void instMethod() {
        System.out.println("Sub#instMethod()");
    }

    static void statMethod() {
        System.out.println("Sub#statMethod()");
    }
    
}

public class Main {
    public static void main(String[] args){
        //Sub obj = new Sub();
        Super obj = new Sub();
        System.out.println("instance filed - obj.x : " + obj.x);
        System.out.println("static field - Super.y : " + Super.y + " | Sub.y : " + Sub.y);
        Super.statMethod();
        Sub.statMethod();
        obj.instMethod();
    }    
}
