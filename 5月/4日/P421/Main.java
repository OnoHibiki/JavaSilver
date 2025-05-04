public class Main {
    public static void main(String[]args){
        try(FirstResource r1 = new FirstResource();
            SecondResource r2 = new SecondResource();){
                System.out.println("try");
            } finally {
                System.out.println("finally");
            }
    }
}

class FirstResource implements AutoCloseable {
    @Override public void close(){
        System.out.println("FirstResource#close()");
    }
}
class SecondResource implements AutoCloseable {
    @Override public void close() {
        System.out.println("SecondResource#close()");
    }
}