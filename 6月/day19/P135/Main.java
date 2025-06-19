public class Main{
    public static void main(String[]args){
        for(int i=0,j=0;i < 3 , j < 5;i++ ){
            System.out.println(i++);
            j += i ;
        }
    }
}

//条件式を複数指定する場合は、,ではなく&&