interface Eatable{ //インターフェース
    void showCalories(); // 暗黙的にpublic abstract-------------------
}
class Item{//スーパークラス
    String name;
    Item(String name){ this.name = name;}
}

class Food extends Item implements Eatable{// 実装クラス/サブクラス
    private int calories;
    public Food(String name , int calories){
        super(name);
        this.calories = calories;
    }
    //@Override
    //void showCalories(){ //public指定しないとエラーになる ”(public)より弱いアクセス権限を割り当てようとしました”
      //System.out.println(name + ": " + calories + "kcal/100g");
    //}
    
    @Override
    public void showCalories(){ //public指定必須----------------------
        System.out.println(name + ": " + calories + "kcal/100g");
    }
}
public class Main {
    public static void main(String[]args){
        Food f = new Food("Chocolate" , 500);
        f.showCalories();
    }
}