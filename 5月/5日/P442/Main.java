import java.io.*;
public class Main {
    public static void main(String[] args){
        Resource r1 = new Resource("r1");
        try(r1; Resource r2 = new Resource("r2");){
            System.out.println("try ");
        } catch (IOException e) {
            System.out.println("IOException ");
        }
    }
}

class Resource implements Closeable{
    String name;
    public Resource(String name){
        this.name = name;
    }

    public void close() throws IOException{
        System.out.println(name + ":close()");
        throw new IOException();
    }
}