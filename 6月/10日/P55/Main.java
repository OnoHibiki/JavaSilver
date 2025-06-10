import java.util.ArrayList;

public class Main{
    public static void main(String[]args){

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String str : list){
            if("B".equals(str)){
                list.remove(str);
            }else{
                System.out.println(str);
            }
        } 
    }
}

//これはややこしい。removeは、後の要素が前に来るので、Bを消した段階でその位置にCがくる。