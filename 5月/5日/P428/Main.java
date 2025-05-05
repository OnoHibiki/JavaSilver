import java.io.IOException;
public class Main {
    public static void main(String[]args){
        Main obj = new Main();
        try{
            obj.checkedA();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        obj.unchecked();
    }
    public void checkedA() throws IOException,ClassNotFoundException{
        checkedB();
    }
    public void checkedB() throws ClassNotFoundException{}
    public void unchecked() throws RuntimeException{}
}