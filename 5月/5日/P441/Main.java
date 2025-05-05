public class Main {
    public static void main(String[]args){
        try(MyResource resource = new MyResource()){
            System.out.println("A");
        } finally {
            System.out.println("B");
        }
    }
}

class MyResource /*implements AutoCloseable*/{
    public MyResource(){
        System.out.println("C");
    }
    public void close(){
        System.out.println("D");
    }
}