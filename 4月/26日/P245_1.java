
public class P245_1 {
    private int id;
    private String name;
    public P245_1(){
        this(2,"Book");
    }

    public P245_1(int id, String name) {
        id = id; //thisがない
        name = name; //thisがない

    }

    public void display() {
        System.out.print(id + ":" + name + " ");
    }

    public static void main (String[]args){
        new P245_1(1,"Apple").display();
        new P245_1().display();
    }

}
