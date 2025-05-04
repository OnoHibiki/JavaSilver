import java.io.*;
public class Main {
    public static void main(String[]args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("test.txt");
            fw.write("try-catch-finally");
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}