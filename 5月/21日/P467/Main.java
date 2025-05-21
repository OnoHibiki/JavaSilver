public class Main{
    void method(){
        var x = "Java SE 17";
        var y = new StringBuilder("Java").append("17");
        //var v = y.substring(8); //Java17は6文字なので、ここで例外発生。
        var v = y.substring(5);
        
        var z = x.substring(4,6);
        int i = x.equals(y) ? 1 : v.equals(z) ? 2 : 0;
        System.out.println(i);
    }

    public static void main(String[]args){
        //this.method();//staticメソッド内ではthisは使えない。インスタンス参照を通してアクセする必要がある
        new Main().method();
    }
}