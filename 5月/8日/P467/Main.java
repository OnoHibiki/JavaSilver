public class Main{
    void method(){
        var x = "Java SE 17";
        var y = new StringBuilder("Java").append("17");
        var v = x.substring(8);
        var z = y.substring(4,6);
        int i = x.equals(y) ? 1 : v.equals(z) ? 2 : 0 ;
        System.out.println(i);
    }

    public static void main(String[]args){
        this.method();//staticメソッドにthisはないのと、staticメソッドからインスタンスメソッドを直接アクセスできない（インスタンスを通してなら可能）
        
        //new Main().method();←なら可能
    }
}