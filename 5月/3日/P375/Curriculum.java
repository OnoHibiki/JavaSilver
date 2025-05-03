
public record Curriculum(String name, String level) {}

class Main{
    public static void main(String[]args){
        Curriculum obj1 = new Curriculum("English", "intermediate");
        Curriculum obj2 = new Curriculum("Programming", "Advanced");
        //obj1.name = "Japanese"; //レコードクラスのフィールドは全てprivateかつfinalのため、他クラスからのアクセス、値の代入ができない
        System.out.println(obj1);
        String val = obj2.name() + "," + obj2.level();
        System.out.println("obj2:" + val);
    }
}
