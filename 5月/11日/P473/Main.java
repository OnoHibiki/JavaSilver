public class Main {
    public static void main(String[]args){
        int i = 2;
        do{
            i++;
            if(i % 2 == 0) continue;
            System.out.print(++i);
        }while(i++ < 10);
    }
}