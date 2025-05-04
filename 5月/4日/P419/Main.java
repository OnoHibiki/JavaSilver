import java.io.*;
public class Main{
    public static void main(String[]args){
        try(FileWriter fw = new FileWriter("test.txt")){
            fw.write("try-with-resources");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}