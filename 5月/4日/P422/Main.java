public class Main {
    public static void main(String[]args){
        try(ResourceSample resource = new ResourceSample()){
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch : " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}

class ResourceSample implements AutoCloseable {
    //tryの後に自動的に呼ばれるclose()をオーバーライド
    @Override public void close() throws Exception{
        System.out.println("close()");
        throw new Exception("Exception!"); //あえて例外をスロー
    }
}