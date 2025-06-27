public class Main{
    public static void main(String[]args){
        try{
            System.out.println("A");
        }finally{
            System.out.println("B");
        }finally{
            System.out.println("C");
        }
    }
}

//finallyの意味がわかれば間違わない。