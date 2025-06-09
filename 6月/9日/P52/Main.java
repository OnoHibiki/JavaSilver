import java.util.ArrayList;

public class Main{
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add(2,"B"); //ここのせいで実行時例外
        list.add("C");
        list.add("D");
        for (String str : list){
            System.out.print(str);//実際にエラーとして出るのはここ
        }
    }
}


//nullはやっかい。