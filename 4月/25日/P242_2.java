public class P242_2 {
    private String name;
    public String getName() {return name;}
    public void setName(String name){this.name = name;}    
}


//インスタンス化を行う正しい記述はどれ？

// 1.new Product() = null 　×左辺は変数名じゃないとダメ
// 2.Product p = new Product(); ○基本的なインスタンス化の記述
// 3.Product p ; p = new Product(); ○これもいいらしい
// 4.Product p,p = new Product(); ×複数宣言はできるが、オブジェクト変数名が両方pのためダメ
// 5.Product p = new Product.setName("Test");　×セッターだが、p = と使うと、voidを代入するって感じになるため×
// Product p = new Product();
// p.setName("Test");  なら○
