public class Main{
    public static void main(String...args){
        Top[] array = { new Top(), new Bottom()};
        for(Top t:array){
            t.showInfo();
            t.print();
            System.out.print(t.value + ": ");
        }
    }
}

class Top{
    int value = 10;
    String name = " top ";
    static void showInfo() {System.out.print("T");}
    void print() {System.out.print(name);}
}

class Bottom extends Top{
    int value = 90;
    String name = " bottom " ;
    static void showInfo(){System.out.print("B");}
    void print() {System.out.print(name);}
}
