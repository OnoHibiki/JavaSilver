public class Main {
    public static void main(String[]args){
        try {
            execute(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void execute(int value) throws ValueTooLargeException,ValueTooSmallException{
        try{
            if(value < 0){
                throw new ValueTooSmallException("Too small");
            } else if(value > 100) {
                throw new ValueTooLargeException("Too large!");//これがくる
            } else {
                System.out.println("Valid");
            }
        } catch(Exception e){
            throw e;
            //throw e = new Exception();
        }
    }
}

class ValueTooSmallException extends Exception{
    public ValueTooSmallException(String message){
        super(message);
    }
}

class ValueTooLargeException extends Exception{
    public ValueTooLargeException(String message){
        super(message);
    }

}