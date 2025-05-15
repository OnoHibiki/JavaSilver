public record Curriculum(String name,String level){}
class Main{
    public static void main(String...args){
        Curriculum obj1 = new Curriculum("English", "intermediate");
        Curriculum obj2 = new Curriculum("Programming", "Advance");
        //obj1.name = "Japanese";//暗黙的にfinalなのでここでエラー
        System.out.println(obj1);
        String val = obj2.name() + "," + obj2.level();//recordクラスのゲッター
        System.out.println("obj2:" + val);
    }
}