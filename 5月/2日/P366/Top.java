
public class Top {
    int x = 1;
    int y = 2;
}

class Middle extends Top{
    double x = 3.5; //これのせいでTopのxは隠される
    public void update(){
        //x = 40;
        super.x = 40;
    }
}

class Bottom extends Middle {
    public void update(){
        super.update();
        y = 50;
    }
}

class Main {
    public static void main(String[]args){
        Middle obj = new Bottom();
        obj.update();
        System.out.println(obj.x + ":" + obj.y);
    }
}