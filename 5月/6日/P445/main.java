import java.io.*;
public class main{
    public static void main(String[]args){
        try {
            test();
        } catch (Exception ex){
            System.out.println("Exception! ");
        }
    }

    static void test() throws FileNotFoundException{
        try{
            try{
                throw new RuntimeException();
            }catch (RuntimeException e){
                System.out.println("RuntimeException! ");
            }
            throw new FileNotFoundException("FileNotFoundException! ");
        } catch (IOException e){
            System.out.println("IOException! ");
        }
    }
}