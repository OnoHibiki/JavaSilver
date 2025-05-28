public class Main{
    public static void main(String[]args){
        String[] array = {"A","B"};
        for(String a : array){
            for(String b : array){
                if("B".equals(b))
                    break;
                System.out.print(b);

            }
        }
    }
}

//こんなfor文ネスト実際に誰が書くねん